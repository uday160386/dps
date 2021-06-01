package g04.creational.abstractfactory;

public class ModernChair implements Chair {

    @Override
    public void style(){
        System.out.println("Setting chair style to Modern");
    }
    @Override
    public void color(){
        System.out.println("Setting chair color to Black");
    }
}
