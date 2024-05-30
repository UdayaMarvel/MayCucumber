//package in.co.irctc;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import irctc.commonaction.CommonFunction;
//
//public class Hooks extends CommonFunction  {
//
//	CommonFunction co = new CommonFunction();
//	@Before
//	public void launch(Scenario scenario) {
//		co.browserLaunch();
//		final byte[] before = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
//		scenario.embed(before, "image/png");
//	}
//	
//	@After
//	public void close(Scenario scene) {
////		co.browserClose();
//		final byte[] after = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
//		scene.embed(after, "image/png");
//	}
//}
