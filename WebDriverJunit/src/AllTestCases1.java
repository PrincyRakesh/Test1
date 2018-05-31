import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllTestCases1 {
	public static String WEB_URL = "https://tuclothing.sainsburys.co.uk/";
	public static By SEARCH_TEXTBOX = (By.cssSelector("#search"));
	public static By SEARCH_TEXT = (By.cssSelector("#search"));
	public static By SEARCHBOX_TEXT = (By.cssSelector(".searchButton"));
	public static WebDriver driver;
    public static By LINK_TEXT = (By.linkText("Tu Log In / Register"));
	public static By USER_NAME = (By.cssSelector("#j_username"));
	public static By USER_PASSWRD = (By.cssSelector("#j_password"));
	public static By LOGIN_MAIN = (By.cssSelector(".loginButtonMain"));
	public static By FORGOTTEN_PASSWORD = (By.linkText("Forgotten your password?"));
	public static By REQUIRED_BUTTON = (By.cssSelector(".required"));
	public static By ORANGE_BUTTON = (By.cssSelector(".orange"));
	public static By TU_HELP = (By.linkText("Tu Help"));
	public static By RETURNS_REFUND = (By.linkText("Returns & refunds"));
	public static By HERE_BUTTON = (By.linkText("here"));
	public static By COOKIE_POLICY = (By.linkText("cookie policy"));
	public static By CHECK_BOX = (By.cssSelector(".searchButton"));
	public static By DETAILS_BUTTON = (By.cssSelector(".details"));
	public static By BASE_STRING = (By.linkText("Tu Help"));
	public static By TEXT_LINK = (By.linkText("Refunds"));
	public static By SEARCH_BLOG = (By.cssSelector("#searchBlog"));
	public static By CONTACT_TU = (By.linkText("Contact Us"));
	public static By CUSTOMER_SERVICE = (By.linkText("TuCustomerservices@sainsburys.co.uk"));
	public static By LOGIN_BUTTON = (By.linkText("Tu Log In / Register"));
	public static By TEXT_BOXES = (By.cssSelector("#search"));
	public static By PRODUCT_SIZE = (By.cssSelector("#productVariantSize"));
	public static By PRODUCT_QUANTITY = (By.cssSelector("#productVariantQty"));
	public static By INSPIRE_ME = (By.linkText("Inspire Me"));
	public static By SUIT_BOOT = (By.linkText("Suited and booted"));
	public static By TU_FB = (By.linkText("Facebook"));
	public static By PRODUCT_SEARCH = By.cssSelector("#search");
	public static By DETAIL_BUTTON = By.cssSelector(".details");
	public static By TITLE_BUTTON = By.cssSelector(".simple_disp-img");
	public static By PRIVACY_POLICY = By.linkText("Privacy policy");
	public static By ASK_QUESTION = By.cssSelector("#nlpq");
	public static By TU_LOGIN = (By.linkText("Tu Log In / Register"));
	public static By TU_BUTTON = (By.cssSelector(".tuButton.regToggle"));
	public static By EMAIL_ID = (By.cssSelector("#register_email"));
	public static By REGISTER_TITLE = (By.cssSelector("#register_title"));
	public static By FIRST_NAME = (By.cssSelector("#register_firstName"));
	public static By LAST_NAME = (By.cssSelector("#register_lastName"));
	public static By NEW_PASSWORD = (By.cssSelector("#password"));
	public static By CHECK_PASSWORD = (By.cssSelector("#register_checkPwd"));
	public static By TERMS_CONDITION = (By.name("termsAndConditions"));
	public static By REGISTER_BUTTON = (By.cssSelector(".registerButton"));
	public static String BASE_URL = "https://tuclothing.sainsburys.co.uk/";
	public static By SEARCH_BOX = (By.cssSelector("#search"));
	public static By SEARCH_BUTTON = (By.cssSelector(".searchButton"));
	public static By PRODUCT_DETAILS = (By.cssSelector(".details"));
	public static By SIZE_DETAILS = (By.cssSelector("#productVariantSize"));
	public static By QTY_DETAILS = (By.cssSelector("#productVariantQty"));
	public static By CART_BUTTON = (By.cssSelector("#AddToCart"));
	public static By CHECKOUT_BUTTON = (By.cssSelector(".doCheckoutBut.tuButton"));
	public static By BASKET_BUTTON = (By.cssSelector("#basketButtonBottom"));
	public static By USER_PASSWORD = (By.cssSelector("#j_password"));
	public static By CHECK_OUT = (By.cssSelector(".button.orange"));
	public static By BOTTOM_BUTTON = (By.cssSelector("#basketButtonBottom"));
	public static By CUSTOMER_OPTION = (By.cssSelector(".customer-options--item"));
	public static By CENTRE_BUTTON = (By.cssSelector(".center.button.orange"));
	public static By STORE_LOCATOR = By.cssSelector("#storelocator-query");
	public static By STORE_FINDER = (By.cssSelector("#storeFinder"));
	public static By TU_SALE = (By.linkText("Sale"));
	public static By REGISTER_LINK = By.linkText("Tu Log In / Register");
	public static By USER_PASSWORDS = By.cssSelector("#j_password");
	public static By TU_MAINBUTTON = By.cssSelector(".tuButton.loginButtonMain");
	public static By TU_STORE = (By.linkText("Tu Store Locator"));
	public static By LINK_BOX = (By.name("q"));
	public static By TEXT_BOX = (By.cssSelector(".form.search"));

	@Before
	public void Start() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prinz/OneDrive/Documents/Automation/Driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(WEB_URL);
		driver.manage().window().maximize();

	}

	@Test
	public void searchwithinvalidData() {

		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXT).sendKeys("xrgdfyg");
		driver.findElement(CHECK_BOX).click();
	}

	@Test
	public void clickAndCollect() throws InterruptedException {
		driver.findElement(SEARCH_BOX).clear();
		driver.findElement(SEARCH_BOX).sendKeys("tops");
		driver.findElement(SEARCH_BUTTON).click();
		// Thread.sleep("3000");
		driver.findElements(PRODUCT_DETAILS).get(6).click();
		Select dropdown = new Select(driver.findElement(SIZE_DETAILS));
		dropdown.selectByIndex(5);
		Thread.sleep(3000);
		Select dropdowns = new Select(driver.findElement(QTY_DETAILS));
		dropdowns.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#AddToCart")).click();
		// driver.findElement(By.cssSelector(".doCheckoutBut.tuButton")).click();
		Thread.sleep(3000);
		driver.findElements(CHECKOUT_BUTTON).get(0).click();
		Thread.sleep(3000);
		driver.findElement(BASKET_BUTTON).click();
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("toccsubject@gmail.com");
		driver.findElement(USER_PASSWORD).clear();
		driver.findElement(USER_PASSWORD).sendKeys("London19");
		Thread.sleep(3000);
		driver.findElement(CHECK_OUT).click();
		driver.findElement(BOTTOM_BUTTON).click();
		Thread.sleep(3000);
		driver.findElements(CUSTOMER_OPTION).get(0).click();
		driver.findElement(CENTRE_BUTTON).click();
		Thread.sleep(3000);
		driver.findElement(STORE_LOCATOR).sendKeys("Rg14");
		driver.findElement(STORE_FINDER).click();
		Thread.sleep(3000);
		 driver.findElements(By.cssSelector(".customer-options--cta")).get(0).click();
		
		 
		 
		 
	}
	@Test
	public void forgottenPasswordwithinvalidEmail() throws InterruptedException {
		driver.get(BASE_URL);
		driver.findElement(LOGIN_BUTTON).click();
		driver.findElement(USER_NAME).clear();
        driver.findElement(USER_NAME).sendKeys("vgfdtrd@gmail.com");
        driver.findElement(FORGOTTEN_PASSWORD).click();
        Thread.sleep(3000);
        driver.findElement(REQUIRED_BUTTON).sendKeys("vgfdtrd@gmail.com");
        driver.findElement(ORANGE_BUTTON).click();

	}

	@Test
	public void forgottenPassword() throws InterruptedException {

		driver.get(BASE_URL);
		driver.findElement(LOGIN_BUTTON).click();
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("toccsubjectgmail.com");
		driver.findElement(FORGOTTEN_PASSWORD).click();
		Thread.sleep(3000);
		driver.findElement(REQUIRED_BUTTON).sendKeys("toccsubject@gmail.com");
		driver.findElement(ORANGE_BUTTON).click();

	}

	@Test
	public void tuFACEbook() {
		driver.get(WEB_URL);
		driver.findElement(TU_FB).click();
	}
		@Test
	public void registerwithBlankFunctions() throws InterruptedException {
		driver.get(WEB_URL);
		driver.findElement(TU_LOGIN).click();
		Thread.sleep(3000);
		driver.findElement(TU_BUTTON).click();
		driver.findElement(EMAIL_ID).clear();
		driver.findElement(EMAIL_ID).sendKeys();
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
		dropdown.selectByVisibleText("Mrs");
		driver.findElement(FIRST_NAME).clear();
		driver.findElement(FIRST_NAME).sendKeys();
		driver.findElement(LAST_NAME).clear();
		driver.findElement(LAST_NAME).sendKeys();
		driver.findElement(NEW_PASSWORD).clear();
		driver.findElement(NEW_PASSWORD).sendKeys();
		driver.findElement(CHECK_PASSWORD).clear();
		driver.findElement(CHECK_PASSWORD).sendKeys();
		driver.findElement(TERMS_CONDITION).click();
		driver.findElement(REGISTER_BUTTON).click();
	}

	@Test
	public void registerWithInvalidFunctions() throws InterruptedException {
		driver.get(WEB_URL);
		driver.findElement(TU_LOGIN).click();
		Thread.sleep(3000);
		driver.findElement(TU_BUTTON).click();
		driver.findElement(EMAIL_ID).clear();
		driver.findElement(EMAIL_ID).sendKeys("toccsubject@gmail.com");
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
		dropdown.selectByVisibleText("Mrs");
		driver.findElement(FIRST_NAME).clear();
		driver.findElement(FIRST_NAME).sendKeys("1234567");
		driver.findElement(LAST_NAME).clear();
		driver.findElement(LAST_NAME).sendKeys("1234567");
		driver.findElement(NEW_PASSWORD).clear();
		driver.findElement(NEW_PASSWORD).sendKeys("1234567");
		driver.findElement(CHECK_PASSWORD).clear();
		driver.findElement(CHECK_PASSWORD).sendKeys("1234567");
		driver.findElement(TERMS_CONDITION).click();
		driver.findElement(REGISTER_BUTTON).click();
	}

	@Test
	public void registerWithValidData() throws InterruptedException {
		driver.get(WEB_URL);
		driver.findElement(TU_LOGIN).click();
		Thread.sleep(3000);
		driver.findElement(TU_BUTTON).click();
		driver.findElement(EMAIL_ID).clear();
		driver.findElement(EMAIL_ID).sendKeys("toccsubject@gmail.com");
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
		dropdown.selectByVisibleText("Mrs");
		driver.findElement(FIRST_NAME).clear();
		driver.findElement(FIRST_NAME).sendKeys("Neha");
		driver.findElement(LAST_NAME).clear();
		driver.findElement(LAST_NAME).sendKeys("Das");
		driver.findElement(NEW_PASSWORD).clear();
		driver.findElement(NEW_PASSWORD).sendKeys("London19");
		driver.findElement(CHECK_PASSWORD).clear();
		driver.findElement(CHECK_PASSWORD).sendKeys("London19");
		driver.findElement(TERMS_CONDITION).click();
		driver.findElement(REGISTER_BUTTON).click();
	}

	@Test
	public void AddtoBasket() throws InterruptedException {
		driver.findElement(PRODUCT_SEARCH).clear();
		driver.findElement(PRODUCT_SEARCH).sendKeys("tops");
		driver.findElement(SEARCH_BUTTON).click();
		// Thread.sleep("3000");
		driver.findElement(PRODUCT_DETAILS).click();
		Select dropdown = new Select(driver.findElement(PRODUCT_SIZE));
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		Select dropdowns = new Select(driver.findElement(PRODUCT_QUANTITY));
		dropdowns.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(CART_BUTTON).click();
	}

	@Test
	public void searchWithValidFunctions() {
		driver.findElement(SEARCH_BOX).clear();
		driver.findElement(SEARCH_BOX).sendKeys("tops");
		driver.findElement(CHECK_BOX).click();
		driver.findElement(DETAILS_BUTTON).click();
	}

	@Test
	public void goBackToTheTitle() {
		driver.findElement(PRODUCT_SEARCH).clear();
		driver.findElement(PRODUCT_SEARCH).sendKeys("tops");
		driver.findElement(SEARCH_BUTTON).click();
		driver.findElement(DETAIL_BUTTON).click();
		driver.findElement(TITLE_BUTTON).click();
	}

	@Test
	public void loginwithInvalidData() {
		driver.get(WEB_URL);
		driver.findElement(LINK_TEXT).click();
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("dtfyg@gmail.com");
		driver.findElement(USER_PASSWRD).clear();
		driver.findElement(USER_PASSWRD).sendKeys("Abcd12345");
		driver.findElement(LOGIN_MAIN).click();
	}

	@Test
	public void loginWithBlankFunctions() {
		driver.get(WEB_URL);
		driver.findElement(LINK_TEXT).click();
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("dtfyg@gmail.com");
		driver.findElement(USER_PASSWRD).clear();
		driver.findElement(USER_PASSWRD).sendKeys("Abcd12345");
		driver.findElement(LOGIN_MAIN).click();
	}

	@Test
	public void tuHelp() {
		driver.get(WEB_URL);
		driver.findElement(BASE_STRING).click();
		driver.findElement(RETURNS_REFUND).click();
		
	}

	@Test
	public void contactTu() {
		driver.get(WEB_URL);
		driver.findElement(CONTACT_TU).click();
		driver.findElement(CUSTOMER_SERVICE).click();
	}

	@Test
	public void tuSale() {
		driver.get(WEB_URL);
		driver.findElement(TU_SALE).click();
	}

	@Test
	public void tuCookies() {
		driver.findElement(COOKIE_POLICY);
	}

	@Test
	public void tuInspireMe() {
		driver.get(WEB_URL);
		driver.findElement(INSPIRE_ME).click();
		driver.findElement(SUIT_BOOT).click();
		driver.navigate().to("https://tuclothing.sainsburys.co.uk/");
	}

	@Test
	public void privacyPolicy() {
		driver.get(WEB_URL);
		driver.findElement(PRIVACY_POLICY).click();
		driver.findElement(ASK_QUESTION).sendKeys("Do you employ people over 50");
	}

	@Test
	public void searchBlog() {
		driver.get(WEB_URL);
		driver.findElement(SEARCH_BLOG).click();
	}

	@Test
	public void loginWithValidData() {
		driver.findElement(REGISTER_LINK).click();
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("toccsubject@gmail.com");
		driver.findElement(USER_PASSWORD).clear();
		driver.findElement(USER_PASSWORD).sendKeys("London19");
		driver.findElement(TU_MAINBUTTON).click();
	}

	@Test
	public void searchWithBlankData() {
		driver.get(WEB_URL);
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXT).sendKeys();
		driver.findElement(CHECK_BOX).click();
	}

	@Test
	public void tuSoreLocator() {
		driver.findElement(TU_STORE).click();
		Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector(".storeLocator h2")).getText());
		driver.findElement(By.name("q")).sendKeys("Rg14");
		driver.findElement(TEXT_BOX).click();
	}

	@After
	public void close() {
		//driver.close();

	}
}
