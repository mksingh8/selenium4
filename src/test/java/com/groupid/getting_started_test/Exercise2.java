package com.groupid.getting_started_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise2 {
    /*
     * Practice Exercise - 2

    Launch a new Chrome browser.
    Open ToolsQA Practice Automation Page for Switch Windows: https://demoqa.com/browser-windows/
    Use this statement to click on a New Browser Window button "driver.findElement(By.id("New Browser Window")).click();"
    Close the browser using close() command

You will notice that only one window will close. Next time use quit() command instead of close(). At that time selenium will close both the windows.
     */


     @Test
     public void windowClose(){

		// Create a new instance of the FireFox driver 
		WebDriver driver = new ChromeDriver(); 
		
		// Storing the Application Url in the String variable 
		String url = "https://demoqa.com/browser-windows/"; 
		
		//Launch the ToolsQA WebSite 
		driver.get(url); 
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        driver.close();

     }
}
