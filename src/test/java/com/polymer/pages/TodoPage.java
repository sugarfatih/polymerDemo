package com.polymer.pages;


import com.polymer.utilities.BrowserUtils;
import com.polymer.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TodoPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @FindBy(css = "[id='new-todo']")
    public WebElement todoInput;

    @FindBy(css = "[id='edit']")
    public WebElement todoItemEdit;

    public void createTodoItem(String todo) {
        wait.until(ExpectedConditions.elementToBeClickable(todoInput));
        todoInput.click();
        todoInput.sendKeys(todo, Keys.ENTER);

    }

    public void editTodoItem(String currentTodo, String newTodo) {
        String dynamicLocator = "//label[contains(text(),'" + currentTodo + "')]";
        WebElement current = Driver.get().findElement(By.xpath(dynamicLocator));
        BrowserUtils.doubleClick(current);

        wait.until(ExpectedConditions.elementToBeClickable(todoItemEdit));
        todoItemEdit.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        todoItemEdit.sendKeys(newTodo);
        todoItemEdit.sendKeys(Keys.ENTER);

    }

    public boolean isTodoElementVisible(String todoText) {
        String dynamicLocator = "//label[contains(text(),'" + todoText + "')]";
        return Driver.get().findElement(By.xpath(dynamicLocator)).isDisplayed();
    }
}



