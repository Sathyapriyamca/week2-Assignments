package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {


  public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathyapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local Name");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CORE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Grow With Leaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathyapriyat3@gmail.com");
		WebElement ele=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select obj = new Select(ele);
		Thread.sleep(2000);
		obj.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("importantLead");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The tittle is :" +driver.getTitle());
		driver.close();
		
		
		
		
		
	}

}
