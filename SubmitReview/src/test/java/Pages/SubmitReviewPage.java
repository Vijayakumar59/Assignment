package Pages;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubmitReviewPage {

	WebDriver driver;
	
	public SubmitReviewPage(WebDriver driver) {
		this.driver = driver;
	}
	
//  Using FindBy for locating elements 
	@FindBy(how = How.XPATH,using = "//div[@class='brand-global-nav-action-search-Search__searchButton--b9-IK']") WebElement SearchElement;
	@FindBy(how = How.XPATH,using = "//input[@id='mainSearch']") WebElement EnterName;
	@FindBy(how = How.XPATH,using = "//button[@id='SEARCH_BUTTON']") WebElement ClickSearchButton;
	@FindBy(how = How.XPATH,using = "//span[contains(text(),'Club Mahindra Madikeri, Coorg')]") WebElement SelectSearchElement;
	@FindBy(how = How.LINK_TEXT,using = "Write a review") WebElement ClickWriteReviewButton;
	@FindBy(how = How.XPATH,using  = "//span[@id='bubble_rating']") WebElement ClickOnRating;
	@FindBy(how = How.XPATH,using  = "//input[@id='ReviewTitle']") WebElement TitleReview;
	@FindBy(how = How.XPATH,using  = "//textarea[@id='ReviewText']") WebElement YourReview;
	@FindBy(how = How.XPATH,using = "//div[@class='c-cell jfy_cloud tag content category-Business']") WebElement SelectSortTripName;
	@FindBy(how = How.XPATH,using = "//select[@id='trip_date_month_year']") WebElement SelectTravelDate;
	
	
	public void ClickOnSearchBox() {
		SearchElement.click();
        
	}
	public void SendValue(String name) {
		EnterName.sendKeys(name);
	}
    
	public void SearchButtonClick() {
		ClickSearchButton.click();
	}
	public void SelectFirstName() {
		SelectSearchElement.click();
//		System.out.println(driver.getTitle());
	}
	
	public void SwitchToNewWindow() {
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentwindowid = it.next();		
		String childwindowid = it.next();
		driver.switchTo().window(childwindowid);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	public void ScrollDown() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,3300)");
        
	}
	public void WriteReview() {
		ClickWriteReviewButton.click();
		System.out.println(driver.getTitle());
	}
	public void SwitchToChildWindow() {
		Set<String> handler1 = driver.getWindowHandles();
		Iterator<String> it = handler1.iterator();
		String parentwindowid1 = it.next();		
		String childwindowid1 = it.next();
		driver.switchTo().window(childwindowid1);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	public void FiveStarRating() {
		ClickOnRating.click();
	}
}
