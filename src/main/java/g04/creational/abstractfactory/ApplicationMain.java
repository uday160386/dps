package g04.creational.abstractfactory;

public class ApplicationMain {

    public static Application selectFurniture(String furnitureType){
        FurnitureFactory ff;
        if(furnitureType.equalsIgnoreCase("modern"))
            ff = new ModernFurnitureFactory();
        else
            ff = new TraditionalFurnitureFactory();
        return new Application(ff);
    }
    public static void main(String args[]) {
        Application aa = selectFurniture("modern");
        aa.color();
        aa.style();
    }
}
