package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



    public class BrowserSetup extends BasePage {
        @Before
        public void OpenBrowser() {
            System.setProperty("webdriver.chrome.driver","src\\Resources\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/books");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL,"https://demo.nopcommerce.com/books");
            System.out.println("user sucssfulley Naviget to Book");

        }
        @After
        public void closeBrowser() {
            //driver.close();
        }
    }

