package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.Utils.utils.*;

public class Books extends Utils {

    private By clicksortDroplist=By.id("products-orderby");

    private By sortByDropList = By.cssSelector("select[id='products-orderby'] option:nth-child(2)");

    private By clickdisplay=By.id("products-pagesize");

    private By displayDropList = By.cssSelector("div [id='products-pagesize'] option:nth-child(1)");

    private By addtocart =By.cssSelector("div [class='buttons'] input:nth-child(1)");

    private By shoppingcart=By.cssSelector("li a[href='/cart']");

    private By tearmsservice=By.cssSelector("input[id='termsofservice']");

    private By checkout=By.id("checkout");

    private By checkoutguest=By.cssSelector("input[class='button-1 checkout-as-guest-button']");

    private By firstname=By.id("BillingNewAddress_FirstName");

    private By lastname=By.id("BillingNewAddress_LastName");

    private By email=By.id("BillingNewAddress_Email");

    private By adress=By.id("BillingNewAddress_Company");

    private By country=By.id("BillingNewAddress_CountryId");

    private By india=By.cssSelector("select[id='BillingNewAddress_CountryId'] option:nth-child(101)");

    private By city=By.id("BillingNewAddress_City");

    private By address1=By.id("BillingNewAddress_Address1");

    private By address2=By.id("BillingNewAddress_Address2");

    private By zipcode=By.id("BillingNewAddress_ZipPostalCode");

    private By phonenumber=By.id("BillingNewAddress_PhoneNumber");

    private By faxnumber=By.id("BillingNewAddress_FaxNumber");

    private By Continue = By.cssSelector("div[id='billing-buttons-container'] input");

    private By secondday=By.cssSelector("input[value='2nd Day Air___Shipping.FixedByWeightByTotal']");

    private By continue2=By.cssSelector("input[class='button-1 shipping-method-next-step-button']");

    private By creditcard=By.id("paymentmethod_1");

    private By continue3=By.cssSelector("input[class='button-1 payment-method-next-step-button']");

    private By selectcardtype=By.id("CreditCardType");

    private By visa=By.cssSelector("select[id='CreditCardType'] option:nth-child(1)");

    private By cardholdername=By.id("CardholderName");

    private By cardnumber=By.id("CardNumber");

    private By clickdate=By.id("ExpireMonth");

    private By selectdate=By.cssSelector("select[id='ExpireMonth'] option:nth-child(4)");

    private By clickyear=By.id("ExpireYear");

    private By selectyear=By.cssSelector("select[id='ExpireYear'] option:nth-child(4)");

    private By css=By.id("CardCode");

    private By continue4=By.cssSelector("input[class='button-1 payment-info-next-step-button']");

    private By confirm=By.cssSelector("input[class='button-1 confirm-order-next-step-button']");



    public void Books() {
        ClickOnElement(clicksortDroplist);

        ClickOnElement(sortByDropList);

        ClickOnElement(clickdisplay);

        ClickOnElement(displayDropList);

        waitForElementToBevisible(addtocart,20);

        ClickOnElement(addtocart);
        waitForElementToBevisible(addtocart,20);

        ClickOnElement(shoppingcart);

        waitForElementToBevisible(tearmsservice,20);

        ClickOnElement(tearmsservice);
        waitForElementToBevisible(checkout,20);

        ClickOnElement(checkout);

        waitForElementToBevisible(checkoutguest,20);


        ClickOnElement(checkoutguest);

        enterText(firstname,"Ala");

        enterText(lastname,"Bima");

        enterText(email,"abcde@gmail.com");

        enterText(adress,"Dndpvtltd");

        ClickOnElement(country);

        ClickOnElement(india);

        enterText(city,"Bhutiya");

        enterText(address1,"Harrow");

        enterText(address2,"5,Moorpark");

        enterText(zipcode,"123456");

        enterText(phonenumber,"1234567819");

        enterText(faxnumber,"1-234-567 8910");

        ClickOnElement(Continue);

        waitForElementToBevisible(secondday,20);

        ClickOnElement(secondday);

        ClickOnElement(continue2);

        waitForElementToBevisible(creditcard,20);

        ClickOnElement(creditcard);

        ClickOnElement(continue3);

        waitForElementToBevisible(selectcardtype,20);

        ClickOnElement(selectcardtype);

        ClickOnElement(visa);

        enterText(cardholdername,"Mrs R Moore");

        waitForElementToBevisible(cardnumber,20);

        enterText(cardnumber,"4235206630641431");

        waitForElementToBevisible(clickdate,20);

        ClickOnElement(clickdate);

        waitForElementToBevisible(clickdate,20);

        ClickOnElement(selectdate);

        ClickOnElement(clickyear);

        waitForElementToBevisible(selectyear,20);

        ClickOnElement(selectyear);
        waitForElementToBevisible(css,20);

        enterText(css,"574");

        ClickOnElement(continue4);

        waitForElementToBevisible(confirm,20);

        ClickOnElement(confirm);
    }
}
