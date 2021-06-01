package g04.creational.abstractfactory;

public class TraditionalSofa implements Sofa {

    @Override
    public void style(){
        System.out.println("Setting sofa style to Traditional");
    }
    @Override
    public void color(){
        System.out.println("Setting sofa color to White");
    }
}
