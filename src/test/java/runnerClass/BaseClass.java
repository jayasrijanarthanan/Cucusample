package runnerClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	@Before
	public static void launch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@After
	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Testng\\Screenshot\\Scre.jpeg");
		FileUtils.copyFile(source, dest);
		System.out.println("screen");
		
	}


	public static void url(String link) {
		driver.get(link);
	}

	public static void user(String user) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(user);
	}

	public static void pass(String Pass) {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(Pass);
	}

	public static void submit() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
