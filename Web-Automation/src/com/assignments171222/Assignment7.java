package com.assignments171222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice1.CreatingWebElementsofactiTimeDemo1;

public class Assignment7 {
	
	public static WebDriver driver=null;
	public static CreatingWebElementsofactiTimeDemo1 opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		modifyProject();
		deleteProjectAndCustomer();
		logoutAndClose();

	}
	
	private static void  launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			opage= new CreatingWebElementsofactiTimeDemo1(driver);
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			opage.getusername().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getgettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			opage.getTasks().click();
			Thread.sleep(2000);
			opage.getAddnewTask().click();
			Thread.sleep(2000);
			opage.getNewCustomer().click();
			Thread.sleep(2000);
			opage.getEnterCustomerName().sendKeys("Reliance");
			opage.getCustomerDiscription().sendKeys("it is a power supplying company");
			opage.getClickCreateCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{
			opage.getAddnewTask().click();
			Thread.sleep(2000);
			opage.getClickNewProject().click();
			Thread.sleep(2000);
			opage.getEnterProjectName().sendKeys("petroleum products");
			opage.getProjectDiscription().sendKeys("supplying petroleum products");
			opage.getCreatePrjectButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyProject()
	{
		try
		{
			opage.getEditButtonProject().click();
			Thread.sleep(2000);
			opage.getProjectNameClick().click();
			Thread.sleep(2000);
			opage.getBlankProjectName().clear();
			Thread.sleep(2000);
			opage.getBlankProjectName().sendKeys("Petroleum Product Supply");
			Thread.sleep(2000);
			opage.getCrossButtonOfProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProjectAndCustomer()
	{
		try
		{
			opage.getEditButtonProject().click();
			Thread.sleep(2000);
			opage.getActionsofProject().click();
			Thread.sleep(2000);
			opage.getDeletePopupOfProject().click();
			Thread.sleep(2000);
			opage.getDeletePermanentlyOfProject().click();
			Thread.sleep(2000);
			opage.getEditButtonOfCustomer().click();
			Thread.sleep(2000);
			opage.getActions().click();
			Thread.sleep(2000);
			opage.getDeletePopUp().click();
			Thread.sleep(2000);
			opage.getDeletePermanently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAndClose()
	{
		try
		{
			opage.getlogout().click();
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}