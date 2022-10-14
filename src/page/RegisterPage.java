package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
public WebDriver driver;

@FindBy(xpath = "//i[@data-toggle='dropdown']")
private WebElement user_icon;

@FindBy(xpath = "//ul[contains(@class,'dropdown-menu user-dropdown')]//a[@class='disp-block']")
private WebElement sign_Register;

@FindBy(xpath = "//input[@id='register-form-name']")
private WebElement full_name;

@FindBy(xpath = "//input[@id='register-form-email']")
private WebElement email_address;

@FindBy(xpath = "//input[@id='register-form-password']")
private WebElement password;

@FindBy(xpath = "//input[@id='register-form-phone']")
private WebElement phone;

@FindBy(css = "input[name='agree']")
private WebElement agree_terms_chkbx;

@FindBy(css = "input[name='newsletter']")
private WebElement updates_chkbx;

@FindBy(xpath = "//button[contains(text(),'Register Now')]")
private WebElement register_btn;

public RegisterPage(WebDriver driver) 
{
PageFactory.initElements(driver,this);
}
public void clickusericon()
{
	user_icon.click();
}
public void clicksignregister()
{
	sign_Register.click();
}
public void setfullname(String name)
{
	full_name.sendKeys(name);
}
public void setemail_address(String email)
{
	email_address.sendKeys(email);
}
public void setpassword(String pwd)
{
	password.sendKeys(pwd);
}
public void setphone(String phon)
{
	phone.sendKeys(phon);
}
public void clickagree()
{
	agree_terms_chkbx.click();
}
public void clickupdatescheckbox()
{
	updates_chkbx.click();
}
public void clickRegisterBTN()
{
	register_btn.click();
}
}
