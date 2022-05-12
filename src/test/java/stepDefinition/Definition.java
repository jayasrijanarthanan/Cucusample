package stepDefinition;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.en.*;

import runnerClass.BaseClass;

public class Definition extends BaseClass {
	@Given("BrowserLaunch")
	public void browserlaunch() {
	    BaseClass.launch();
	}

	
	
	@Given("Open the URL {string}")
	public void open_the_URL(String url) {
		BaseClass.url(url);

	}

	@When("Enter Username {string}")
	public void enter_Username(String user) {
		BaseClass.user(user);

	}

	@When("Enter Password {string}")
	public void enter_Password(String pass) {
		BaseClass.pass(pass);

	}

	@Then("Click")
	public void click() throws InterruptedException, IOException {
		BaseClass.submit();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Testng\\Screenshot\\Scre.jpeg");
		FileUtils.copyFile(source, dest);
		System.out.println("screen");

	}

}
