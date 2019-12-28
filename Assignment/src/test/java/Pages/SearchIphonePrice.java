package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchIphonePrice {
	
	 WebDriver driver; 
	 String fpkartPriceValue;
	 String AmazonPriceValues;
	 
	 
	 public SearchIphonePrice(WebDriver driver) {
		 this.driver = driver;
	 }
	 
//   Using FindBy for locating elements 
//	 flipkart
	 @FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _29YdH8']") WebElement Close;
	 @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for products, brands and more']") WebElement SearchPhone;
	 @FindBy(how = How.XPATH, using = "//button[@class='vh79eN']") WebElement ClickButton;
	 @FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"
	 		                        + "/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]") WebElement PriceValue;
	 
//	 Amazon
	 @FindBy(how = How.XPATH, using  = "//input[@id='twotabsearchtextbox']") WebElement AmazonSearchBox;
	 @FindBy(how = How.XPATH, using = "//div[@class='nav-search-submit nav-sprite']") WebElement AmazonSearchButton;
	 @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div[1]/div[1]"
				                       + "/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"
				                       + "/a[1]/span[1]/span[2]/span[2]") WebElement AmazonPriceValue;
	 
//	 Flipkart Methods 
	 public void flipkartSearchBox(String value) {
		 SearchPhone.sendKeys(value);
	 }
	 public void flipkartSearchButton() {
		 ClickButton.click();
	 }
	 public void flipkartClosebutton() {
			Close.click();
	 }
	 public void flipkartGetPriceValue() {
		String FlipkartPriceValue = PriceValue.getText();
		String fpkartPriceValue = FlipkartPriceValue.substring(1, 7);
		System.out.println(fpkartPriceValue); 
		
	 }
	 
//	 Amazon Methods
	 public void AmazonSearchValue(String str) {
	      AmazonSearchBox.sendKeys(str);		
	 }
		
	 public void AmazonButtonClick() {
			AmazonSearchButton.click();
	 }
	 public void AmazonSelectValue() {
			String AmazonPriceValues = AmazonPriceValue.getText();
			System.out.println(AmazonPriceValues);
			
	 }
	 
	 public void test() {
		 int i = Integer.parseInt(fpkartPriceValue);
		 int j = Integer.parseInt(AmazonPriceValues);
		 System.out.println(i);
		 if(i>j) {
			 System.out.println(i);
		 }else {
			 System.out.println(j);
		 }
		 
	 }
	 
     
}


