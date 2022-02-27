package pomexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPom1 {
	@FindBy(xpath="//input[@name='firstname']") private WebElement fname;
	@FindBy(xpath="//input[@name='lastname']") private WebElement surname;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
	@FindBy(xpath="(//input[@type='radio'])[1]") private WebElement gender;
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
	
	
	SignUpPom1(WebDriver dri) {
		 PageFactory.initElements(dri, this);
		
	}
	
	  public void EnterFirstName(String name) {
		fname.sendKeys(name); 
	 }
	 
	 public void EnterSurName(String sname) {
		 surname.sendKeys(sname);
	 }
	 
	 public void EnterEmail(String emailId) {
		 email.sendKeys(emailId);
	 }
	
	 public void Selectgender() {
		 gender.click();
	 }
	 
	 public void EnterBirthdayMonth(String value1) {
		 Select s=new Select(month);
		 s.selectByVisibleText(value1);
	 }
	 
	 
	
	 
	 

}



