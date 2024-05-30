package irctc.searchObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import irctc.commonaction.CommonFunction;

public class SearchLocators extends CommonFunction{

	CommonFunction co = new CommonFunction();
	
	public SearchLocators() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="src")
	private WebElement from;
	
	public WebElement getFrom() {
		return from;
	}

	public WebElement getLocation1() {
		return location1;
	}

	public WebElement getLocation2() {
		return location2;
	}

	@FindBy(xpath="//li[contains(text(),'Koyambedu')]")
	private WebElement location1;
	
	@FindBy(xpath="//li[contains(text(),'Kada')]")
	private WebElement location2;
	
	
	@FindBy(id="dest")
	private WebElement to;
	
	public WebElement getTo() {
		return to;
	}
}
