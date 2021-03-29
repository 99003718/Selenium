import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bankLoan {
	public static void main(String[] args) {
		System.out.println("Apply for car loan");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\test.DESKTOP-91D4PP6\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		driver.findElement(By.id("carRelbtn")).click();//Select type of loan
		driver.findElement(By.linkText("New Car Loan")).click();
		
		driver.findElement(By.id("MOBILENUM")).sendKeys("8169123654");
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Prashant");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Bagal");
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("MUMBAI");
		
		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.linkText("Employer Leased")).click();
		
		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.linkText("2020")).click();
		
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Apr")).click();
		
		driver.findElement(By.id("selSalspan")).click();
		driver.findElement(By.linkText("Self Employed")).click();
		
		
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("01-09-1998");
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("Honda City");
		driver.findElement(By.id("CITY_NAME")).sendKeys("MUMBAI");
		
		
	}
}
