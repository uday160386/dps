package g04.structural.bridge;

public class BMWCar extends FillPaint{
    public BMWCar(Car car){
        super(car);
    }
    @Override
    String paint() {
        return objCar.color();
    }
}
