package g04.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * SingletonExample Tester.
 *
 * @author <Authors name>
 * @since <pre>May 13, 2020</pre>
 * @version 1.0
 */

public class TestSingletonExample {
    @Test
    public void testSingleton_message() throws Exception {
        SingletonExample x = SingletonExample.getInstance();
        Assert.assertEquals(x.print_statement.toUpperCase(Locale.ROOT), "EXAMPLE ON CREATIONAL->SINGLETON PATTERN" );
    }
    @Test
    public void testSingleton_message_uppercase() throws Exception {
        SingletonExample x = SingletonExample.getInstance();
        Assert.assertEquals(x.print_statement, "Example on Creational->Singleton pattern" );
    }
}