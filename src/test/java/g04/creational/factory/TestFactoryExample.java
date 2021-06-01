package g04.creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class TestFactoryExample {

    @Test
    public void testFactoryDP(){
        FactoryExample fe = new FactoryExample("Uday","Kumar");
        Assert.assertTrue(fe.fullName().equalsIgnoreCase("Uday Kumar"));
    }
}
