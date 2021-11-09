package com.mindtree.UIstore;

import org.openqa.selenium.By;

public class LandingPageUI {
	//*[@id="site-header"]/div[3]/div/div/div/div[1]/a
	public static By shopproductEle=By.xpath("//*[@id=\'site-header\']/div[3]/div/div/div/div[1]/a");
	
	//*[@id="site-header"]/div[3]/div/div/div/div[1]/div/div[1]/div[3]/a/span
	public static By powderEle=By.xpath("//*[@id=\'site-header\']/div[3]/div/div/div/div[1]/div/div[1]/div[3]/a/span");
	public static By searchBoxEle=By.xpath("//*[@id=\site-header\']/div[2]/div/div/div/form/div/input");
	
	//*[@id='site-header']/div[2]/div/div/div/form/div/button/svg
	public static By searchiconEle=By.xpath("//*[@id='site-header']/div[2]/div/div/div/form/div/button/svg");
	
	public static By howToWashClothEle=By.xpath("//*[@id=\'site-header\']/div[3]/div/div/div/div[3]/a");
	//*[@id="site-header"]/div[3]/div/div/div/div[3]/div/div[2]/a/span
	public static By howToDoLaundaryEle=By.xpath("//*[@id=\'site-header\']/div[3]/div/div/div/div[3]/div/div[2]/a/span");
	//*[@id='site-content']/div/div/div/div[2]/div[2]/div/div/div/div[7]/div/div[2]/div/a[1]/p
	public static By howToReadLaundaryEle=By.xpath("//*[@id='site-content']/div/div/div/div[2]/div[2]/div/div/div/div[7]/div/div[2]/div/a[1]/p");
	
}
