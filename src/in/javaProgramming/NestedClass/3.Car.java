package in.javaProgramming.NestedClass;

 class Car {


       public void StartEngine(){


       class  Engine {

           public void run() {
               System.out.println("engine is runing");
           }
       }
Engine engine = new Engine();
       engine.run();


   }

   public static void main(String[] args){
           Car myCar = new Car();
           myCar.StartEngine();


   }
}
