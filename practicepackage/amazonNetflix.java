package com.practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonNetflix {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("netflix movies"+Keys.ENTER);
		
		List<WebElement> mov = driver.findElements(By.xpath("//div[@role='heading' and .='Popular films on Netflix']/ancestor::div[@class='UjPkWd']/descendant::div[@class='NJU16b']"));
				for (WebElement webElement : mov) {
					System.out.println(webElement.getText());
				}
				driver.quit();
	}
}


