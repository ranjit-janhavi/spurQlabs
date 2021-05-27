public class calculatorTest
{
	public void calculator()
	{
		webDriver driver;
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.calculator.net");
		//testing n1 and n2 in to textbox
		WebElement enterTextBox=driver.findElement(By.id("enter numbers"));
		enterTextBox.sendKeys("4000/200");
		//count result
		WebElement searchButton = driver.findElement(By.id("find"));
		searchButton.tclick();
		WebElement  calculatorTextbox = driver.findElement(By.id("total"));
		String result = calculatorTextBox.getText();

		Assert.assertEquals(result,"20");
	}
}	
