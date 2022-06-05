package runner;

import java.awt.print.Book;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import pageObject.AvoidBrokerPage;
import pageObject.Commercial;
import pageObject.EnquiryPage;
import pageObject.HomePage;
import pageObject.MenuPage;
import pageObject.MyBookingPage;
import pageObject.PaintAndCleanPage;
import pageObject.PayRent;
import pageObject.PostFreePage;
import pageObject.PropertyOwner;
import pageObject.RentalPage;
import uiStore.MenuPageUi;
import uitility.BaseClass;

public class TestExecution extends BaseClass {
	
	@Test(priority = 1)
	public void Test1() throws InterruptedException {
		
		logger= report.createTest("rental");
		logger.info("Click On rental");
		HomePage home = new HomePage(driver);
		home.clickOnRental();
	
		RentalPage rental=new RentalPage(driver);
		rental.ClickOn();
		
		Thread.sleep(3000);
		
		logger.pass("Succefully click on a rental");
	}
	@Test(priority = 2)
	public void Test2() throws InterruptedException {
		logger= report.createTest("MenuPage");
		logger.info("Click On MenuPage");
		
		MenuPage menu = new MenuPage(driver);
		menu.clickOnmenu();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 3)
	public void Test3() throws InterruptedException {
		logger= report.createTest("EnquiryPage");
		logger.info("Click On EnquiryPage");
		
		EnquiryPage Enquiry = new EnquiryPage(driver);
		Enquiry.clickOnEnquiry();
		Thread.sleep(3000);
		
	}
	@Test(priority = 4)
	public void Test4() throws InterruptedException {
		logger= report.createTest("ComPage");
		logger.info("Click On ComPage");
		
		Commercial Com = new Commercial(driver);
		Com.clickOnCom();
		Thread.sleep(3000);
		
	}
	@Test(priority = 6)
	public void Test5() throws InterruptedException {
		logger= report.createTest("BookPage");
		logger.info("Click On BookPage");
		
		MyBookingPage book = new MyBookingPage(driver);
	book.clickOnBook();
		Thread.sleep(3000);
		book.clickOnClose();
	}
	
	@Test(priority = 8)
	public void Test6() throws InterruptedException {
		logger= report.createTest("AvoidBroker");
		logger.info("Click On AvoidBroker");
		
		AvoidBrokerPage avoid = new AvoidBrokerPage(driver);
	   avoid.clickOnAvoid();
	 //  avoid.clickOnClose();
		
		
		
	}
	@Test(priority = 9)
	public void Test7() throws InterruptedException {
		logger= report.createTest("PayRent");
		logger.info("Click On PayrentPage");
		
		PayRent Pay = new PayRent(driver);
		Pay.clickOnPay();
		Thread.sleep(3000);
		

}
	@Test(priority = 5)
	public void Test8() throws InterruptedException {
		logger= report.createTest("FreePost");
		logger.info("Click On PostFreePage");
		PostFreePage Pay = new PostFreePage(driver);
		Pay.clickOnPost();
		
	}
	@Test(priority = 7)
	public void Test9() throws InterruptedException {
		logger= report.createTest("paint and clean");
		logger.info("Click On PaintAndCleanPage");
		
		PaintAndCleanPage Pay = new PaintAndCleanPage(driver);
		Pay.clickOnpaint();
        Pay.clickonClose();
	
	}
	@Test(priority = 10)
	public void Test10() throws InterruptedException {
		logger= report.createTest("propert own");
		logger.info("Click On Property own");
		
		PropertyOwner Pay = new PropertyOwner(driver);
		Pay.clickOnProp();
		Thread.sleep(3000);
}
}
