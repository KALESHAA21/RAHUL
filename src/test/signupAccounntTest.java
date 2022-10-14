package test;

import org.testng.annotations.Test;

import page.RegisterPage;
import utility.BaseTest;

public class signupAccounntTest extends BaseTest
{  
@Test
public void newsignup()
{
RegisterPage r=new RegisterPage(driver);
r.clickusericon();
r.clicksignregister();
r.setfullname("KALESHA SHAIK");
r.setemail_address("shaikkalesha@gmail.com");
r.setpassword("irfan@786");
r.setphone("098001234");
r.clickagree();
r.clickupdatescheckbox();
r.clickRegisterBTN();
}
}
