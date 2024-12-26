package in.Java.OopsPractices;
 class Dog{
     private  String name;
     private String breeds;
     // here  iam a create a parametric constructor
     public Dog(String name, String breeds)
     {
         this.name = name;
         this.breeds = breeds;

     }
     public void setName(String name){
         this.name = name;
     }
     public void  setBreeds(String breeds){
         this.breeds = breeds;

     }
     public String getName(){
         return name;

     }
     public String getBreeds(){
         return breeds ;
     }
 }
public class Animal {
    public static void main(String[] args)
    {
        Dog dog = new Dog("pupy" , "German Shepherd");
        Dog dog2 = new Dog(" jack"  , "beagle");
        System.out.println(dog.getName()+ dog.getBreeds());
        System.out.println(dog2.getName() +dog2.getBreeds());

        // we some changes
        dog.setBreeds("Foodle " );
        dog2.setName("Dangerous");

        System.out.println(dog.getName()+dog.getBreeds());
        System.out.println(dog2.getName() + dog2.getBreeds());

    }

}
