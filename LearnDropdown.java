package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
	    WebElement ele= driver.findElement(By.id("dropdown1"));
	    Select  dd = new Select(ele);
	    dd.deselectByIndex(1);
	    dd.getOptions();
	    WebElement ele1= driver.findElement(By.name("dropdown2"));
	    Select  dd1= new Select(ele1);
	    dd1.selectByVisibleText("Appium");
	    WebElement ele2= driver.findElement(By.id("dropdown3"));
	    Select  dd2= new Select(ele2);
	   dd2.selectByIndex(3);
		

	}

}
