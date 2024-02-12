package com.groupid.getting_started_test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Browser {
    private WebDriver driver;

    public WebDriver invoke_browser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/com/groupid/getting_started_test/drivers/geckodriver");
            driver = new FirefoxDriver();
            
        } else{
            throw new IllegalArgumentException("Unsupported Browser: " + browserName);
        }

        return driver;
    }

    public WebDriver invoke_browser_wd_options(String browserName){
        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
                
        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions options  = new FirefoxOptions();
            options.addArguments("--headless=new");
            System.setProperty("webdriver.gecko.driver", "src/test/java/com/groupid/getting_started_test/drivers/geckodriver");
            driver = new FirefoxDriver(options);
        }

        return driver;
        }

    @Test
    public void browserNameTest() {
        driver = invoke_browser("chrome");
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    public void browserTest(){
        driver = invoke_browser_wd_options("chrome");
        driver.get("https://toolsqa.com/selenium-webdriver/run-selenium-test/");
        System.out.println(driver.getCurrentUrl());
    }
}
