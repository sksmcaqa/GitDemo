package sarojmaventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpleciteWaitDemo {

	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver","E:\\Required Jars and software\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

}
