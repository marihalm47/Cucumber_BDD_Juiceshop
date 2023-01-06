package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Juiceshop_steps {
	static WebDriver driver =  new ChromeDriver();
	@Given("User registrater to Juice shop Application")
	public void user_registrater_to_juice_shop_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
       
        driver.get(" https://juice-shop.herokuapp.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);   
	}

	@Given("Dismiss the popup application")
	public void dismiss_the_popup_application() throws InterruptedException {
		//driver.findElement=By.xpath("//app-welcome-banner/div/div[2]/button[2][@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']");	      	        
	   driver.findElement(By.xpath("//app-welcome-banner/div/div[2]/button[2][@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();
	   driver.findElement(By.xpath("//*[text()='Me want it!']")).click();
	   Thread.sleep(2000);
	}

	@When("User navigate to Account information")
	public void user_navigate_to_account_information() throws InterruptedException {
	    
		 driver.findElement(By.xpath("//button[3]/span[1]/span")).click();
		Thread.sleep(1000);
		
	}

	@When("User clicks on Login button information")
	public void user_clicks_on_login_button_information() throws InterruptedException {		
	//	driver.findElement(By.xpath("//div[2]/div/div/div/button/span")).click();
		Thread.sleep(1000);  	 
		By Loginbtn=By.xpath("//div[2]/div/div/div/button/span");
		//login button click operation
		driver.findElement(Loginbtn).click();
		Thread.sleep(1000);
		
	}
	
	@When("yet another action button")
	public void yet_another_action_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[2]/a[contains(text(),'Not yet a customer?')]")).click();
		Thread.sleep(2000);  	   
	}

	@Then("User Registartion form should be displayed")
	public void user_registartion_form_should_be_displayed() {    	   
	}

	@When("Enter the user information")
	public void enter_the_user_information() throws InterruptedException {
		// email click operation
		driver.findElement(By.xpath("//div[2]/mat-form-field[1]/div/div[1]/div[3]/input[@id='emailControl']")).sendKeys("Cucumberbdds@gmail.com");
		Thread.sleep(1000);
		// password click operation
		driver.findElement(By.xpath("//div[2]/mat-form-field[2]/div/div[1]/div[3]/input[@id='passwordControl']")).sendKeys("Test@123");
		Thread.sleep(1000);
		// reapeat password click operation
		driver.findElement(By.xpath("//div[2]/mat-form-field[3]/div/div[1]/div[3]/input[@id='repeatPasswordControl']")).sendKeys("Test@123");
		Thread.sleep(3000);			
		//Security question
		driver.findElement(By.xpath("//div[2]/div[1]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
		Thread.sleep(1000);	
		WebElement element = driver.findElement(By.xpath("//mat-option[12]"));
		Actions action=new Actions(driver);
		action.scrollToElement(element).perform();
		element.click();
		Thread.sleep(1000);
		//answer of security question	
		driver.findElement(By.xpath("//div[2]/div[1]/mat-form-field[2]/div/div[1]/div[3]/input[@id='securityAnswerControl']")).sendKeys("talash");
		Thread.sleep(3000);   
	}

	@When("Clik on the submit button")
	public void clik_on_the_submit_button() throws InterruptedException {			
		driver.findElement(By.xpath("//div[2]/button/span[1][@class='mat-button-wrapper']")).click();
		Thread.sleep(2000);  	   
	}

	@When("User is login to Juice shop Application")
	public void user_is_login_to_juice_shop_application() {	    
	   
	}

	@When("Enter Login Credinetials Information")
	public void enter_login_credinetials_information() throws InterruptedException {
			//login information
		driver.findElement(By.xpath("//mat-form-field[1]//div[3]/input[@id='email']")).sendKeys("Cucumberbdd@gmail.com");
		Thread.sleep(1000);
		//Password information 
		driver.findElement(By.xpath("//mat-form-field[2]//div[3]/input[@id='password']")).sendKeys("Test@123");
		Thread.sleep(1000);
	   
	}

	@Then("Click on the Login button")
	public void click_on_the_login_button() throws InterruptedException {
	    
		//Login Button
		driver.findElement(By.xpath("//app-login//mat-card/div/button[1]")).click();
		Thread.sleep(3000);  
	}

	@When("User add the items to the cart")
	public void user_add_the_items_to_the_cart() throws InterruptedException {
	    
		
		//add to cart Button- item 1
	
		driver.findElement(By.xpath("//div[2]/button")).click();
		Thread.sleep(2000);
	}

	@When("Click on the checkout the items")
	public void click_on_the_checkout_the_items() throws InterruptedException {
	   
		driver.findElement(By.xpath("//mat-toolbar-row/button[4]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//app-basket/mat-card/button")).click();
		
		Thread.sleep(1000);
	}

	@Then("Add the New address details for the Shipment")
	public void add_the_new_address_details_for_the_shipment() throws InterruptedException {
	    
		driver.findElement(By.xpath("//mat-card/div/button")).click();
		Thread.sleep(1000);
		
		//Country
		driver.findElement(By.xpath("//input[@placeholder='Please provide a country.']")).sendKeys("India");
		Thread.sleep(1000);

		//Name Please provide a name.
		driver.findElement(By.xpath("//input[@placeholder='Please provide a name.']")).sendKeys("JuiceTest");
		Thread.sleep(1000);
		
		//MobileNumber
		driver.findElement(By.xpath("//input[@placeholder='Please provide a mobile number.']")).sendKeys("9838595925");
		Thread.sleep(1000);

		//ZipCode
		driver.findElement(By.xpath("//input[@placeholder='Please provide a ZIP code.']")).sendKeys("560040");
		Thread.sleep(1000);

		//Address
		driver.findElement(By.xpath("//textarea[@placeholder='Please provide an address.']")).sendKeys("Outer Ring Road");
		Thread.sleep(1000);

		//CityName
	
		driver.findElement(By.xpath("//input[@placeholder='Please provide a city.']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		
		//StateName
		
		driver.findElement(By.xpath("//input[@placeholder='Please provide a state.']")).sendKeys("Karnataka");
		Thread.sleep(1000);
	   
	}

	@Then("User submit the new address details for the shipment")
	public void user_submit_the_new_address_details_for_the_shipment() throws InterruptedException {


		driver.findElement(By.xpath("//mat-card/div[2]/button[2]")).click();
		Thread.sleep(1000);
		//Radio Button 

	   
	}

	@Then("Select the added address details")
	public void select_the_added_address_details() throws InterruptedException {
	    
		
		driver.findElement(By.id("mat-radio-40")).click();
		Thread.sleep(2000);
	}

	@Then("User Click on the continue button")
	public void user_click_on_the_continue_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//mat-card/button[@aria-label='Proceed to payment selection']")).click();
		Thread.sleep(2000);
	   
	}

	@Then("User Choose the delivery options")
	public void user_choose_the_delivery_options() throws InterruptedException {
	    
		
		
		driver.findElement(By.xpath("//mat-cell[1]/mat-radio-button[@id='mat-radio-42']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-card/div[4]/button[2]/span[1]")).click();
		Thread.sleep(2000);
		
	}

	@Then("Add the Card details")
	public void add_the_card_details() throws InterruptedException {
		//Add new card 
				driver.findElement(By.xpath("//mat-expansion-panel/mat-expansion-panel-header[@id='mat-expansion-panel-header-0']")).click();
				Thread.sleep(2000);
				
				//enter name for card
				driver.findElement (By.xpath("//mat-form-field[1]/div/div[1]/div[3]/input[@id='mat-input-16']")).sendKeys("myname");
				Thread.sleep(2000);
						
				//enter card number 
				
				driver.findElement (By.xpath("//mat-form-field[2]/div/div[1]/div[3]/input[@id='mat-input-17']")).sendKeys("2345698067234029");
				Thread.sleep(2000);
				
				
				//Expiry MOnth
					
				
				driver.findElement (By.xpath("//mat-form-field[3]/div/div[1]/div[3]/select[@id='mat-input-18']")).sendKeys("10");
				Thread.sleep(2000);

				//Expiry Year
				
				driver.findElement (By.xpath("//mat-form-field[4]/div/div[1]/div[3]/select[@id='mat-input-19']")).sendKeys("2081");
				Thread.sleep(2000);
				
				//Submit button 
				driver.findElement (By.xpath("//app-payment-method/div/div/mat-expansion-panel/div/div/button[@id='submitButton']")).click();
				Thread.sleep(2000);	
				
			
				driver.findElement (By.xpath("//mat-radio-button[@id='mat-radio-44']")).click();
				Thread.sleep(2000);		
	}

	@Then("Proceed to the Reviw Button")
	public void proceed_to_the_reviw_button() throws InterruptedException {
	    
		
		driver.findElement (By.xpath("//mat-card//div[2]/button[2][@aria-label='Proceed to review']")).click();
		Thread.sleep(1000);
	
	}

	@When("User clicks on the Place your Order and Pay to Reiview")
	public void user_clicks_on_the_place_your_order_and_pay_to_reiview() throws InterruptedException {

		driver.findElement (By.xpath("//mat-card/button[@id='checkoutButton']")).click();
		Thread.sleep(1000);
		
	}

	@Then("User is able to view the Order COnfrimation")
	public void user_is_able_to_view_the_order_c_onfrimation() {
	    
	   
	}


	
	
}
