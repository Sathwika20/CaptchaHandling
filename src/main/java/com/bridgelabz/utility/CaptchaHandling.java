package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptchaHandling extends Base {
    public final String myFile = "C:/Users/gopir/IdeaProjects/CaptchaHandling/ScreenShots/ScreenShot.png";
    public void handling_reCaptcha() throws IOException, TesseractException, InterruptedException {
        Thread.sleep(3000);
        File src = driver.findElement(By.id("ctl00_ContentPlaceHolder1_captchaimage")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File(myFile));
        ITesseract image = new Tesseract();
        image.setDatapath("C:/Users/gopir/IdeaProjects/CaptchaHandling/src/main/tessData");
        String result = image.doOCR(new File(myFile));
        System.out.println(result);
        driver.findElement(By.xpath("//input[@id = 'ctl00_ContentPlaceHolder1_txtsecpin']")).sendKeys(result);
        Thread.sleep(2000);
    }
}
