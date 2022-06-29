package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    @BeforeClass
    public void setPathVariable() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

//    @BeforeMethod
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
}