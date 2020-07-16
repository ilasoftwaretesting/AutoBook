package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuite extends BrowserSetup {
    Books books = new Books();

    @Test
    public void Books() {
        books.Books();
        String paymentsuccessfully = driver.findElement(By.cssSelector("div [class='section order-completed']")).getText();
        Assert.assertEquals(paymentsuccessfully, "Your order has been successfully processed!");
        System.out.println("payment successfully");
        String ordernumber = driver.findElement(By.cssSelector("div[class='order-number'] strong")).getText();
        Assert.assertEquals(ordernumber, "ORDER NUMBER: 1032");
        System.out.println("Thank you for order.");

    }

}