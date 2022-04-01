package com.practicetestng.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Orange {
	@Test
	private void myInfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TRB\\Testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
        WebElement myinf = driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[6]"));
		myinf.click();
		Actions hover = new Actions(driver);
		hover.contextClick().perform();
		WebElement edit = driver.findElement(By.xpath("(//input[@type='button'])[4]"));
		edit.click();
		WebElement firstnam = driver.findElement(By.id("personal_txtEmpFirstName"));
		firstnam.clear();
		WebElement firstname = driver.findElement(By.id("personal_txtEmpFirstName"));
		firstname.sendKeys("faloona!!");
		WebElement midnam = driver.findElement(By.id("personal_txtEmpMiddleName"));
		midnam.clear();
        WebElement lastnam = driver.findElement(By.id("personal_txtEmpLastName"));
		lastnam.clear();
		WebElement lastname = driver.findElement(By.id("personal_txtEmpLastName"));
		lastname.sendKeys("granulas22");
        WebElement edit1 = driver.findElement(By.id("btnSave"));
		edit1.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
        WebElement sel = driver.findElement(By.id("attachmentsCheckAll"));
		sel.click();
		Thread.sleep(3000);
		WebElement delet = driver.findElement(By.id("btnDeleteAttachment"));
		delet.click();
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
		Actions move = new Actions(driver);
		move.contextClick().perform();
        WebElement search = driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		search.sendKeys("faloona!! granulas22");
        WebElement stat = driver.findElement(By.id("searchSystemUser_status"));
        Select s2 = new Select(stat);
        s2.selectByIndex(1);
        WebElement search1 = driver.findElement(By.id("searchBtn"));
		search1.click();
        System.out.println("the given name is enabled");

	}

}
