package g04.creational.abstractfactory;

public class Application {
    Sofa objSofa;
    Chair objChair;

    public Application(FurnitureFactory factory){
        objChair = factory.createChair();
        objSofa = factory.createSofa();
    }

    public void style(){
        objChair.style();
        objSofa.style();
    }
    public void color(){
        objChair.color();
        objSofa.color();
    }
}
