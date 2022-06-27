package com.saucedemo;

//import static org.junit.Assert.assertTrue;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {

    @Test
    public  void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\AutomationSaucedemo\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals( "Swag Labs", title );
    }

    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\AutomationSaucedemo\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println("Login page title:" +title);
        Assert.assertEquals( "Swag Labs", title );
        WebElement usernameField = driver.findElement(By.id("user-name"));
        boolean userFieldIsDisplayed = usernameField.isDisplayed();
        System.out.println("Check if UserName field is displayed: "+userFieldIsDisplayed);
        Assert.assertTrue(userFieldIsDisplayed);

        WebElement passwordField = driver.findElement(By.id("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();
        System.out.println("Check if password field is displayed: "+passwordFieldIsDisplayed);
        Assert.assertTrue(passwordFieldIsDisplayed);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        boolean loginBtnIsDisplayed = loginBtn.isDisplayed();
        System.out.println("Check if Login Button field is displayed: " +loginBtnIsDisplayed);
        Assert.assertTrue(loginBtnIsDisplayed);
    }

    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\AutomationSaucedemo\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals( "Swag Labs", title );

        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys( "standard_user");
        System.out.println("Username entered");

        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys( "secret_sauce");
        System.out.println("Password entered");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        System.out.println("Click on login Button Success");

        WebElement header = driver.findElement(By.className("title"));
        String headerText = header.getText();
        System.out.println("header text: "+headerText);
        Assert.assertEquals("PRODUCTS", headerText);

        //driver.close();


    }
}
