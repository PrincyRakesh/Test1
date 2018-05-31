import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssertionClass {
	public static WebDriver driver;
	public static String WEB_URL="https://tuclothing.sainsburys.co.uk/";
	public static By DETAILS_BUTTON=(By.cssSelector(".details"));
	public static By EXPECTED_SEARCH_RESULT=(By.cssSelector(".productResultsContainer h1"));
	public static By EXPECTED_ERROR=(By.cssSelector(".title_holder h1"));
	public static By REGISTER_LINK=By.linkText("Tu Log In / Register");
	public static By USER_NAME=By.cssSelector("#j_username");
	public static By USER_PASSWORD=By.cssSelector("#j_password");
	public static By TU_MAINBUTTON=By.cssSelector(".tuButton.loginButtonMain");
	public static By ACCOUNT_PAGE=By.cssSelector(".logged_in");
	public static By INVALID_LOGIN=By.cssSelector(".information_message.negative");
	public static By FORGOTTEN_PASSWRD=(By.linkText("Forgotten your password?"));
	public static By REQUIRED_BUTTON=(By.cssSelector(".required"));
	public static By ORANGE_BUTTON=(By.cssSelector(".orange"));
	public static By FORGOTTEN_TEXT=By.cssSelector(".title_holder h2");
	public static By FORGOTTEN_EMAIL=By.cssSelector("#validEmail h2");
	public static By TU_BUTTON=(By.cssSelector(".tuButton.regToggle"));
	public static By EMAIL_ID=(By.cssSelector("#register_email"));
	public static By REGISTER_TITLE=(By.cssSelector("#register_title"));
	public static By FIRST_NAME=(By.cssSelector("#register_firstName"));
	public static By LAST_NAME=(By.cssSelector("#register_lastName"));
	public static By NEW_PASSWORD=(By.cssSelector("#password"));
	public static By CHECK_PASSWORD=(By.cssSelector("#register_checkPwd"));
	public static By TERMS_CONDITION=(By.name("termsAndConditions"));
	public static By REGISTER_BUTTON=(By.cssSelector(".registerButton"));
	public static By CONTENT_CONTAINER=(By.cssSelector(".content-container h2"));
	public static By INSPIRE_ME = (By.linkText("Inspire Me"));
	public static By SUIT_BOOT = (By.linkText("Suited and booted"));
	public static By TU_SALE = (By.linkText("Sale"));
	public static By TU_FB = (By.linkText("Facebook"));
	public static By TU_STORE = (By.linkText("Tu Store Locator"));
	public static By TEXT_BOX = (By.cssSelector(".form.search"));
	public static By TITLE_BUTTON = By.cssSelector(".simple_disp-img");
	public static By PRODUCT_SIZE = (By.cssSelector("#productVariantSize"));
	public static By PRODUCT_QUANTITY = (By.cssSelector("#productVariantQty"));
	public static By CART_BUTTON = (By.cssSelector("#AddToCart"));
	public static By PRODUCT_SEARCH=(By.cssSelector("#search"));
	public static By SEARCH_BUTTON = (By.cssSelector(".searchButton"));
	public static By CHECKOUT_BUTTON = (By.cssSelector(".doCheckoutBut.tuButton"));
	public static By BASKET_BUTTON = (By.cssSelector("#basketButtonBottom"));
	public static By GUEST_EMAIL=By.cssSelector("#guest_email");
	public static By CHECK_OUT = (By.cssSelector(".button.orange"));
	public static By CUSTOMER_OPTION = (By.cssSelector(".customer-options--item"));
	public static By CENTRE_BUTTON = (By.cssSelector(".center.button.orange"));
	public static By STORE_LOCATOR = By.cssSelector("#storelocator-query");
	public static By STORE_FINDER = (By.cssSelector("#storeFinder"));
	public static By POST_CODE=By.cssSelector(".customer-options--cta");
	public static By CONTINUE_TO_PAYMNT= By.cssSelector(".button.orange.center");
	

	@Before
	public void Start() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prinz/OneDrive/Documents/Automation/Driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(WEB_URL);
		driver.manage().window().maximize();
       Assert.assertEquals("Tu clothing",driver.getTitle());
	}
	
	
	
	@Test
	public void guestCheckOut() throws InterruptedException {
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.findElement(PRODUCT_SEARCH).clear();
		driver.findElement(PRODUCT_SEARCH).sendKeys("tops");
		driver.findElement(SEARCH_BUTTON).click();
		Assert.assertEquals("Search results for 'tops'", driver.findElement(EXPECTED_SEARCH_RESULT).getText());

		Thread.sleep(3000);
		driver.findElements(DETAILS_BUTTON).get(11).click();
		Select dropdown = new Select(driver.findElement(PRODUCT_SIZE));
		dropdown.selectByIndex(5);
		Thread.sleep(3000);
		Select dropdowns = new Select(driver.findElement(PRODUCT_QUANTITY));
		dropdowns.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#AddToCart")).click();
		Thread.sleep(3000);
		driver.findElements(CHECKOUT_BUTTON).get(0).click();
		Thread.sleep(3000);
		driver.findElement(BASKET_BUTTON).click();
		driver.findElement(GUEST_EMAIL).clear();
		driver.findElement(GUEST_EMAIL).sendKeys("Annmariya2@gamil.com");
		Thread.sleep(3000);
		driver.findElements(CHECK_OUT).get(1).click();
		driver.findElements(CUSTOMER_OPTION).get(0).click();
		driver.findElement(CENTRE_BUTTON).click();
		Thread.sleep(3000);
		driver.findElement(STORE_LOCATOR).sendKeys("Rg14");
		driver.findElement(STORE_FINDER).click();
		Thread.sleep(3000);
		driver.findElements(POST_CODE).get(0).click();
		driver.findElements(CONTINUE_TO_PAYMNT).get(1).click();	
		Assert.assertEquals("Order total", driver.findElement(By.cssSelector(".checkout-summary-total")).getText());
	}
//		@Test
//		public void searchwithValidData() {
//			
//			driver.findElement(PRODUCT_SEARCH).clear();
//			driver.findElement(PRODUCT_SEARCH).sendKeys("tops");
//			driver.findElement(SEARCH_BUTTON).click();
//		    Assert.assertEquals("Search results for 'tops'", driver.findElement(EXPECTED_SEARCH_RESULT).getText());
//   }
//		@Test
//		public void searchwithInvalidData() {
//		
//
//			driver.findElement (PRODUCT_SEARCH) .clear();
//			driver.findElement(PRODUCT_SEARCH).sendKeys("xrgdfyg");
//			driver.findElement(SEARCH_BUTTON).click();
//			Assert.assertEquals("Sorry, no results for 'xrgdfyg'", driver.findElement(EXPECTED_ERROR).getText());
//		
//		}
//@Test
//
//public void goBackToTheTitle() {
//	driver.findElement(PRODUCT_SEARCH).clear();
//	driver.findElement(PRODUCT_SEARCH).sendKeys("tops");
//	driver.findElement(SEARCH_BUTTON).click();
//	Assert.assertEquals("Search results for 'tops'", driver.findElement(EXPECTED_SEARCH_RESULT).getText());
//	driver.findElement(TITLE_BUTTON).click();
//	Assert.assertEquals("Tu clothing", driver.getTitle());
//}
//	@Test
//	
//	public void AddToBasket() throws InterruptedException {
//		driver.get(WEB_URL);
//		driver.findElement(PRODUCT_SEARCH).clear();
//		driver.findElement(PRODUCT_SEARCH).sendKeys("tops");
//		driver.findElement(SEARCH_BUTTON).click();
//		Thread.sleep(3000);
//		driver.findElements(DETAILS_BUTTON).get(3).click();
//		Select dropdown=new Select(driver.findElement(PRODUCT_SIZE));
//		dropdown.selectByIndex(2);
//		Thread.sleep(3000);
//		Select dropdowns=new Select(driver.findElement(PRODUCT_QUANTITY));
//	    dropdowns.selectByIndex(2);
//	    Thread.sleep(3000);
//	    driver.findElement(By.cssSelector("#AddToCart")).click();
//	}
//	
//
//		@Test
//		public void searchwithBlankData() {
//		driver.findElement (PRODUCT_SEARCH) .clear();
//		driver.findElement(PRODUCT_SEARCH).sendKeys();
//		driver.findElement(SEARCH_BUTTON).click();
//		Assert.assertEquals("Please complete a product search", driver.findElement(By.cssSelector("#search-empty-errors")).getText());
//		}
//	
//		@Test
//		public void tuInspireMe() {
//			driver.get(WEB_URL);
//			driver.findElement(INSPIRE_ME).click();
//			driver.findElement(SUIT_BOOT).click();
//			//driver.navigate().to("https://tuclothing.sainsburys.co.uk/");
//		}

//				@Test
//		
//			public void tuSale() {
//				driver.get(WEB_URL);
//				driver.findElement(TU_SALE).click();
//				Assert.assertEquals("Sale", driver.findElement(By.cssSelector(".title h1")).getText());
//			}
	
//		@Test
//		public void loginWithValidData() {
//			driver.findElement(REGISTER_LINK).click();
//			driver.findElement(USER_NAME).clear();
//			driver.findElement(USER_NAME).sendKeys("toccsubjectgmail.com");
//			driver.findElement(USER_PASSWORD).clear();
//			driver.findElement(USER_PASSWORD).sendKeys("London19");
//			driver.findElement(TU_MAINBUTTON).click();
//		Assert.assertEquals("Hello Neha Das", driver.findElement(ACCOUNT_PAGE).getText());
//			
//			
//		}
//	@Test
//	 public void loginwithInValidData() {
//		driver.findElement(REGISTER_LINK).click();
//	     driver.findElement(USER_NAME).clear();
//		driver.findElement(USER_NAME).sendKeys("dtfyg@gmail.com");
//		driver.findElement(USER_PASSWORD).sendKeys("Abcd12345");
//		driver.findElement(TU_MAINBUTTON).click();
//		Assert.assertEquals("Please check the fields below and try again", driver.findElement(INVALID_LOGIN).getText());
//
//	}
//	@Test
//	public void tuSoreLocator() {
//		driver.findElement(TU_STORE).click();
//		Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector(".storeLocator h2")).getText());
//		driver.findElement(By.name("q")).sendKeys("Rg14");
//		driver.findElement(TEXT_BOX).click();
//		Assert.assertEquals("Your nearest stores", driver.findElement(By.cssSelector("#header1")).getText());
//	}
//
//
//@Test
//public void forgottenPassword() throws InterruptedException {
//	driver.findElement(REGISTER_LINK).click();
//	driver.findElement(USER_NAME).clear();
//    driver.findElement(USER_NAME).sendKeys("toccsubject@gmail.com");
//    driver.findElement(FORGOTTEN_PASSWRD).click();
//    Thread.sleep(3000);
//    Assert.assertEquals("Forgotten Tu password", driver.findElement(FORGOTTEN_TEXT).getText());
//    driver.findElement(REQUIRED_BUTTON).sendKeys("toccsubject@gmail.com");
//    driver.findElement(ORANGE_BUTTON).click();
//    //Assert.assertEquals("Check your email", driver.findElement(FORGOTTEN_EMAIL).getText());
//}
//
//			@Test
//			public void tuFACEbook() {
//				driver.get(WEB_URL);
//				driver.findElement(TU_FB).click();
//				//Assert.assertEquals("Facebook", driver.getTitle());
//			}
//			
//				@Test
//				public void registerWithInvalidFunctions() throws InterruptedException {
//					driver.get(WEB_URL);
//					driver.findElement(REGISTER_LINK).click();
//					Thread.sleep(3000);
//					driver.findElement(TU_BUTTON).click();
//					driver.findElement(EMAIL_ID).clear();
//					driver.findElement(EMAIL_ID).sendKeys("toccsubjectgmail.com");
//					Thread.sleep(3000);
//					Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
//					dropdown.selectByVisibleText("Mrs");
//					driver.findElement(FIRST_NAME).clear();
//					driver.findElement(FIRST_NAME).sendKeys("1234567");
//					driver.findElement(LAST_NAME).clear();
//					driver.findElement(LAST_NAME).sendKeys("1234567");
//					driver.findElement(NEW_PASSWORD).clear();
//					driver.findElement(NEW_PASSWORD).sendKeys("1234567");
//					driver.findElement(CHECK_PASSWORD).clear();
//					driver.findElement(CHECK_PASSWORD).sendKeys("1234567");
//					driver.findElement(TERMS_CONDITION).click();
//					driver.findElement(REGISTER_BUTTON).click();
//					Assert.assertEquals("Please correct the errors below.", driver.findElement(By.cssSelector(".information_message.negative")).getText());
//				}	
//	@Test
//	public void registerWithvalidFunctions() throws InterruptedException {
//		driver.findElement(REGISTER_LINK).click();
//		Thread.sleep(3000);
//		Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".registerFormHolder h2")).getText());
//		driver.findElement(TU_BUTTON).click();
//		driver.findElement(EMAIL_ID).clear();
//		driver.findElement(EMAIL_ID).sendKeys("Daddiesmom@gmail.com");
//		Thread.sleep(3000);
//		Select dropdown=new Select(driver.findElement(REGISTER_TITLE));
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(FIRST_NAME).clear();
//		driver.findElement(FIRST_NAME).sendKeys("Neha");
//		driver.findElement(LAST_NAME).clear();
//		driver.findElement(LAST_NAME).sendKeys("Das");
//		driver.findElement(NEW_PASSWORD).clear();
//		driver.findElement(NEW_PASSWORD).sendKeys("London19");
//		driver.findElement(CHECK_PASSWORD).clear();
//		driver.findElement(CHECK_PASSWORD).sendKeys("London19");
//		driver.findElement(TERMS_CONDITION).click();
//		driver.findElement(REGISTER_BUTTON).click();
//		Assert.assertEquals("Thank you for registering with Tu", driver.findElement(CONTENT_CONTAINER).getText());
//	}
		@After
		public void Close() {
			
			//driver.close();
		}

}
