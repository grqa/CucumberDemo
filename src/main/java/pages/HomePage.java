package pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import utils.TestUtil;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@class='site-branding']/a/img[1]")
	public WebElement LogoAtTop;

	@FindBy(xpath = "//div[@class='site-branding']/a/img[2]")
	public WebElement LogoAtScroll;

	@FindBy(xpath = "//*[@class='search-trigger']")
	public WebElement SearchButton;

	@FindBy(xpath = "//input[@class='search-field']")
	public WebElement SearchField;

	@FindBy(xpath = "//*[contains(@class,'search-overlay')]//*[@class='search-submit']")
	public WebElement SearchSubmit;

	@FindBy(xpath = "//*[@class='page-title']")
	public WebElement SearchResults;

	@FindBy(xpath = "//span[@class='close-search']")
	public WebElement SearchClose;

	@FindBy(id = "menu-item-63")
	public WebElement About;

	@FindBy(xpath = "//*[@id='menu-item-63']/ul[@class='sub-menu']")
	public WebElement SubMenu;

	@FindBy(id = "menu-item-3167")
	public WebElement Locations;

	@FindBy(id = "menu-item-122")
	public WebElement Careers;

	@FindBy(id = "menu-item-4749")
	public WebElement Leadership;

	@FindBy(id = "menu-item-4779")
	public WebElement InterAdvisory;

	@FindBy(id = "menu-item-121")
	public WebElement News;

	@FindBy(id = "menu-item-123")
	public WebElement Awards;

	@FindBy(id = "menu-item-67")
	public WebElement Work;

	@FindBy(id = "menu-item-64")
	public WebElement Blog;

	@FindBy(id = "menu-item-65")
	public WebElement Contact;

	@FindBy(xpath = "//a[contains(@class,'hero-btn')]")
	public WebElement LearnMoreButton;

	@FindBy(xpath = "//*[@id='menu-item-92']/a")
	public WebElement About_down;

	@FindBy(id = "menu-item-3168")
	public WebElement Locations_down;

	@FindBy(id = "menu-item-97")
	public WebElement Careers_down;

	@FindBy(id = "menu-item-4751")
	public WebElement Leadership_down;

	@FindBy(xpath = "//*[@id='menu-item-102']/a")
	public WebElement News_down;

	@FindBy(id = "menu-item-96")
	public WebElement Awards_down;

	@FindBy(xpath = "//*[@id='menu-item-95']/a")
	public WebElement Work_down;

	@FindBy(xpath = "//*[@id='menu-item-93']/a")
	public WebElement Blog_down;

	@FindBy(xpath = "//*[@id='menu-item-94']/a")
	public WebElement Contact_down;

	@FindBy(id = "menu-item-108")
	public WebElement Privacy_Policy;

	@FindBy(id = "menu-item-109")
	public WebElement TermsNcon;

	@FindBy(xpath = "//a[contains(text(),'View all careers')]")
	public WebElement ViewCareersButton;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div/a")
	public WebElement ClientMars;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div[2]/a")
	public WebElement ClientDanfoss;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div[3]/a")
	public WebElement ClientRockfeller;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div[4]/a")
	public WebElement ClientVantageScore;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	public WebElement ClientIkea;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	public WebElement ClientEbay;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	public WebElement ClientMasdar;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	public WebElement ClientBetterMedicare;

	@FindAll({ @FindBy(xpath = "//*[@id='our-values']/div[2]/div") })
	public List<WebElement> OurValues;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[1]")
	public WebElement Boldness;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[1]/div[2]/p[2]")
	public WebElement Boldness_text;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[2]")
	public WebElement Curiosity;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[2]/div[2]/p[2]")
	public WebElement Curiosity_text;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[3]")
	public WebElement Inclusivity;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[3]/div[2]/p[2]")
	public WebElement Inclusivity_text;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[4]")
	public WebElement Empathy;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[4]/div[2]/p[2]")
	public WebElement Empathy_text;

	@FindBy(xpath = "//*[@class='curios-and-connected']/div/div[2]/div/span[1]")
	public WebElement CnCBullet1;

	@FindBy(xpath = "//*[@class='curios-and-connected']/div/div[2]/div/span[2]")
	public WebElement CnCBullet2;

	@FindBy(xpath = "//*[@class='curios-and-connected']/div/div[2]/div/span[3]")
	public WebElement CnCBullet3;

	@FindBy(xpath = "//a[contains(@href,'presence-to-milan')][@class='read-more']")
	public WebElement CnCApcoWorldwideReadMore;

	@FindBy(xpath = "//div[@id='apco-twitter-1']/following-sibling::a")
	public WebElement CnCTwitter1;

	@FindBy(xpath = "//div[@id='apco-twitter-2']/following-sibling::a")
	public WebElement CnCTwitter2;

	@FindBy(xpath = "//div[@id='apco-twitter-3']/following-sibling::a")
	public WebElement CnCTwitter3;

	@FindBy(xpath = "//div[@id='apco-twitter-4']/following-sibling::a")
	public WebElement CnCTwitter4;

	@FindBy(xpath = "//div[contains(@style,'Imad-AI')]")
	public WebElement PlayVideo1;

	@FindBy(xpath = "//span[@class='close-video']")
	public WebElement CloseVideo;

	@FindBy(xpath = "//div[@class='case-study-info']/a[contains(@href,'masdar')]")
	public WebElement CnCMasdar;

	@FindBy(xpath = "//a[contains(@href,'Bv__q2wHbk1')]")
	public WebElement CnCInstagram1;

	@FindBy(xpath = "//div[@class='swiper-button-next-curios']")
	public WebElement CnCNext;

	@FindBy(xpath = "//div[@class='swiper-button-prev-curios']")
	public WebElement CnCPrev;

	@FindBy(xpath = "//a[contains(@href,'advice-report')][@class='read-more']")
	public WebElement CnCWorkingForBalance;

	@FindBy(xpath = "//div[@class='case-study-info']/a[contains(@href,'ups-foundation')]")
	public WebElement CnCUpsFoundation;

	@FindBy(xpath = "//div[contains(@style,'mela')]")
	public WebElement PlayVideo2;

	@FindBy(xpath = "//a[contains(@href,'BuxInvinhe')]")
	public WebElement CnCInstagram2;

	@FindBy(xpath = "//a[contains(@href,'podcast')][@class='read-more']")
	public WebElement CnCPodcast;

	@FindBy(xpath = "//div[@class='case-study-info']/a[contains(@href,'ukrainian-ministry-of-finance')]")
	public WebElement CnCMinFinance;

	@FindBy(xpath = "//div[contains(@style,'Carmichael')]")
	public WebElement PlayVideo3;

	@FindBy(xpath = "//a[contains(@href,'BurKboBHSib')]")
	public WebElement CnCInstagram3;

	@FindBy(xpath = "//div[contains(@style,'greg-annis')]")
	public WebElement WPAS_Greg1;

	@FindBy(xpath = "//a[text()='Greg Annis']")
	public WebElement WPAS_Greg2;

	@FindBy(xpath = "//div[contains(@style,'MK-EW-Saying')]")
	public WebElement WPAS_WomenMagazine;

	@FindBy(xpath = "//a[text()='Enterprising Women Magazine']")
	public WebElement WPAS_WomenMagazine2;

	@FindBy(xpath = "//div[contains(@style,'ny-buildings')]")
	public WebElement WPAS_NewYorkObserver;

	@FindBy(xpath = "//a[text()='New York Observer']")
	public WebElement WPAS_NewYorkObserver2;

	@FindBy(xpath = "//div[contains(@style,'noam-ivri')]")
	public WebElement WPAS_Noam;

	public String WPAS_NoamString = "[contains(@style,'noam-ivri')]";

	@FindBy(xpath = "//a[text()='Noam Ivri']")
	public WebElement WPAS_Noam2;

	@FindBy(xpath = "//*[@id='what-people-saying']/div[3]/div[2]/span[1]")
	public WebElement WPAS_Bullet1;

	@FindBy(xpath = "//*[@id='what-people-saying']/div[3]/div[2]/span[2]")
	public WebElement WPAS_Bullet2;

	@FindBy(xpath = "//div[contains(@style,'pavolova')]")
	public WebElement WPAS_pavlova;

	@FindBy(xpath = "//a[text()='Irina Pavlova']")
	public WebElement WPAS_pavlova2;

	@FindBy(xpath = "//div[contains(@style,'skye-matt')]")
	public WebElement WPAS_PRNews;

	@FindBy(xpath = "//a[text()='PR News']")
	public WebElement WPAS_PRNews2;

	@FindBy(xpath = "//div[contains(@style,'talwalker')]")
	public WebElement WPAS_talwalker;

	@FindBy(xpath = "//div[contains(@style,'sandra-diversity')]")
	public WebElement WPAS_Sandra;

	public String WPAS_SandraString = "[contains(@style,'sandra-diversity')]";

	@FindBy(xpath = "//a[text()='Sandra Taylor']")
	public WebElement WPAS_Sandra2;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[1]/div/a")
	public WebElement Job1;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[2]/div/a")
	public WebElement Job2;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[3]/div/a")
	public WebElement Job3;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[4]/div/a")
	public WebElement Job4;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[5]/div/a")
	public WebElement Job5;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[6]/div/a")
	public WebElement Job6;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[7]/div/a")
	public WebElement Job7;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[8]/div/a")
	public WebElement Job8;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[9]/div/a")
	public WebElement Job9;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[10]/div/a")
	public WebElement Job10;

	@FindBy(xpath = "//*[@id='job-fair']/div/div[2]//div[2]/span[1]")
	public WebElement Job_Bullet1;

	@FindBy(xpath = "//*[@id='job-fair']/div/div[2]//div[2]/span[2]")
	public WebElement Job_Bullet2;

	@FindBy(xpath = "//*[@id='job-fair']/div/div[2]//div[2]/span[3]")
	public WebElement Job_Bullet3;
	
	public int ActivatingTheWindows;
	public int NumberOfValueWindows;//OurValues.size();
	public String ActiveBoxText1;
	public String ActiveBoxText2;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyLogoAtTop() {
		return LogoAtTop.isDisplayed();
	}

	public boolean verifyLogoScroll() {
		return LogoAtScroll.isDisplayed();
	}

	public boolean verifyTopLogoAtScroll() {
		return LogoAtTop.isDisplayed();
	}

	public boolean verifyLogoScrollAtTop() {
		return LogoAtScroll.isDisplayed();
	}

	public AboutPage ClickOnAboutTop() {
		About.click();
		return new AboutPage();
	}

	public WorkPage ClickOnWorkTop() {
		Work.click();
		return new WorkPage();
	}

	public BlogPage ClickOnBlogTop() {
		Blog.click();
		return new BlogPage();
	}

	public ContactPage ClickOnContactTop() {
		Contact.click();
		return new ContactPage();
	}

	public AboutPage ClickOnAboutDown() {
		About_down.click();
		return new AboutPage();
	}

	public WorkPage ClickOnWorkDown() {
		Work_down.click();
		return new WorkPage();
	}

	public BlogPage ClickOnBlogDown() {
		Blog_down.click();
		return new BlogPage();
	}

	public ContactPage ClickOnContactDown() {
		Contact_down.click();
		return new ContactPage();
	}

	public void SearchWindow() {
		SearchButton.click();
	}
	
	public boolean SearchWindowDisp() {
		return SearchField.isDisplayed();
	}

	public void SearchClear() {
		SearchField.clear();
	}
	
	public void SearchTyping(String text) {
		SearchField.sendKeys(text);
	}
	
	public void SearchSubmit() {
	      SearchSubmit.click();
	}
	
	public String SearchResult() {
	return SearchResults.getText();
	}

	public void SearchWindowClose() {
		SearchClose.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void AboutSubMenu() {
		Actions a = new Actions(driver);
		a.moveToElement(About).build().perform();
	}
	
	public boolean AboutSubMenuDisp() {
		return SubMenu.isDisplayed();
	}

	public ContactPage AboutSubMenuLocations() {
		Locations.click();
		return new ContactPage();
	}

	public void AboutSubMenuCareers() {
		Careers.click();
		// return new CareersPage();
	}

	public LeadershipPage AboutSubMenuLeadership() {
		Leadership.click();
		return new LeadershipPage();
	}

	public NewsPage AboutSubMenuNews() {
		News.click();
		return new NewsPage();
	}

	public void AboutSubMenuAwards() {
		Awards.click();
		// return new AwardsPage();
	}

	public ContactPage AboutSubMenuLocationsDown() {
		Locations_down.click();
		return new ContactPage();
	}

	public void AboutSubMenuCareersDown() {
		Careers_down.click();
		// return new CareersPage();
	}

	public LeadershipPage AboutSubMenuLeadershipDown() {
		Leadership_down.click();
		return new LeadershipPage();
	}

	public NewsPage AboutSubMenuNewsDown() {
		News_down.click();
		return new NewsPage();
	}

	public void AboutSubMenuAwardsDown() {
		Awards_down.click();
		// return new AwardsPage();
	}

	public void AboutSubMenuInterAdvCouncil() {
		Actions a = new Actions(driver);
		a.moveToElement(Leadership).build().perform();
	}
	
	public boolean AboutSubMenuInterAdvCouncilDisp() {
		return InterAdvisory.isDisplayed();
	}

	public InternAdvPage AboutSubMenuInterAdvCouncilClick() {
		InterAdvisory.click();
		return new InternAdvPage();
	}

	public AboutPage LearnMoreButton() {
		LearnMoreButton.click();
		return new AboutPage();
	}

	public PrivacyPolicyPage PrivacyPolicy() {
		Privacy_Policy.click();
		return new PrivacyPolicyPage();
	}

	public TermsAndConPage TermsAndConButton() {
		TermsNcon.click();
		return new TermsAndConPage();
	}

	public boolean OurValuesRefreshPage() {
		NumberOfValueWindows=OurValues.size();
		TestUtil.scrollIntoView(OurValues.get(1));
		String ActiveWindowBeforeRefresh = null;
		String ActiveWindowAfterRefresh = null;
		int NumberOfValueWindows = OurValues.size();
		for (int i = 0; i < NumberOfValueWindows; i++) {
			String ClassName = OurValues.get(i).getAttribute("class");
			if (ClassName.contentEquals("our-value active-value")) {
				ActiveWindowBeforeRefresh = OurValues.get(i).getText();
				break;
			}

		}
		driver.navigate().refresh();
		for (int i = 0; i < NumberOfValueWindows; i++) {
			String ClassName = OurValues.get(i).getAttribute("class");
			if (ClassName.contentEquals("our-value active-value")) {
				ActiveWindowAfterRefresh = OurValues.get(i).getText();
				break;
			}

		}

		if (ActiveWindowBeforeRefresh.equals(ActiveWindowAfterRefresh)) {
			log.error("On each refresh the default expanded box at 'Driven by our values' is the same");
			return false;
		} else {
			log.info("On each refresh the default expanded box at 'Driven by our values' is changing");
			return true;
		}

	}

	public void OurValuesExpand() {
		NumberOfValueWindows=OurValues.size();
		ActivatingTheWindows = 0;
		int x = 1;
		for (int i = 0; i < NumberOfValueWindows; i++) {
			OurValues.get(i).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String BoxExpand = driver.findElement(By.xpath("//*[@id='our-values']/div[2]/div[" + x + "]/div[2]/p[2]"))
					.getAttribute("style");
			x++;
			if (BoxExpand.contains("display: block;")) {
				String ActiveWindow = OurValues.get(i).getText();
				log.info("The box with the text " + ActiveWindow + " opened");
				ActivatingTheWindows++;
			}

		}
		

	}
	
	public boolean OurValuesExpandBool() {
		if (NumberOfValueWindows == ActivatingTheWindows) {
			log.info("All the boxes at 'Driven by our values' expand slightly when you click on them");
			return true;
		} else {
			log.error("The boxes at 'Driven by our values' are not expanding when you click on them");
			return false;
		}
	}

	
	
	
	
	
	public String xpath = "//*[contains(@class,'people-saying')]/div/div";
	
	public void WhatPeopleBeforeRefreshPage() {
		TestUtil.scrollIntoView(driver.findElement(By.xpath(xpath)));
		ActiveBoxText1 = null;
		ActiveBoxText2 = null;
		if (WPAS_Bullet1.isEnabled() == true) {
			String slideXpath = xpath + "[3]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		} else if (WPAS_Bullet2.isEnabled() == true) {
			String slideXpath = xpath + "[4]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		}
		}
		
public void WhatPeopleAfterRefresh() {
		if (WPAS_Bullet1.isEnabled() == true) {
			String slideXpath = xpath + "[3]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		} else if (WPAS_Bullet2.isEnabled() == true) {
			String slideXpath = xpath + "[4]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		}
		

	}
	
	public boolean WhatPeopleRefreshPageResult() {
		if (ActiveBoxText1.contentEquals(ActiveBoxText2)) {
			log.error("The default expanded box at 'What People are saying' is the same all the time");
			return false;
		} else {
			log.info("The default expanded box at 'What People are saying' is changing automatically");
			return true;
		}
	}

	public boolean WhatPeopleClicking() {
		String xpath = "//*[contains(@class,'people-saying')]/div/div";
		if (WPAS_Bullet1.isEnabled() == true) {
			String slideXpath = xpath + "[3]/div/div";
			WebElement Noam = driver.findElement(By.xpath(slideXpath + WPAS_NoamString));
			Noam.click();
			boolean activating = Noam.isEnabled();
			if (activating == true) {
				log.info("The boxes at 'What People are saying' getting expanded by clicking on them");
				return true;
			} else {
				log.error("The boxes at 'What People are saying' aren't getting expanded by clicking on them");
				return false;
			}

		} else if (WPAS_Bullet2.isEnabled() == false) {
			String slideXpath = xpath + "[4]/div/div";
			WebElement Sandra = driver.findElement(By.xpath(slideXpath + WPAS_SandraString));
			Sandra.click();
			boolean activating = Sandra.isEnabled();
			if (activating == true) {
				log.info("The boxes at 'What People are saying' getting expanded by clicking on them");
				return true;
			} else {
				log.error("The boxes at 'What People are saying' aren't getting expanded by clicking on them");
				return false;
			}
		} else {
			log.fatal("The elements are not visible");
			return false;
		}
	}

	public void AiAtTheRiseVideoOpen() {
		PlayVideo1.click();
	}
	
	public void AiAtTheRiseVideoPlay() throws FindFailed, InterruptedException {
		
		Screen s = new Screen();
		Pattern playImg = new Pattern(System.getProperty("user.dir") + "/sikuliphotos/playYouTube.JPG");
		s.wait(playImg, 2000);
		s.click();
		Thread.sleep(3000);
	}
	public void AiAtTheRiseVideoPause() throws FindFailed {
		Screen s = new Screen();
		if (s.exists(System.getProperty("user.dir") + "/sikuliphotos/redLineOfPlayed.JPG") != null) {
			Pattern mouseMoveImg = new Pattern(System.getProperty("user.dir") + "/sikuliphotos/mouseMoveYouTube.JPG");
			s.wait(mouseMoveImg, 2000);
			s.mouseMove();
			Pattern pauseImg = new Pattern(System.getProperty("user.dir") + "/sikuliphotos/pauseYouTube.JPG");
			s.wait(pauseImg, 2000);
			s.click();
			CloseVideo.click();
		}}
		
			public String AiAtTheRiseVideoAssert() {
		if(CloseVideo.isDisplayed()) {
			log.error("The AI AND THE RISE OF A NEW GENERATION video isn't working");
			return "The video didn't work";	
		} else {
			log.info("The AI AND THE RISE OF A NEW GENERATION video working fine");
			return "It Played";
		}
	}
	
	public void DafossScroll() {
		TestUtil.scrollIntoView(ClientDanfoss);
	}

	
	
	public BufferedImage actualimg;
	
	
	 public boolean ClientsPictureCompare() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/sikuliphotos/clients.png");
		BufferedImage expectedphoto = ImageIO.read(file);
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedphoto, actualimg);
		if (diff.hasDiff() == true) {
			log.error("The logos of clients are incorrect");
			return false;
		} else {
			log.info("The logos of clients are correct");
			return true;
		}
	} 
	
	public void Screenshot() {
		Screenshot logoimage = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,
				ClientDanfoss);
	    actualimg = logoimage.getImage();
		
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}

}
