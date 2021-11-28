package testfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pfmmodel.pagefactorymodel;

public class testnghjhj {
	WebDriverManager man;
	WebDriver cobj;
	//String url="https://chakon.webs.com/";
	//String Browser= "Chrome";
	pagefactorymodel obj99;
	Properties pop_obj;
	FileInputStream strr;
	@BeforeTest
	public void beforetest() throws IOException
	{
		pop_obj = new Properties();
		strr=new FileInputStream("C:\\Users\\TEJA\\eclipse-workspace\\pfmpomtestngty\\data.properties");
		pop_obj.load(strr);
		if(pop_obj.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
	man.chromedriver().setup();	
	cobj = new ChromeDriver();
	obj99 = new pagefactorymodel(cobj);
		}
		else if(pop_obj.getProperty("Browser").equalsIgnoreCase("firefox"))
		{
			man.firefoxdriver().setup();
			cobj= new FirefoxDriver();
			obj99 = new pagefactorymodel(cobj);
		}
		else 
		{
			man.edgedriver().setup();
			cobj=new EdgeDriver();
			obj99 = new pagefactorymodel(cobj);
			
		}
		
	}
	@BeforeMethod
	public void beforemethod()
	{
	cobj.navigate().to(pop_obj.getProperty("URL"));
	cobj.manage().window().maximize();
	}
	@Test
	public void tester11() throws InterruptedException
	{
		Thread.sleep(2000);
		//cobj.findElement(By.xpath("//a[@title='Contact']")).click();
		obj99.ram().click();
		Thread.sleep(2000);
		//cobj.findElement(By.xpath("//input[@id='w-form-53dadb4f5d2c173b70121af4-0']")).sendKeys("ram");
		obj99.ram1().sendKeys(pop_obj.getProperty("Name"));
		Thread.sleep(2000);
		//cobj.findElement(By.xpath("//input[@id='w-form-53dadb4f5d2c173b70121af4-1']")).sendKeys("ram@gmail.com");
		obj99.ram2().sendKeys(pop_obj.getProperty("Email"));
		Thread.sleep(1000);
		//cobj.findElement(By.xpath("//textarea[@id='w-form-53dadb4f5d2c173b70121af4-2']")).sendKeys("hi hello");
		obj99.ram3().sendKeys(pop_obj.getProperty("Message"));
		Thread.sleep(2000);
		}
	@AfterMethod
	public void aftermethod()
	{
		cobj.quit();
	}
	@AfterTest
	public void aftertest() throws IOException
	{
		strr.close();
	}
	

}
