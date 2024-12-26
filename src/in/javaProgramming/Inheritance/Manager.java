package in.javaProgramming.Inheritance;

class Employee{
    private String name ;
    private String address;
    private double salary;
    private String JobTitle;
    public Employee (String  name, String address , double salary, String JobTitle ){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.JobTitle = JobTitle;
    }
    public String getName(){

         return name;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }
    public String getJobTitle(){
        return JobTitle;
    }
    public double calculateBonus() {
        return 0.0;

    }
    public String generatePerformanceReport() {
        return "No performnaceeport" ;
    }
}

 class Manager extends Employee{
     private int numberOfSubordinates;

     public Manager(String name, String address, double salary, String JobTitle, int numberOfSubordinates){
        super(name,address,salary,JobTitle );
        this.numberOfSubordinates = numberOfSubordinates;

    }
    public int getnumberOfSubordinates(){
         return numberOfSubordinates;
    }
    public double getcalculateBonus(){
         return getSalary()*0.15;
    }
    public String  generatePerformanceReport(){
         return "Performance report for Manager " + getName() + ": Excellent";
    }
    public void maanageProject(){
        System.out.println("Manager"+getName()+"is managing  a project.");

    }
}
class Developer extends Employee{
 private String programmingLanguage;
    public Developer(String name, String address, double salary, String JobTitle, String programmingLanguage){
        super(name, address, salary, JobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public double getcalculateBonus(){
        return  getSalary() * 0.12;
        }
        public String generatePerformancereport(){
        return  "Performance report for Programmer " + getName() + ": Excellent";
        }
    public void debug() {
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
}
class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String ProgrammingLanguage) {

        super(name, address, salary, "programmer", ProgrammingLanguage);

    }

    public double calculateNonus() {
        return getSalary() * 0.12;
    }

    public String generateperformancereport() {
        return "Performance report for Programmer " + getName() + ": Excellent";
    }

    public void debug() {
        System.out.println("Programmer" + getName() + "is deBugging code in" + getProgrammingLanguage());
    }
}