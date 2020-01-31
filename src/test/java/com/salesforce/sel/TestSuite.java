package com.salesforce.sel;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuite extends BaseClass {

    @Test
    public void logIn()
    {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("234");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        System.out.println(driver.findElement(By.id("error")).getText());
    }
}

