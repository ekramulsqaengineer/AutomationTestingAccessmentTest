package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestCase2 extends Base{
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority = 0)
	public void scenario_2() throws InterruptedException {
		ExtentTest test1 = extent.createTest("Automation Exercise E-commerce Application", "Test Case 2");
	    test1.log(Status.INFO, "Test Case 2");
	    
	    Thread.sleep(1000);	
	    String actualTitle1 = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle1,expectedTitle);
        System.out.println("Verify Home Page: Automation Exercise");
        test1.log(Status.INFO, "Verify Home Page");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
        test1.log(Status.INFO, "Click Blue Top Product");
       
        String actualTitle12 = driver.getTitle();
        String expectedTitle2 = "Automation Exercise - Product Details";
        Assert.assertEquals(actualTitle12,expectedTitle2);
        System.out.println("Automation Exercise - Product Details");
        test1.log(Status.INFO, "Verify Product Details");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='quantity']")).clear();
        test1.log(Status.INFO, "Clear Product Quantity");
        
        String productQty = "4";
       
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(productQty);
        test1.log(Status.INFO, "Set Product Quantity 4");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        test1.log(Status.INFO, "Click Add To Cart Button");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
        test1.log(Status.INFO, "Click View Cart Button");
       
        Thread.sleep(1000);
        String qty= driver.findElement(By.className("disabled")).getText();
        System.out.println(qty);
        if (qty.equals(productQty)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
        test1.log(Status.INFO, "Test Complite");
	}
	

}
