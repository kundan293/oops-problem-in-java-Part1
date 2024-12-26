package in.javaProgramming.NestedClass;

class Computer {
    class Processor{
        public void  displayDetails(){
            System.out.println("processor brand: intel");
            System.out.println("processor speed : 3.5 GHZ");
        }
    }
 void ShowProcessordetails(){
    Processor  processor = new Processor();
    processor.displayDetails();
 }
 public static void main(String[] args)
 {
        Computer comp = new Computer();
        comp.ShowProcessordetails();

    }
}
