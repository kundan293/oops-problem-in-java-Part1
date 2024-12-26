package in.javaProgramming.Inheritance;

class Employe extends Person{
    private  String jobTitle;
    private int employeeID;
    //private String jobTiltle;
    public Employe(int employeeID, String jobTitle, String firstname, String LastName ) {
//        super(String.valueOf(employeeID), jobTitle);
//        this.employeeID = employeeID;
//        this. jobTitle = jobTitle;
//        this.LastName = LastName;
//        this.firstname = firstname;
        super(firstname , LastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }
public int getEmployeeID()
{
        return employeeID;
}
public String getLastName(){
//        this.LastName = LastName;
//    String jobTitle = "jobTitle";
    return super.getLastName() + ", " + jobTitle;
}
}
public class PersonMethodOverloading {
    public static void main(String[] args){
    Employe employee1 = new Employe(1234, "Software manager", "Kunal", "Singh");
       // System.out.println(employe1.getFirstName( )+" " + employe1.getLastName());
        //System.out.println(employee1.getFirstName("Sandip" + " " + employee1.getLastName() + " (" + employee1.getEmployeeID(202812 + ")");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeID() + ")");
    }
}
