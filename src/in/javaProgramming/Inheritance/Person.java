package in.javaProgramming.Inheritance;
public class Person{
   private   String firstname;
  private  String LastName;
    public Person(String firstname, String LastName){
        this.firstname = firstname;
        this.LastName =LastName;
    }
    public String  getFirstName()
    {
        return firstname;
    }
    public String getLastName()
    {
        return LastName;
    }
}
