package in.Java.OopsPractices.Company;

class Employee {

    private String name;
    private double salary;
    private String JobTitle;

    public Employee(String name, String JobTitle, double salary) {
        this.name = name;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
     public void setSalary(double salary){
        this.salary = salary;
     }
     public double getSalary(){
        return salary;
     }
     public void setjobtitle(String JobTitle){
        this.JobTitle = JobTitle;

     }
     public String getjobtitle(){
        return JobTitle;
     }
     public void raiseSalary(double percentage){
        salary = salary + salary*percentage/100;
     }
     public void printEmployee(){
         System.out.println("name"+ name);
         System.out.println("jobTitle"+JobTitle);
         System.out.println("Salary"+salary);
     }
}
public class Companydata {
    public static void main(String[] args)
    {
Employee  Emp = new Employee("kundan", "softwaredevelopment", 1000000);
 Employee Emp2 = new Employee("kundan", "web development", 200000);

        System.out.println("\nEmploye Details");
        Emp.printEmployee();
        Emp2.printEmployee();

        Emp.raiseSalary(10);
        Emp2.raiseSalary(12);

        System.out.println("\n8% for 'Franziska Waltraud':");
        Emp.printEmployee();
        System.out.println("\n12% for' Hubertus andrea': ");
        Emp2.printEmployee();
        

    }
}
