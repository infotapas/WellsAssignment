package com.timesofindia.defs;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.timesofindia.pages.DetailedNewsPage;
import com.timesofindia.pages.HomePage;
import com.timesofindia.utils.CommonSteps;

@QAFTestStepProvider
public class DetailsNewsDefs {

	DetailedNewsPage detailedNewsPage;
	HomePage homePage;

	@QAFTestStep(description="Verify each news title")
	public void verifyNewsTitle() {
		detailedNewsPage = new DetailedNewsPage();
		homePage = new HomePage();

		for (int i=0;i<homePage.getTopStoryList().size();i++) {
			homePage.getTopStoryList().get(i).click();
			detailedNewsPage.verifyNewsTitle();
			CommonSteps.navigateBack();
			homePage.verifyPageOpen();
		}

	}

}
