package in.Java.OopsPractices;

public class person {
    private String name;
    private int age ;


    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args){
        person Person = new person("kundan " , 19);

        person Person2 = new person("randhir" , 30 );
        System.out.println(Person.getName() + Person.getAge());
        System.out.println(Person2.getName()+ Person2.getAge());
    }
}

