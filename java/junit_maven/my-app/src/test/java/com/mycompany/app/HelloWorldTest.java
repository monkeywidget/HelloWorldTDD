package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest
        extends TestCase
{
    private static final String TEST_HELLO = "Hello, World!";

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void test_hello_says_hello() {
        HelloWorld helloWorld = new HelloWorld(TEST_HELLO);
        assertSame("should be same", TEST_HELLO, helloWorld.hello());
    } // test_hello


}
