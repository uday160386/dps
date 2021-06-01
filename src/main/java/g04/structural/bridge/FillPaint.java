package g04.structural.bridge;

public abstract class FillPaint {

    public Car objCar;

    public FillPaint(Car car) {
        this.objCar = car;
    }

    abstract String paint();
}
