package Window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		//download the driver and set the path
				WebDriverManager.chromedriver().setup();
				//lunch the browser
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				//from contact
			    driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
				Set<String> newWindow = driver.getWindowHandles();
		        List<String> openedWindow=new ArrayList<String>(newWindow);
				String childWindow = openedWindow.get(1);
				driver.switchTo().window(childWindow);
				 
				
				 Thread.sleep(3000);
   				 driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
   				 String j=openedWindow.get(0);
				 driver.switchTo().window(j);
				
				
				 //to contact
   				 Thread.sleep(3000);
			     driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
			     Set<String> tocontact = driver.getWindowHandles();
				 List<String> openedWindow2=new ArrayList<String>(tocontact);
				 String childWindow2 = openedWindow2.get(1);
				 driver.switchTo().window(childWindow2);
				 Thread.sleep(3000); 
				 driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click(); 
				 String k=openedWindow.get(0);
				 driver.switchTo().window(k);
				 
				 driver.findElement(By.className("buttonDangerous")).click();
				 Alert testleaf = driver.switchTo().alert();
				 Thread.sleep(3000);
				 testleaf.accept();
	}}
					
					
//					 String parent =driver.getWindowHandle();
//					 Set<String> fromcontact = driver.getWindowHandles();
//					// System.out.println(fromcontact);
//					 for (String need : fromcontact) {
//						 if (!parent.equals(need)) {
//							 driver.switchTo().window(need);
//						 }
//					 }
//					 WebElement table = driver.findElement(By.id("ext-gen91"));
//					 List<WebElement> from = table.findElements(By.tagName("tr"));
//					 WebElement txt =from.get(1);
//					 WebElement ss = txt.findElement(By.xpath("//a[text()='DemoCustomer']"));
//					 System.out.println(ss.getText());
//					 //String text = txt.getText();
//					 ss.click();
//					// System.out.println(text);
//					 driver.switchTo().window(parent);
//					 System.out.println(driver.getCurrentUrl());
//	
//                     driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
//                     Set<String> tocontact = driver.getWindowHandles();
// 					// System.out.println(tocontact);
// 					 for (String need : tocontact) {
// 						 if (!parent.equals(need)) {
// 							 driver.switchTo().window(need);
// 						 }
// 					 }
// 					 WebElement totable = driver.findElement(By.id("ext-gen273"));
// 					 List<WebElement> to = table.findElements(By.tagName("tr"));
// 					 WebElement totxt =from.get(2);
// 					 totxt.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
// 			
// 					 
// 			        driver.switchTo().window(parent);
// 			        Thread.sleep(3000);
// 			        Alert testleaf = driver.switchTo().alert();
// 			        Thread.sleep(3000);
// 			        testleaf.accept();
// 			        
// 			        Thread.sleep(3000);
// 			        driver.close();
//	}
// 			        
// 					 
//
//					 
//					 
//					 
//			
//						 }
//	                 
//					 
//					 
//					
//					
//					 
//				
//				
//
//}