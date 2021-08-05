package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    public static WebDriver driver;
    //Before execution
    @BeforeTest
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Used to maximise the window
        driver.manage().window().maximize();
        driver.get("https://testservices.nic.in/NEET2021/Root/home.aspx?enc=Ei4cajBkK1gZSfgr53ImFcFR+natXIEjJ1rCf6DMgOrJ4xlKNzYGOuB5dxhm2dDv");
        Thread.sleep(3000);
    }
    //After execution
    @AfterTest
    public void tearDown() throws Exception {
        //used to close the current window
        driver.close();
    }
}
