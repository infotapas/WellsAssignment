package com.timesofindia.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.timesofindia.defs.DetailsNewsDefs;
import com.timesofindia.defs.HindiNewsDefs;
import com.timesofindia.defs.HomePageDefs;
import com.timesofindia.pages.HomePage;
import com.timesofindia.utils.CommonSteps;

public class ToiTest extends WebDriverTestCase {

	HomePageDefs homePage;
	DetailsNewsDefs detailedNews;
	HindiNewsDefs hindiNews;
	HomePage testSample;
	
	CommonSteps common;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		testSample = new HomePage();
		homePage = new HomePageDefs();
		detailedNews = new DetailsNewsDefs();
		hindiNews = new HindiNewsDefs();
		common = new CommonSteps();
		testSample.launchPage(null);
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		new WebDriverTestBase().tearDown();
	}

	@Test(description = "Times Of India Page verification", groups = "TOI_Regression")
	public void toiPageVerification() {

		homePage.declineNotifications();
		homePage.getTopStoriesList();
		detailedNews.verifyNewsTitle();

	}
	
	@Test(description = "Times Of India Entertainment", groups = "TOI_Regression")
	public void toiPageVerificationEntertainment() {
		
		homePage.declineNotifications();
		homePage.verifyEntertainmentSection();
		homePage.getEntertainmentNewsList();
		homePage.verifyTotalNumberOfImage();
		CommonSteps.mouseHoverToElement(testSample.getEntertainmentHeaderText());
		QAFTestBase.pause(5000);
		homePage.readSubNews();
		homePage.clickOnAnyLangAndVerifyPage("Hindi");
		hindiNews.getListOfTrendingNow();
		hindiNews.verifyNewsImage();
		
	}
}
