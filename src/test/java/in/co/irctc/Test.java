package in.co.irctc;

import com.github.dockerjava.api.model.Driver;

import irctc.commonaction.CommonFunction;
import irctc.searchObjectRepository.SearchLocators;

public class Test extends SearchLocators{
public static void main(String[] args) {
	CommonFunction c = new CommonFunction();
	SearchLocators s = new SearchLocators();
	c.browserLaunch();
	c.driver.get("https://flipkart.com");
	s.getLocation1().sendKeys("udaya");
}
}
