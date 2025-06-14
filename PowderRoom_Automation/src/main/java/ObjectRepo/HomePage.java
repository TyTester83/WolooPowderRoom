package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	public AppiumDriver driver;

	public HomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Home")
	private WebElement homeTab;

	@AndroidFindBy(accessibility = "Store")
	private WebElement storeTab;

	@AndroidFindBy(accessibility = "Rate")
	private WebElement rateTab;

	@AndroidFindBy(accessibility = "Find a Loo")
	private WebElement findALooTab;

	@AndroidFindBy(id = "in.woloo.www:id/navigation_more")
	private WebElement profileTab;

	@AndroidFindBy(accessibility = "Beauty")
	private WebElement beautyTextview;

	@AndroidFindBy(accessibility = "Fitness")
	private WebElement fitnessTextview;

	@AndroidFindBy(accessibility = "General Health")
	private WebElement healthTextview;

	@AndroidFindBy(accessibility = "Hormonal Change")
	private WebElement hormonalTextview;

	@AndroidFindBy(accessibility = "Periods")
	private WebElement periodsTextview;

	@AndroidFindBy(accessibility = "Sexual Wellness")
	private WebElement sexualWellTextview;

	@AndroidFindBy(accessibility = "Wellness")
	private WebElement wellnessTextview;

	public WebElement getHomeTab() {
		return homeTab;
	}

	public WebElement getStoreTab() {
		return storeTab;
	}

	public WebElement getRateTab() {
		return rateTab;
	}

	public WebElement getFindALooTab() {
		return findALooTab;
	}

	public WebElement getProfileTab() {
		return profileTab;
	}

	public WebElement getBeautyTextview() {
		return beautyTextview;
	}

	public WebElement getFitnessTextview() {
		return fitnessTextview;
	}

	public WebElement getHealthTextview() {
		return healthTextview;
	}

	public WebElement getHormonalTextview() {
		return hormonalTextview;
	}

	public WebElement getPeriodsTextview() {
		return periodsTextview;
	}

	public WebElement getSexualWellTextview() {
		return sexualWellTextview;
	}

	public WebElement getWellnessTextview() {
		return wellnessTextview;
	}

}
