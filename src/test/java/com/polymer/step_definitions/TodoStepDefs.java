package com.polymer.step_definitions;

import com.polymer.pages.MainPage;
import com.polymer.pages.TodoPage;
import com.polymer.utilities.ConfigurationReader;
import com.polymer.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.*;

public class TodoStepDefs {
    public static String newTodoText = "";
    List<String> todoItemTextList = new ArrayList<>();


    @Given("the user is in the main page")
    public void theUserIsInTheMainPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user clicks {string} tab")
    public void userClicksTab(String tabName) {
        new MainPage().selectTab(tabName);
    }

    @And("user clicks {string}")
    public void userClicks(String subElementName) {
        new MainPage().selectSubElement(subElementName);
    }

    @And("user creates to do items as below")
    public void userCreatesToDoItemsAsBelow(List<String> todos) {

        for (String todo : todos) {
            todoItemTextList.add(todo);
            try {
                new TodoPage().createTodoItem(todo);

            } catch (NoSuchElementException e) {
                System.out.println(e);
            }
        }
    }

    @And("user edit {string} as {string}")
    public void user_edit_as(String currentTodo, String newTodo) {
        new TodoPage().editTodoItem(currentTodo, newTodo);
        newTodoText = newTodo;
    }

    @Then("Todo item updated successfully")
    public void todo_item_updated_successfully() {
        Assert.assertTrue(new TodoPage().isTodoElementVisible(newTodoText));
    }

    @Then("Todo items created successfully")
    public void todo_items_created_successfully() {
        for (String text: todoItemTextList ){
           Assert.assertTrue(new TodoPage().isTodoElementVisible(text));
        }

    }
}
