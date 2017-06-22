package com.timesofindia.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class DetailedNewsPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "detailedpage.news.header")
	public QAFWebElement newsheader;

	public QAFWebElement getNewsHeader() {
		return newsheader;
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

	public void verifyNewsTitle() {

		Reporter.log("News title is : " + driver.getTitle());

	}

}
