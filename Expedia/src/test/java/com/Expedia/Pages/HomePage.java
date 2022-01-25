package com.Expedia.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Expedia.CommonUtils.Base;

public class HomePage extends Base{
	

	public HomePage selectFlight() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
		//driver.navigate().refresh();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.onbeforeunload = function() {};"); 
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
	return this;
	}
	
	public HomePage selectRoundTrip() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Roundtrip']")).click();
	return this;
	}
	
	//input[@id='location-field-leg1-origin']
	
//	public HomePage selectLeavinFrom() throws InterruptedException {
//	//	WebElement from = driver.findElement(By.xpath("//input[@id='location-field-leg1-origin']"));
////		//from.sendKeys("Boston");
//	WebElement fromAddress= driver.findElement(By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
//	fromAddress.click();
//		fromAddress.sendKeys("Boston");
//		Thread.sleep(5000);
////		List <WebElement> list = driver.findElements(By.xpath("//*[@class=\"uitk-typeahead-result-item has-subtext\"]//span"));
////		System.out.println("the size of list is: " + list);
////		for(WebElement singleitem: list) {
////			if(singleitem.getText().equalsIgnoreCase("Boston (BOS - Logan Intl.)")) {
////				singleitem.click();
////				break;
////			}
////		}
//		
//		return this;
//	}
		
		
public HomePage enterFromDestin(String Lairport) throws InterruptedException {
			WebElement origin = driver.findElement(By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
			origin.click();
			Actions action = new Actions(driver);
			action.sendKeys(Lairport).build().perform();
			Thread.sleep(4000);
			action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);
			return this;
		}
	
	public HomePage enterFromDestination() throws InterruptedException {
		Thread.sleep(2000);
		WebElement fromDest=driver.findElement(By.cssSelector(".uitk-field-label"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", fromDest);
		
		return this;
	}
	
	
	
	public HomePage SelectToDestination( String destination) throws InterruptedException {
		WebElement destin = driver.findElement(By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		destin.click();
		driver.manage().deleteAllCookies();
		Actions obj = new Actions(driver);
		obj.sendKeys(destination);
		Thread.sleep(5000);
		obj.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		return this;
	}
	
	
	public HomePage clickSearchBtn() throws InterruptedException {
		WebElement searchBtn = driver.findElement(By.xpath("//*[text()='Search']"));
		searchBtn.click();
		Thread.sleep(10000);
		driver.manage().deleteAllCookies();
		return this;
	}
	
	public HomePage selectfirstFlight() throws InterruptedException {
		WebElement selectFlight = driver.findElement(By.xpath("//body/div[@id='app-flights-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[3]/div[3]/div[1]/section[1]/main[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/button[1]"));
		selectFlight.click();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage clickOnSelectBtn() throws InterruptedException {
		
		WebElement selectbtn = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/section[1]/main[1]/div[6]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/button[1]"));
		selectbtn.click();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage clickOnReturnFlight() throws InterruptedException {
		WebElement returnflight=driver.findElement(By.xpath("//body/div[@id='app-flights-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[3]/div[3]/div[1]/section[1]/main[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/button[1]"));
		returnflight.click();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage selectReturnBtn() {
		WebElement returnselect = driver.findElement(By.xpath("//button[contains(text(),'Select')]"));
		returnselect.click();
		return this;
	}
	
	public HomePage clickOnNOThanksBtn() throws InterruptedException {
		WebElement nothanks = driver.findElement(By.xpath("/a[contains(text(),'No thanks')]"));
		nothanks.click();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage selectCheckOut() throws InterruptedException {
		WebElement chkoutbtn = driver.findElement(By.xpath("//button[contains(text(),'Check out')]"));
		chkoutbtn.click();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage enterFirtName(String fname) throws InterruptedException {
		WebElement firstname= driver.findElement(By.xpath("//*[@id=\"firstname[0]\"]"));
		firstname.sendKeys(fname);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage enterlastName(String lname) throws InterruptedException {
		WebElement lastname= driver.findElement(By.xpath("//*[@id=\"lastname[0]\"]"));
		lastname.sendKeys(lname);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage enterphoneNo(String phone) throws InterruptedException {
		WebElement phoneNum= driver.findElement(By.xpath("//*[@id=\"phone-number[0]\"]"));
		phoneNum.sendKeys(phone);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage selectgender(String female) {
		WebElement gender= driver.findElement(By.xpath("//*[@id=\"gender_female[0]\"]"));
		gender.sendKeys(female);
		return this;
	}
	
	public HomePage BirthMonth() throws InterruptedException {
		WebElement Bmonth= driver.findElement(By.xpath("//*[@id=\"date_of_birth_month0\"]"));
		Select se = new Select(Bmonth);
		se.selectByIndex(2);
		Thread.sleep(5000);
		return this;
	}
	public HomePage BirthDay() {
		WebElement Bday= driver.findElement(By.xpath("//*[@id=\"date_of_birth_day[0]\"]"));
		Select se = new Select(Bday);
		se.selectByIndex(10);
		return this;
	}
	public HomePage BirthYear() {
		WebElement Byear= driver.findElement(By.xpath("//*[@id=\"date_of_birth_year[0]\"]"));
		Select se = new Select(Byear);
		se.selectByIndex(15);
		return this;
	}
	
	public HomePage enterCardName(String cname) throws InterruptedException {
		WebElement cardname = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input"));
		cardname.sendKeys(cname);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage enterCardNo(String cardNo) throws InterruptedException {
		WebElement cardnum = driver.findElement(By.xpath("//*[@id=\"creditCardInput\"]"));
		cardnum.sendKeys(cardNo);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage CardExpMonth() {
		WebElement expmonth = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[1]/select"));
		Select ob = new Select(expmonth);
		ob.selectByIndex(4);
		return this;
	}
	
	public HomePage CardExpYear() {
		WebElement expyear = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[2]/select"));
		Select ob = new Select(expyear);
		ob.selectByIndex(3);
		return this;
	}
	
	public HomePage CardSecCode(String scode) throws InterruptedException {
		WebElement seccode = driver.findElement(By.xpath("//*[@id=\"new_cc_security_code\"]"));
		seccode.sendKeys(scode);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage enterBillingAddress(String address) throws InterruptedException {
		WebElement Billaddress = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input"));
		Billaddress.sendKeys(address);
		Thread.sleep(5000);
		return this;
	}
	public HomePage enterCity(String city) throws InterruptedException {
		WebElement citys = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input"));
		citys.sendKeys(city);
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage selectState() {
		WebElement stat = driver.findElement(By.xpath(""));
		Select obj1 = new Select(stat);
		obj1.selectByValue("NH");
		return this;
	}
	
	public HomePage enterZipCode(String code) {
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[5]/input"));
		zipcode.sendKeys(code);
		return this;
	}
	
	public HomePage completeBooking() {
		WebElement completebooking = driver.findElement(By.xpath("//*[@id=\"complete-booking\"]"));
		completebooking.click();
		return this;
	}
	
	
	
	
	
}// class ending
