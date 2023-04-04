package edu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/vu.thi.tran.van/vanvtt-0952/Trainings/automation/Java-language/repo/automation-test-example/drivers/chromedriver");
		WebDriver driver = (WebDriver) new ChromeDriver(); // Khai báo biến webdriver
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); // Load link url

		WebElement emailElement = driver.findElement(By.xpath("//*[@id='email']")); // Tìm element

		emailElement.sendKeys("sssss"); // Input ký tự

		emailElement.click(); // Click button

		emailElement.getText(); // Lấy text
	}
}
