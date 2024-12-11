package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchTest {

    @Test
    public void testGoogleTitle() {
        System.setProperty("webdriver.chrome.driver", "/Users/akhilreddyv/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        assertEquals("Google", driver.getTitle());

        driver.quit();
    }
}
