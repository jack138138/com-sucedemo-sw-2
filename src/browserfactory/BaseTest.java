package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * BaseUrl = https://www.saucedemo.com/
 * 1. Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup
 * code inside the class ‘Base Test’.
 * 2. Create the package ‘testsuite’ and create the
 * following class inside the ‘testsuite’ package.
 * 1. LoginTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValid
 * Credentials
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify the text “PRODUCTS”
 * 2. verifyThatSixProductsAreDisplayedOnPage
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify that six products are displayed
 * on page
 */

public class BaseTest {

    public static WebDriver Mydriver;

    public void openBrowser(String MyUrl){
        //setup Chrome
        Mydriver = new ChromeDriver();
        //setup url
        Mydriver.get(MyUrl);

        //Maximize window
        Mydriver.manage().window().maximize();
        //setup implicity time
        Mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    public void closeBrowser (){
        Mydriver.quit();
    }


}
