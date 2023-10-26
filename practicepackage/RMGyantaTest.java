package com.practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RMGyantaTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		String expected="TY_SDETT5";
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expected);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Deepak sir");
	WebElement ele = driver.findElement(By.xpath("//select[@name='status']"));
		Select s=new Select(ele);
s.selectByVisibleText("Created");
driver.findElement(By.xpath("//input[@type='submit']")).click();
//register the database
Driver driver1=new Driver();
DriverManager.registerDriver(driver1);
Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
	Statement state = con.createStatement();
	String query="select * from project;";
	ResultSet result = state.executeQuery(query);
	
	boolean flag=false;
	while(result.next())
	{
		String actual=result.getString(4);
		if(actual.equalsIgnoreCase(expected))
		{
			flag=true;
			break;
		}
	}
	if(flag=true)
	{
		System.out.println("project is created");
	}
	else
	{
		System.out.println("project is not created");
	}
	}

}
