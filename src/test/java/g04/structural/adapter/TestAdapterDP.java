package g04.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class TestAdapterDP {

    @Test
    public void testMtoF(){
        Building objBuilding = new BurjKhalifa();
        BuildingAdapter objBuildAdapter = new BuildingAdapterImpl(objBuilding);
        Assert.assertEquals(objBuildAdapter.getHeight(),2691);
    }
}
