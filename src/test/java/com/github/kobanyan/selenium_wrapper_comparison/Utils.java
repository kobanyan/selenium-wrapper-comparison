package com.github.kobanyan.selenium_wrapper_comparison;

import static org.apache.commons.lang3.SystemUtils.*;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    public static final WebDriver createWebDriver() {
        System.setProperty(
                "webdriver.chrome.driver",
                new File("target/chromedriver/" +
                        (IS_OS_MAC ? "mac32/chromedriver" :
                            (IS_OS_LINUX ?
                                    (OS_ARCH.contains("64") ? "linux64/chromedriver" :
                                        "linux32/chromedriver") :
                                            "win32/chromedriver.exe"))
                ).getAbsolutePath());
        return new ChromeDriver();
    }

}
