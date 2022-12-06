package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import Pages.AddingToCartPage;
import Pages.CheckOutPage;

public class OnlinePurchase {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "PageDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Adding to cart page
		AddingToCartPage addToCart = new AddingToCartPage(driver);
		
		//Creating object of cash out page
		CheckOutPage checkOut = new CheckOutPage(driver);
		
		//----------Login-----------------------------------------------------------------------------
		//Enter username & password
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		//---------adding to cart----------------------------------------------------------------------
		
		//Capture the page heading and print on console
		System.out.println("The page heading is --- " + addToCart.getHeading());
		
		//Perform search and display search string on console
		addToCart.addCheapestToCart();
		addToCart.goToCart();
		
		//------------check out------------------------------------------------------------------------
		System.out.println("The page heading is --- " + checkOut.getHeading());
		
		//CLick on Logout button
		checkOut.clickCheckOut();
		checkOut.clickLogout();
	}
}
