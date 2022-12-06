package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created

	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//Locators for the page title and the logout button
	By heading = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By chekoutBtn = By.xpath("//*[@id=\"basic-addon2\"]");
	By menuBtn = By.id("//*[@id=\"react-burger-menu-btn\"]");
	By logoutBtn = By.id("//*[@id=\"logout_sidebar_link\"]");
	
	//Locators for search field and search button
	
	//Method to capture the page heading
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	
	public void clickCheckOut() {
		driver.findElement(chekoutBtn).click();
	}
	
	//Method to click on Logout button
	public void clickLogout() {
		driver.findElement(menuBtn).click();
		driver.findElement(logoutBtn).click();
	}
}
