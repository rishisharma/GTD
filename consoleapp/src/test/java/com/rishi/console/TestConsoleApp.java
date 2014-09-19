package com.rishi.console;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
/**
 * JUnit Suite Test
 * @author mkyong
 *
 */
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestConsole.class,
        TestConsole.class
})
public class TestConsoleApp {
}