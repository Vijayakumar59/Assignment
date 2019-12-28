package Test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.SearchIphonePrice;

public class SelectPriceValue extends TestBase {
	
	@Test()
	public void init() throws InterruptedException {
		
//		Flipkart
		driver.get("https://www.flipkart.com/");
		SearchIphonePrice iphonepricevalue = PageFactory.initElements(driver, SearchIphonePrice.class);
		iphonepricevalue.flipkartClosebutton();
		Thread.sleep(1000);
		iphonepricevalue.flipkartSearchBox("iphone xr 64gb yellow");
		iphonepricevalue.flipkartSearchButton();
		iphonepricevalue.flipkartGetPriceValue();
		
//		Amazon
		driver.get("https://www.amazon.in/");	
		iphonepricevalue.AmazonSearchValue("iphone xr 64gb yellow");
		iphonepricevalue.AmazonButtonClick();
		Thread.sleep(1000);
		iphonepricevalue.AmazonSelectValue();
		iphonepricevalue.test();
	}
	
}

