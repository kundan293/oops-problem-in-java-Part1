package in.javaProgramming.Inheritance.VEHICLE;

public class Motorcycle extends Vehicle{
    private double engineDisplacement;
    // here create a constructor parametrized and calling values by super keyword ;
    public Motorcycle(String make,String Model, int year, String fuelType, double fuelEfficiency  ){
        super(make , Model, year, fuelType, fuelEfficiency);
        this. engineDisplacement =engineDisplacement;
    }
    public double getengineDisplacement(){
        return engineDisplacement;
    }
    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getengineDisplacement() / 1000.0)));
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