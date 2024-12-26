package in.javaProgramming.Inheritance;

// Define the Cheetah class, inheriting from Animal
public class Cheetah extends Animal2 {
    // Override the move method to print a cheetah-specific message
    @Override
    public void move() {

        System.out.println("This cheetah is running!");
    }
}
