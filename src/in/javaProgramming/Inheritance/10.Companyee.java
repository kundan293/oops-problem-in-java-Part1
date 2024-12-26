package in.javaProgramming.Inheritance;

 class Companye
 {
    public static void main(String[] args){
        
        Manager manager = new Manager("lueJack", "1 ABC st",90000.0,"Manager", 5);

        Developer developer = new Developer("kundan ", " India", 80000, "Developer "  ,"java " );

        Programmer programmer = new Programmer("Alok","Bihar", 75000.0, "C++");

        System.out.println("Manager"+ manager.calculateBonus());

        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());

    }
}
