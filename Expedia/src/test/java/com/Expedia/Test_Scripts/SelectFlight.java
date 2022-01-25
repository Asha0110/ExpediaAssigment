package com.Expedia.Test_Scripts;

import org.testng.annotations.Test;

import com.Expedia.CommonUtils.Base;
import com.Expedia.Pages.HomePage;

public class SelectFlight extends Base {
	HomePage hp;
	
	@Test
	public void chooseFlght() throws InterruptedException {
		hp = new HomePage();
		Thread.sleep(4000);
		hp.selectFlight();
		hp.selectRoundTrip();
		hp.enterFromDestin("BOS");
		hp.SelectToDestination("IAD");
		hp.clickSearchBtn();
		hp.selectfirstFlight();
		hp.clickOnSelectBtn();
		hp.clickOnReturnFlight();
		hp.selectReturnBtn();
		hp.clickOnNOThanksBtn();
		ut.windowHandles();
		hp.selectCheckOut();
		hp.enterFirtName("hope");
		hp.enterlastName("storm");
		hp.enterphoneNo("6035123456");
		hp.selectgender("female");
		hp.BirthMonth();
		hp.BirthDay();
		hp.BirthYear();
		hp.enterCardName("rasi");
		hp.enterCardNo("123456123456");
		hp.CardExpMonth();
		hp.CardExpYear();
		hp.CardSecCode("234");
		hp.enterBillingAddress("32 alard st");
		hp.enterCity("concord");
		hp.selectState();
		hp.enterZipCode("03302");
		hp.completeBooking();
		
	}
	
	

}
