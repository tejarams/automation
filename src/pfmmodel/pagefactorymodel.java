package pfmmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactorymodel {
	WebDriver c_obj;

	public pagefactorymodel(WebDriver c_obj)
	{
this.c_obj = c_obj;
PageFactory.initElements(c_obj, this);
}
	@FindBy(xpath="//a[@title='Contact']")
	WebElement cpage;
	@FindBy(xpath="//input[@id='w-form-53dadb4f5d2c173b70121af4-0']")
	WebElement name;
	@FindBy(xpath="//input[@id='w-form-53dadb4f5d2c173b70121af4-1']")
	WebElement emailid;
	@FindBy(xpath="//textarea[@id='w-form-53dadb4f5d2c173b70121af4-2']")
	WebElement message;
	public WebElement ram()
	{
		return cpage;
	}
	public WebElement ram1()
	{
		return name;
	}
	public WebElement ram2()
	{
		return emailid;
	}
	public WebElement ram3()
	{
		return message;
	}
}