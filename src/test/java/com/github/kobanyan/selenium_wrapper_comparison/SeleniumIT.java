package com.github.kobanyan.selenium_wrapper_comparison;

import static com.github.kobanyan.selenium_wrapper_comparison.Utils.createWebDriver;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class SeleniumIT implements ITest {

    private static final String NAME = "Selenium";

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = createWebDriver();
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }

    @Before
    public void before() {
        driver.get(URL);
    }

    @Stories(STORY_CLEAR_NONPRESENT_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_NONPRESENT_INPUT)
    @Test
    @Override
    public void clearNonpresentInput() {
        driver.findElement(By.cssSelector(INPUT_NONPRESENT)).clear();
        assertEquals("", driver.findElement(By.cssSelector(INPUT_NONPRESENT)).getAttribute("value"));
    }

    @Stories(STORY_CLEAR_HIDDEN_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_HIDDEN_INPUT)
    @Test
    @Override
    public void clearHiddenInput() {
        driver.findElement(By.cssSelector(INPUT_HIDDEN)).clear();
        assertEquals("", driver.findElement(By.cssSelector(INPUT_HIDDEN)).getAttribute("value"));
    }

    @Stories(STORY_CLEAR_DISABLED_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_DISABLED_INPUT)
    @Test
    @Override
    public void clearDisabledInput() {
        driver.findElement(By.cssSelector(INPUT_DISABLED)).clear();
        assertEquals("", driver.findElement(By.cssSelector(INPUT_DISABLED)).getAttribute("value"));
    }

    @Stories(STORY_CLEAR_READONLY_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_READONLY_INPUT)
    @Test
    @Override
    public void clearReadonlyInput() {
        driver.findElement(By.cssSelector(INPUT_READONLY)).clear();
        assertEquals("", driver.findElement(By.cssSelector(INPUT_READONLY)).getAttribute("value"));
    }

    @Stories(STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE)
    @Test
    @Override
    public void assertThatNonpresentInputIsVisible() {
        assertTrue(driver.findElement(By.cssSelector(INPUT_NONPRESENT)).isDisplayed());
    }

    @Stories(STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE)
    @Test
    @Override
    public void assertThatHiddenInputIsVisible() {
        assertTrue(driver.findElement(By.cssSelector(INPUT_HIDDEN)).isDisplayed());
    }

    @Stories(STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE)
    @Test
    @Override
    public void assertThatNonpresentInputIsInvisible() {
        assertFalse(driver.findElement(By.cssSelector(INPUT_NONPRESENT)).isDisplayed());
    }

    @Stories(STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE)
    @Test
    @Override
    public void assertThatHiddenInputIsInvisible() {
        assertFalse(driver.findElement(By.cssSelector(INPUT_HIDDEN)).isDisplayed());
    }

}
