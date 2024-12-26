package in.javaProgramming.NestedClass;

abstract class Animal {
       abstract void makeSound();
    }
 class AnonymousClassImplementingAbstractClass {
    public static void main(String[] args){
Animal cat = new Animal(){
    void makeSound(){
        System.out.println("Meow");
    }
};
cat.makeSound();
    }
}

