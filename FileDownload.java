package com.wiprojuly.javasdet;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement filedownload = driver.findElement(By.xpath("a[@href='download/test-file.txt']"));
		filedownload.click();
		Thread.sleep(2000);
		File f = new File("C:\\Users\\Siva Sai\\Downloads\\test-file.txt");
		if(f.exists()) {
			System.out.println("The file is prsent");
		}else {
			System.out.println("the file is not prsent");
		}

	}

}
