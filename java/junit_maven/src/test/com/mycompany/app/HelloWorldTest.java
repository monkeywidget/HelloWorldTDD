package com.mycompany.app;

import static org.junit.Assert.assertSame;

import com.mycompany.app.HelloWorld;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloWorldTest {

    private static final String TEST_HELLO = "Hello, World!";

    @Test
    public void hello_says_hello() {
        HelloWorld helloWorld = new HelloWorld(TEST_HELLO);
        assertSame("should be same", TEST_HELLO, helloWorld.hello());
    } // test_hello

}  // end class
