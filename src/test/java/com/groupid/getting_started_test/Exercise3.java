package com.groupid.getting_started_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise3 {
    /*
     * Practice Exercises for Selenium Navigation Commands
     * Practice Exercise
     * 
     * Launch new Browser
     * Open DemoQA.com website
     * Click on Registration link using
     * "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
     * Come back to Home page (Use 'Back' command)
     * Again go back to Registration page (This time use 'Forward' command)
     * Again come back to Home page (This time use 'To' command)
     * Refresh the Browser (Use 'Refresh' command)
     * Close the Browser
     * 
     */

    @Test
    public void navigationCommand() {

        WebDriver driver = new ChromeDriver();
        // Open ToolsQA web site
        String appUrl = "https://demoqa.com/";
        driver.get(appUrl);
        driver.manage().window().maximize();

        // Click on Registration link
        driver.findElement(By.xpath("//img[@class='banner-image']")).click();

        // Go back to Home Page
        driver.navigate().back();

        // Go forward to Registration page
        driver.navigate().forward();

        // Go back to Home page
        driver.navigate().to(appUrl);

        // Refresh browser
        driver.navigate().refresh();

        // Close browser
        driver.close();
    }
}
