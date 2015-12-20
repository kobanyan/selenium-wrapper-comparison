package com.github.kobanyan.selenium_wrapper_comparison;

public interface ITest {

    static final String URL = "http://localhost:8080/target.html";
    static final String INPUT_NONPRESENT = "#input-nonpresent";
    static final String INPUT_HIDDEN = "#input-hidden";
    static final String INPUT_DISABLED = "#input-disabled";
    static final String INPUT_READONLY = "#input-readonly";

    static final String STORY_CLEAR_NONPRESENT_INPUT = "Clear nonpresent input";

    void clearNonpresentInput();

    static final String STORY_CLEAR_HIDDEN_INPUT = "Clear hidden input";

    void clearHiddenInput();

    static final String STORY_CLEAR_DISABLED_INPUT = "Clear disabled input";

    void clearDisabledInput();

    static final String STORY_CLEAR_READONLY_INPUT = "Clear readonly input";

    void clearReadonlyInput();

    static final String STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_VISIBLE =
            "Assert that nonpresent input is visible";

    void assertThatNonpresentInputIsVisible();

    static final String STORY_ASSERT_THAT_HIDDEN_INPUT_IS_VISIBLE =
            "Assert that hidden input is visible";

    void assertThatHiddenInputIsVisible();

    static final String STORY_ASSERT_THAT_NONPRESENT_INPUT_IS_INVISIBLE =
            "Assert that nonpresent input is invisible";

    void assertThatNonpresentInputIsInvisible();

    static final String STORY_ASSERT_THAT_HIDDEN_INPUT_IS_INVISIBLE =
            "Assert that hidden input is invisible";

    void assertThatHiddenInputIsInvisible();

}
