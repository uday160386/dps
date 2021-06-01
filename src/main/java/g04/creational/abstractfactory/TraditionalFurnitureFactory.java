package g04.creational.abstractfactory;

public class TraditionalFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa(){
        return new TraditionalSofa();
    }

    @Override
    public Chair createChair() {
        return new TraditionalChair();

    }
}
