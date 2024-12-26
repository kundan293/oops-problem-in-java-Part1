package in.javaProgramming.Constructor;
// Constructor with default value

public class Car {
    private String made;
    private String model;
    private int year;

    public Car(String model, int  year, String made){
        this.made = (made ==null ||  made .isEmpty() )? "unknown made": made;

        this.model =(model == null || model .isEmpty())? "unknow model": model;
        this.year = (year <= 0)? 2000 : year;


    }









    public static void main(String[] args){
         Car car = new Car("VOLVO", 2000,"ghantajantahain "  );

  Car car2 = new Car("",-1," " );



        System.out.println("car make1" +car.made);
        System.out.println("car make year"+car.model);
        System.out.println("Car make in year "+car.year);

        // for unknown data ;
        System.out.println("car2 make"+ car2.made);
        System.out.println("car2 model"+ car2.model);
        System.out.println(" car2 make in year "+ car2.year);


    }
}
