import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link HelloWorld}.
 */
@RunWith(JUnit4.class)
public class HelloWorldTest {

    @Test
    public void thisAlwaysPasses() {
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }

    private static final String TEST_HELLO = "Hello, World!";

    @Test
    public void hello_says_hello() {
        HelloWorld helloWorld = new HelloWorld(TEST_HELLO);
        assertSame("should be same", TEST_HELLO, helloWorld.hello());
    } // test_hello

}

