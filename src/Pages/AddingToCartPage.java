package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AddingToCartPage {
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created

	public AddingToCartPage(WebDriver driver) {
		
		this.driver=driver;
	
	}

	//Locators for the page title and the logout button
	By heading = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By cartBtn = By.id("//*[@id=\"shopping_cart_container\"]/a");
	By cartItem = By.xpath("//*[@id=\"inventory_container\"]/div/div");
	
	
	//Method to capture the page heading
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	
	
	//Method to click on cart button

	public void addCheapestToCart() {
		//count the items on the cart
		List<WebElement> elements = driver.findElements(cartItem);
		int elementsCount = elements.size();
				
				
		//loop all cart to find and add the cheapest to cart
		for (int i = 0; i < elementsCount; i++) {
			  String price =  driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div["+ i +"3]/div[2]/div[2]/div")).getText();
			 if(price =="$7.99") {
				 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div["+ i +"]/div[2]/div[2]/button")).click();
			 }
			  
		}
		
	}
	
	public void goToCart() {
		driver.findElement(cartBtn).click();
		
	}

}
