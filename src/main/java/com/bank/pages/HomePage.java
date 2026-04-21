package com.bank.pages;

import org.openqa.selenium.By;

import com.bank.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By username = By.name("email");
    private By password = By.name("pass");
    private By Login = By.xpath("//span[text()='Log in']");

    public void typeUsername(){
        type(username, "0705490178");
        pause(2000);
    }

    public void typePassword(){
        type(password, "Perroni");
        pause(2000);
    }

    public void clickLogin(){
        click(Login);
        pause(5000);
    }
}
