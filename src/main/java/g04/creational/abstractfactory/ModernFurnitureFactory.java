package g04.creational.abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Sofa createSofa(){
        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();

    }
}
