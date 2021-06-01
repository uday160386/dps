package g04.creational.abstractfactory;

public class ModernSofa implements Sofa {

    @Override
    public void style(){
        System.out.println("Setting sofa style to Modern");
    }
    @Override
    public void color(){
        System.out.println("Setting sofa color to Black");
    }
}
