package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestCase1 extends Base{
	@Test(priority = 0)
	public void scenario_1() throws InterruptedException, IOException {
		ExtentTest test1 = extent.createTest("Automation Exercise E-commerce Application", "Test Case 1");
	    test1.log(Status.INFO, "Test Case 1");
	    Thread.sleep(1000);	
	    String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Verify Home Page: Automation Exercise");
        
	    Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		test1.log(Status.PASS, "Click Product Menu");
		
		/////////////////na 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("men");
		test1.log(Status.PASS, "Set Search Option Men");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		test1.log(Status.PASS, "Click Search Button");
		
		String expectedTitle2 = "Automation Exercise - All Products";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle2);
        System.out.println("Test Pass");
	}

}
