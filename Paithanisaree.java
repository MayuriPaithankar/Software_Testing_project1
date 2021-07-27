package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Paithanisaree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\user data\\Desktop\\Selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		 WebDriver w=new FirefoxDriver();
		Thread.sleep(1000);
		           w.get("https://chaitanyaswarupapaithani.com/"); 
		         
		           System.out.println(w.getTitle());
				   Thread.sleep(2000);
				 w.findElement(By.xpath("//button[contains(text(),'×')]")).click();
				   Thread.sleep(1000);
				  
				 /*w.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
				  
				   Thread.sleep(1000);
				   w.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
				   Thread.sleep(500);
				   w.findElement(By.linkText("Silk Paithani")).click();
				   w.navigate().back();
				   w.navigate().back();
				   Thread.sleep(2000);
				   w.findElement(By.xpath("//button[contains(text(),'×')]")).click();
				   Thread.sleep(1000);
				  w.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
				  w.navigate().back();
				  Thread.sleep(2000);
				  w.findElement(By.xpath("//*[@id=\"welcomeModal\"]/div/div/div[1]/button")).click();
				  Thread.sleep(1000);
				  w.findElement(By.xpath("//a[contains(text(),'Terms and Conditions')]")).click();
				  w.navigate().back();
				  Thread.sleep(2000);
				  w.findElement(By.xpath("//*[@id=\"welcomeModal\"]/div/div/div[1]/button")).click();
				  Thread.sleep(1000);
				  w.findElement(By.xpath("//a[contains(text(),'FAQ')]")).click();
				  w.navigate().back();
				  Thread.sleep(2000);
				  w.findElement(By.xpath("//*[@id=\"welcomeModal\"]/div/div/div[1]/button")).click();
				  Thread.sleep(1000);
				  w.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
				  w.findElement(By.name("name")).sendKeys("mayuri");
				  w.findElement(By.name("email")).sendKeys("mayu11@gmail.com");
				 w.findElement(By.name("subject")).sendKeys("silkPaithani");
				 w.findElement(By.name("message")).sendKeys("xyz");
				 w.findElement(By.xpath("//button[contains(text(),'Send a Message')]"));
				 w.navigate().back();
				 Thread.sleep(2000);
				 w.findElement(By.xpath("//*[@id=\"welcomeModal\"]/div/div/div[1]/button")).click();
				Thread.sleep(1000);
					  w.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
					  Thread.sleep(1000);
					  w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
					  
				    w.findElement(By.name("name")).sendKeys("aarvi pawar");
				    w.findElement(By.name("contact")).sendKeys("8421416686");
				    w.findElement(By.name("email")).sendKeys("xyz123@gmail.com");
				    w.findElement(By.id("address")).sendKeys("aurangabad");
				    w.findElement(By.name("password")).sendKeys("pass@123");
				    w.findElement(By.name("cpassword")).sendKeys("pass@123");*/
				    w.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
				   w.findElement(By.xpath("//input[@id='identity']")).sendKeys("8551075896");
				   w.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
				    w.findElement(By.xpath("//span[contains(text(),'login')]")).click();
				  //  w.findElement(By.xpath("//span[contains(text(),'×')]")).click();
				    w.findElement(By.xpath("//body/div[2]/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
				    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				    Select s=new Select(w.findElement(By.id("quantity")));
				    s.selectByIndex(1);
				    w.findElement(By.xpath("//body/div[@id='myModal']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[2]")).click();
				    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/ul[1]/li[1]/input[1]")).sendKeys("aarvi");
				    w.findElement(By.xpath("//input[@id='']")).sendKeys("pawar");
				    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/ul[1]/li[7]/input[1]")).click();
				    w.findElement(By.name("shipTo[first_name]")).sendKeys("riya");
				    w.findElement(By.xpath("shipTo[last_name]")).sendKeys("chaudhari");
				    w.findElement(By.name("shipTo[email]")).sendKeys("riya23@gmail.com");
				    w.findElement(By.name("shipTo[contact]")).sendKeys("9022635470");
				    w.findElement(By.name("shipTo[address]")).sendKeys("yeola");
				    w.findElement(By.xpath("//input[@id='cash-transfer']")).click();
				    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"));
					JavascriptExecutor js= (JavascriptExecutor) w;
					Thread.sleep(2000);
					 js.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
					 System.out.println("page end");
					  Thread.sleep(3000);
					 //scroll up
					 js.executeScript("window.scrollBy(0,-2000)","");
					 System.out.println("page up");
				    
				    w.navigate().refresh();
				    w.close();
				  
				   

			}

}
