package Books;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eviltester.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@rel=\"noopener noreferrer\"])[1]")).click();
		driver.findElement(By.xpath("(//div[@class=\"yt-spec-touch-feedback-shape__fill\"])[33]")).click();


	}

}
