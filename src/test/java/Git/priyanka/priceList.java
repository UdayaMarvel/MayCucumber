package Git.priyanka;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priceList {
	
	   public static void pList(List<String> textList, List<String> textList1) throws IOException {
	        File file = new File("C:\\sample\\filp8.xlsx");
	        int a = textList.size();
	        int b = textList1.size();
	        System.out.println("Text List Size: " + a);
	        System.out.println("Text List1 Size: " + b);

	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Redmi");

	        for (int k = 0; k < Math.min(a, b); k++) {
	            Row row = sheet.createRow(k);
	            Cell cell1 = row.createCell(0);
	            cell1.setCellValue(textList.get(k));
	            System.out.println(textList.get(k));

	            Cell cell2 = row.createCell(1);
	            cell2.setCellValue(textList1.get(k));
	            System.out.println(textList1.get(k));
	        }

	        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
	            workbook.write(fileOutputStream);
	        }

	        ((FileOutputStream) workbook).close();
	    }

	public static void main(String[] args) throws InterruptedException, Throwable
	{
	WebDriverManager.edgedriver().setup();

		WebDriver wd= new EdgeDriver();
		wd.get("https://www.flipkart.com/");
	WebElement E= wd.findElement(By.name("q"));
	E.sendKeys("Redmi mobile",Keys.ENTER);
	List<String> textList;
	List<String> textList1;
	  textList = new LinkedList<>();
	  textList1 = new LinkedList<>();
	Map<List<String>, List<String>> pricelist = new LinkedHashMap<>();

	for (int i = 1; i <= 25; i++) {
	  
	    List<WebElement> elements = wd.findElements(By.xpath("(//div[contains(text(),'REDMI ')])[" + i + "]"));
	    for (WebElement element : elements) {
	        String text = element.getText();
	        textList.add(text);
	    }
	}
	    Thread.sleep(3000);
	    for (int j = 1; j <= 24; j++) {
	        
	    	   List<WebElement> elements1 = wd.findElements(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[" + j + "]"));
	    
	    for (WebElement element1 : elements1) {
	        String text1 = element1.getText();
	        textList1.add(text1);
	    }
	    }
	
	pricelist.put(new LinkedList<>(textList), new LinkedList<>(textList1));
	for (Map.Entry<List<String>, List<String>> entry : pricelist.entrySet()) {
	  System.out.println("Key: " + entry.getKey());
	    System.out.println("Value: " + entry.getValue());
	    priceList.pList(textList,textList1);
	}
	
	
	

	}
	
	

}
