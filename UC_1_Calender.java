
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class UC_1_Calender {

	@Test
	void TC_1001_Calender() {
		WebDriver driver = null;
		String browser = "firefox";
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:8080/phpunitcase/view.php");
	    driver.manage().window().setSize(new Dimension(1287, 790));
	    driver.findElement(By.name("Month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("Month"));
	      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
	    }
	    driver.findElement(By.name("Month")).click();
	    driver.findElement(By.name("Day")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("Day"));
	      dropdown.findElement(By.xpath("//option[. = '3']")).click();
	    }
	    driver.findElement(By.name("Day")).click();
	    driver.findElement(By.cssSelector("button")).click();
    
		    String result = driver.findElement(By.id("result")).getText();  
	        assertEquals("Wednesday",result);	
	        
		    driver.close();
		    System.out.println("Finish 1001 !!!");
	}
	@Test
	void TC_1002_Calender() {
		WebDriver driver = null;
		String browser = "firefox";
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:8080/phpunitcase/view.php");
	    driver.manage().window().setSize(new Dimension(1287, 790));
	    driver.findElement(By.name("Month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("Month"));
	      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
	    }
	    driver.findElement(By.name("Month")).click();
	    driver.findElement(By.name("Day")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("Day"));
	      dropdown.findElement(By.xpath("//option[. = '15']")).click();
	    }
	    driver.findElement(By.name("Day")).click();
	    driver.findElement(By.cssSelector("button")).click();
    
		    String result = driver.findElement(By.id("result")).getText();  
	        assertEquals("Friday",result);	
	        
		    driver.close();
		    System.out.println("Finish 1002 !!!");
	}

	@Test
	void TC_1003_Calender() {
		WebDriver driver = null;
		String browser = "firefox";
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\AdviceKpS\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:8080/phpunitcase/view.php");
	    driver.manage().window().setSize(new Dimension(1287, 790));
	    driver.findElement(By.name("Month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("Month"));
	      dropdown.findElement(By.xpath("//option[. = 'April']")).click();
	    }
	    driver.findElement(By.name("Month")).click();
	    driver.findElement(By.name("Day")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("Day"));
	      dropdown.findElement(By.xpath("//option[. = '20']")).click();
	    }
	    driver.findElement(By.name("Day")).click();
	    driver.findElement(By.cssSelector("button")).click();
    
		    String result = driver.findElement(By.id("result")).getText();  
	        assertEquals("Tuesday",result);	
	        
		    driver.close();
		    System.out.println("Finish 1003 !!!");
	}


}
