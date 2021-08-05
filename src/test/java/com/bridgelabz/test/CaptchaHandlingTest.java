package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.CaptchaHandling;
import net.sourceforge.tess4j.TesseractException;
import org.testng.annotations.Test;

import java.io.IOException;

public class CaptchaHandlingTest extends Base {
    @Test
    public void read_captcha() throws TesseractException, IOException, InterruptedException {
        CaptchaHandling captcha = new CaptchaHandling();
        captcha.handling_reCaptcha();
    }
}
