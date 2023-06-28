package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {

    String MyUrl = "https://www.saucedemo.com/";

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        //open url
        openBrowser(MyUrl);

        //input credential (Username)
        Mydriver.findElement(By.id("user-name")).sendKeys("standard_user");
        //input credential (password)
        Mydriver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click on login button
        Mydriver.findElement(By.id("login-button")).click();
        // verify display message after login
        String expectedMessage = "Products";
        String actualMessage = Mydriver.findElement(By.xpath("//span[@class = 'title']")).getText();
        Assert.assertEquals("Error in Login", expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //verify total display product after login
        List<WebElement> productList = Mydriver.findElements(By.className("inventory_item_name"));
       // List<WebElement> productList = Mydriver.findElements(By.xpath("//div[@class = 'inventory_item']"));
        System.out.println("Total Products are Available : " + productList.size());
    }

    @After
    public void tearDown() {
   // closeBrowser();
    }
}