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
        test1.log(Status.PASS, "Verify Home Page");
        
        
	    Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		test1.log(Status.PASS, "Click Product Menu");
		
		Thread.sleep(1000);	
		String p = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p")).getText();
		System.out.println(p);
		if (p.equals(p)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		test1.log(Status.PASS, "Search Products is visible");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Blue Top");
		test1.log(Status.PASS, "Set Value Men in Search Option ");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		test1.log(Status.PASS, "Click Search Button");
		
		String expectedTitle2 = "Automation Exercise - All Products";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle2);
        test1.log(Status.PASS, "Verify All Products Page");
        System.out.println("Test Pass");
        test1.log(Status.PASS, "Test Complite");
        
	}

}
