package g04.structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class TestBridge {
    @Test
    public void testBridgePattern(){
        BMWCar bmw = new BMWCar(new BlueCar());
        Assert.assertEquals(bmw.paint(),"BMW- Sedan Type with Color as Blue");
    }
}
