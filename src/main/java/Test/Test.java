package Test;import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class Test extends Base{

	public static void main(String[] args) throws InterruptedException {
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//a[@href='/products']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("men");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

	}

}
