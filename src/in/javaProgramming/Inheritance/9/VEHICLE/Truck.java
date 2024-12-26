package in.javaProgramming.Inheritance.VEHICLE;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String make, String Model, int year, String fuelType, double fuelEfficiency,double cargoCapacity){
        super(make , Model , year , fuelType , fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }
    public double getcargoCapacity(){
        return cargoCapacity;
    }
    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getcargoCapacity() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}