package com.practicepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionMan {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("searchInput")).sendKeys("ind");
	//	String a = driver.findElement(By.xpath("(//em[.='Ind'])[4]")).getText();
		//System.out.println(a);
		//to print only India at the 2022 Asian Games
//		String b = driver.findElement(By.xpath("//div[@class='suggestions-dropdown']/descendant::h3[text()='ia at the 2022 Asian Games']")).getText();
//		System.out.println(b);
		 List<WebElement> result = driver.findElements(By.xpath("//div[@class='suggestions-dropdown']/descendant::h3"));
		 for( WebElement q:result)
		 {
			System.out.println(q.getText()); 
		 }
		
		
		}

}


