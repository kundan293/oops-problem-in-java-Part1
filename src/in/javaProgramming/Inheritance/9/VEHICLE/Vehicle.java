package in.javaProgramming.Inheritance.VEHICLE;

public abstract class Vehicle {
        private String make;
        private String Model;
        private int year;
        private String fuelType;
        private double fuelEfficiency;

        public Vehicle(String make, String Model, int year, String fuelType, double fuelEfficiency) {
            this.make = make ;
            this.Model = Model;
            this.year = year;
            this.fuelType = fuelType;
            this.fuelEfficiency = fuelEfficiency;
        }
        public String getMake(){
            return make;
        }
        public String getModel(){
            return Model;
        }
        public int getYear(){
            return year;
        }
        public String getFuelType(){
            return fuelType;
        }
        public double getFuelEfficiency(){
            return fuelEfficiency;
        }
        public abstract double calculateFuelEfficiency();
        public abstract double calculateDistanceTraveled();
        public abstract double getMaxSpeed();
    }

