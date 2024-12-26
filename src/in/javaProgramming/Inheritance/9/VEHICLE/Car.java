package in.javaProgramming.Inheritance.VEHICLE;


    public class Car extends Vehicle{
        private int numSet;

        public Car(String make, String Model, int year, String fuelType, double fuelEfficiency, int numSet){
            super(make, Model, year, fuelType, fuelEfficiency);
            this.numSet = numSet;
        }
        public int getnumSet(){
            return numSet;

        }
        @Override
        public double calculateFuelEfficiency() {
            return getFuelEfficiency() * (1.0 / (1.0 + (getnumSet() / 5.0)));
        }

        @Override
        public double calculateDistanceTraveled() {
            return getFuelEfficiency() *(1.0 /(1.0+(getnumSet()/5.0)));
        }

        @Override
        public double getMaxSpeed() {
            return calculateFuelEfficiency() * getFuelEfficiency();
        }
        public double getMaxspeed(){
            return 120.0;

        }
    }

