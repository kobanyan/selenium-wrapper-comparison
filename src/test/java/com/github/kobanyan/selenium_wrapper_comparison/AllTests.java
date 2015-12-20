package com.github.kobanyan.selenium_wrapper_comparison;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FluentLeniumIT.class, SelenideIT.class, SeleniumIT.class})
public class AllTests {

}
