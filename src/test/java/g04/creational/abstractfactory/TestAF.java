package g04.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class TestAF extends ApplicationMain{

    @Test
    public void testAbstractFactory(){
        Application aa = selectFurniture("modern");
        aa.color();
        aa.style();
    }
}
