package etsy.PageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import etsy.PageElements.ScrollDownPageLocators;
import etsy.utilities.SetupDrivers;

public class ScrollDownPageActions {
	
	
		private ScrollDownPageLocators scrollLocator;
	
		
		public ScrollDownPageActions() {
		this.scrollLocator = new ScrollDownPageLocators();
		PageFactory.initElements(SetupDrivers.driver, scrollLocator);
		
		}
	
		public void scrolltoBottom() {
			WebDriver driver = new ChromeDriver();
			SetupDrivers.driver.get("https://www.etsy.com/");
			SetupDrivers.driver.manage().window().maximize();
			SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			
		}	
			
		public void clickHelpBtn() throws Exception{	
			
			Thread.sleep(5000);
			scrollLocator.ClickHelp.click();
			
		}
	
}
	
	
