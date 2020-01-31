package com.salesforce.sel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    WebDriver driver;

    @Before
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }
}
