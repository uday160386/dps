package g04.creational.abstractfactory;

public class TraditionalChair implements Chair{
    @Override
    public void style(){
        System.out.println("Setting chair style to Traditional");
    }
    @Override
    public void color(){
        System.out.println("Setting chair color to White");
    }
}
