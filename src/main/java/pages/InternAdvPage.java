package pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class InternAdvPage extends TestBase{
	
	@FindBy(xpath="//div[@class='breadcrumbs']")
	public WebElement Breadcrumbs;
	
	@FindBy(xpath="//a[@title='Go to People.']")
	public WebElement PeopleBreadcrumb;
	
	@FindBy(xpath="//a[text()='Full IAC']")
	public WebElement FullIACButton;
	
	@FindBy(xpath="//a[contains(@href,'eduardo-aguirre')]")
	public WebElement EduardoAguirre;
	
	public BufferedImage expectedphoto;
	public BufferedImage getimg;
	public BufferedImage actualimg;
	public File file;
	
	public InternAdvPage() {
		PageFactory.initElements(driver, this);
	}	
	
	public String verifyInternAdvTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		HomePage homepage= new HomePage();
		return homepage.LogoAtScroll.isDisplayed();
		}
	
	public boolean verifyBreadcrumbs() {
		return Breadcrumbs.isDisplayed();
	}
	
	public PeoplePage peopleBreadcrumbClick() {
		PeopleBreadcrumb.click();
		return new PeoplePage();
	}
	
	public boolean verifyFullIAC() {
		return FullIACButton.isEnabled();
	}
	
	public void WhenTakeScreenshot() throws IOException {
		Screenshot logoimage=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,EduardoAguirre);
		getimg = logoimage.getImage();
		file=new File(System.getProperty("user.dir")+"/sikuliphotos/EduardoAguirre.png" );
		ImageIO.write(getimg, "PNG", file);
	}
	
	public void HoverEduardo() {
		Actions a = new Actions(driver);
		a.moveToElement(EduardoAguirre).build().perform();	
	}
	
	public void AfterHoverScreenshot() {
		Screenshot afterHoverImage=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,EduardoAguirre);
		actualimg = afterHoverImage.getImage();
	}
	
	
	public boolean compareHoverPics() throws IOException{
		
		ImageIO.write(getimg, "PNG", file);
		expectedphoto = ImageIO.read(file);
		ImageDiffer imgDiff=new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedphoto, actualimg);
		if(diff.hasDiff()==true) {
			log.info("After hovering on people info the photo appears");
			return true;
		}
		else {
			log.error("After hovering on people info nothing happens");
			return false;
		}


		
	}

}
