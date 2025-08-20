package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
			Actions act = new Actions (driver);
			WebElement from = driver.findElement(By.id("column-a"));
			WebElement to = driver.findElement(By.id("column-b"));
			act.dragAndDrop(from, to).perform();
			Thread.sleep(2000);
			

			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
			
		}

			
	}

}
