package com.github.kobanyan.selenium_wrapper_comparison;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.github.kobanyan.selenium_wrapper_comparison.Utils.createWebDriver;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class SelenideIT implements ITest {

    private static final String NAME = "Selenide";

    @BeforeClass
    public static void beforeClass() {
        WebDriverRunner.setWebDriver(createWebDriver());
        Configuration.screenshots = false;
        Configuration.timeout = 1000;
    }

    @AfterClass
    public static void afterClass() {
        WebDriverRunner.closeWebDriver();
    }

    @Before
    public void before() {
        open(URL);
    }

    @Stories(STORY_CLEAR_NONPRESENT_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_NONPRESENT_INPUT)
    @Test
    @Override
    public void clearNonpresentInput() {
        $(INPUT_NONPRESENT).clear();
        $(INPUT_NONPRESENT).shouldHave(value(""));
    }

    @Stories(STORY_CLEAR_HIDDEN_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_HIDDEN_INPUT)
    @Test
    @Override
    public void clearHiddenInput() {
        $(INPUT_HIDDEN).clear();
        $(INPUT_HIDDEN).shouldHave(value(""));
    }

    @Stories(STORY_CLEAR_DISABLED_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_DISABLED_INPUT)
    @Test
    @Override
    public void clearDisabledInput() {
        $(INPUT_DISABLED).clear();
        $(INPUT_DISABLED).shouldHave(value(""));
    }

    @Stories(STORY_CLEAR_READONLY_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_READONLY_INPUT)
    @Test
    @Override
    public void clearReadonlyInput() {
        $(INPUT_READONLY).clear();
        $(INPUT_READONLY).shouldHave(value(""));
    }

    @Stories(STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE)
    @Test
    @Override
    public void assertThatNonpresentInputIsVisible() {
        $(INPUT_NONPRESENT).shouldBe(visible);
    }

    @Stories(STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE)
    @Test
    @Override
    public void assertThatHiddenInputIsVisible() {
        $(INPUT_HIDDEN).shouldBe(visible);
    }

    @Stories(STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE)
    @Test
    @Override
    public void assertThatNonpresentInputIsInvisible() {
        $(INPUT_NONPRESENT).shouldNotBe(visible);
    }

    @Stories(STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE)
    @Test
    @Override
    public void assertThatHiddenInputIsInvisible() {
        $(INPUT_HIDDEN).shouldNotBe(visible);
    }

}
