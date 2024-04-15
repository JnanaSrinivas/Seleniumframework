package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class K
{
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web-staging.diathrive.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("neha.kedia@technoidentity.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@12345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Continue')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@data-testid='SidePannel-div-Entry4']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='ProductCatalog-TouchableOpacity-Tag1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='ProductCatalog-TouchableOpacity-Tag2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='CatalogProductCard-Pressable-CountIncrease']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='CatalogProductCard-Pressable-CountDecrease']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Add To Cart')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-testid='SearchFilterView-Input-Search']")).sendKeys("lab");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='SearchFilterView-TouchableOpacity-Close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='SearchFilterView-TouchableOpacity-Filter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='FilterProductsModal-View-FilterCategory1']/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='FilterProductsModal-View-FilterCategory2']/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid='FilterProductsModal-Button-Reset']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@data-testid='FilterProductsModal-Button-Apply']")).click();
//        Thread.sleep(2000);
        //driver.findElement(By.xpath("//svg[@data-testid='IconButton-Image-Icon']"));
        Thread.sleep(2000);
        driver.quit();

        // driver.get("https://www.amazon.in/search-google-com-Google-Search/product-reviews/B00SZDLGSO");
       // String count= driver.findElement(By.xpath("//span[contains(text(),'global ratings')]")).getText();
      // String c= count.charAt(count);

    }
}
