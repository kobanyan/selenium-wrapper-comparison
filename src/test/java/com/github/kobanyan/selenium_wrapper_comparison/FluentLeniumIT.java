package com.github.kobanyan.selenium_wrapper_comparison;

import static com.github.kobanyan.selenium_wrapper_comparison.Utils.createWebDriver;
import static org.fluentlenium.assertj.FluentLeniumAssertions.*;
import static org.junit.Assert.*;

import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.adapter.util.SharedDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@SharedDriver(type = SharedDriver.SharedType.PER_CLASS)
public class FluentLeniumIT extends FluentTest implements ITest {

    private static final String NAME = "FluentLenium";

    @Override
    public WebDriver getDefaultDriver() {
        return createWebDriver();
    }

    @Before
    public void before() {
        goTo(URL);
    }

    @Stories(STORY_CLEAR_NONPRESENT_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_NONPRESENT_INPUT)
    @Test
    @Override
    public void clearNonpresentInput() {
        findFirst(INPUT_NONPRESENT).clear();
        assertEquals("", findFirst(INPUT_NONPRESENT).getValue());
    }

    @Stories(STORY_CLEAR_HIDDEN_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_HIDDEN_INPUT)
    @Test
    @Override
    public void clearHiddenInput() {
        findFirst(INPUT_HIDDEN).clear();
        assertEquals("", findFirst(INPUT_HIDDEN).getValue());
    }

    @Stories(STORY_CLEAR_DISABLED_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_DISABLED_INPUT)
    @Test
    @Override
    public void clearDisabledInput() {
        findFirst(INPUT_DISABLED).clear();
        assertEquals("", findFirst(INPUT_DISABLED).getValue());
    }

    @Stories(STORY_CLEAR_READONLY_INPUT)
    @Title(NAME + ": " + STORY_CLEAR_READONLY_INPUT)
    @Test
    @Override
    public void clearReadonlyInput() {
        findFirst(INPUT_READONLY).clear();
        assertEquals("", findFirst(INPUT_READONLY).getValue());
    }

    @Stories(STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE)
    @Test
    @Override
    public void assertThatNonpresentInputIsVisible() {
        assertThat(findFirst(INPUT_NONPRESENT)).isDisplayed();
    }

    @Stories(STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE)
    @Test
    @Override
    public void assertThatHiddenInputIsVisible() {
        assertThat(findFirst(INPUT_HIDDEN)).isDisplayed();
    }

    @Stories(STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE)
    @Test
    @Override
    public void assertThatNonpresentInputIsInvisible() {
        assertThat(findFirst(INPUT_NONPRESENT)).isNotDisplayed();
    }

    @Stories(STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE)
    @Title(NAME + ": " + STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE)
    @Test
    @Override
    public void assertThatHiddenInputIsInvisible() {
        assertThat(findFirst(INPUT_HIDDEN)).isNotDisplayed();
    }

}
