package pageobjects;

import Basepackage.BaseTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.annotation.Nullable;

public class Sample extends BaseTest
{

    @Test(priority = 1)
    @Parameters("browser")
    public void testExample(String browser) throws InterruptedException {
        driver.get("https:facebook.com");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    @Parameters("browser")
    public void test2(String browser) throws InterruptedException {
        driver.get("https:/rahulshettyacademy.com");
        Thread.sleep(2000);
    }
}
