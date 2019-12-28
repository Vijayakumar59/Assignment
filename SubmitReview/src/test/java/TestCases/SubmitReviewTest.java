package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.SubmitReviewPage;

public class SubmitReviewTest extends TestBase{

	@Test
	public void init() throws Exception {
		
//		driver.get("https://www.tripadvisor.in/);
		SubmitReviewPage reviewpage = PageFactory.initElements(driver,SubmitReviewPage.class);
		reviewpage.ClickOnSearchBox();
		Thread.sleep(3000);
		reviewpage.SendValue("CLUB MAHINDRA");
		Thread.sleep(3000);
		reviewpage.SearchButtonClick();
		Thread.sleep(3000);
		reviewpage.SelectFirstName();
		reviewpage.SwitchToNewWindow();
		Thread.sleep(3000);
		reviewpage.ScrollDown();
		Thread.sleep(3000);
		reviewpage.WriteReview();
		Thread.sleep(3000);
		reviewpage.SwitchToChildWindow();
		Thread.sleep(3000);
		
		
	}
	
}
