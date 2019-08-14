import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Step {
	public WebDriver driver;
	public Properties p;
	@Given("when userenter valid url")
	public void when_userenter_valid_url() {
		 p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
	}

	@When("user enters valid username and pasword")
	public void user_enters_valid_username_and_pasword() {
		driver.findElement(By.xpath("username"))
		.sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd"))
		.sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[.='Login ']"))
		.click();

	}

	@Then("user shoulb in homepage")
	public void user_shoulb_in_homepage() {
		String actual=driver.getTitle();
		assertEquals("actiTIME -  Enter Time-Track", actual);
	    System.out.println("user in homepage");
	    driver.close();
	}



}
