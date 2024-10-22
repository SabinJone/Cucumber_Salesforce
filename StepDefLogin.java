package stepsdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	public ChromeDriver driver;

	@Given("Launch the browser and Load the URL")
	public void launch_the_browser_and_load_the_url() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	
	@When("Enter the Password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
	}

	@Then("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@Then("Click on the Toggle menu")
	public void click_on_the_toggle_menu() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
	    
	}

	@Then("Click on View All")
	public void click_on_view_all() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	    
	}

	@Then("Click on Sales")
	public void click_on_sales() {
		WebElement az=driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", az);
	    
	}

	@Then("Click on Oppurtunities tab")
	public void click_on_oppurtunities_tab() {
	    
		WebElement dd=driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", dd);
	}

	@Then("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	    
	}

	@Then("Enter the Opportunity name as {string}")
	public void enter_the_opportunity_name_as(String OpportunityName) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OpportunityName);
	    
	}

	@Then("Enter the Amount as {string}")
	public void enter_the_amount_as(String Amount) {
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(Amount);
	    
	}

	@Then("Choose the Close date as Today")
	public void choose_the_close_date_as_today() {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		driver.findElement(By.xpath("//button[text()='Today']")).click();
	    
	}

	@Then("Select stage as Need Analysis")
	public void select_stage_as_need_analysis() {
	    
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}

	@Then("Click on the Save button")
	public void click_on_the_save_button() {
	    
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();	
		
	}

	@Then("Verify the Opportunity Name")
	public void verify_the_opportunity_name() {
		String verify=driver.findElement(By.partialLinkText("Sabin Jone")).getText();
		if(verify.contains("Sabin Jone"))
		{
			System.out.println("Name verified successfully");
		}
		else
		{
			System.out.println("Name Not Found");
		}			

		
				}
	    
	}



