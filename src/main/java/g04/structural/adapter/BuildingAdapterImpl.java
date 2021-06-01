package g04.structural.adapter;

public class BuildingAdapterImpl implements BuildingAdapter{

    private Building tower;

    public BuildingAdapterImpl(Building tower){
        this.tower = tower;
    }
    @Override
    public int getHeight() {
        return convertMetersToFeet(tower);
    }

    public int convertMetersToFeet(Building tower){
        return (int) (tower.getHeight() * 3.25);
    }
}
