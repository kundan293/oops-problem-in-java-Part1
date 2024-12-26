package in.javaProgramming.NestedClass;
class AnonymousClass {
    public static void main(String[] args) {
        getting gr = new getting();
        gr. syHello();{
            System.out.println("Hello wolrd" );
        };
        gr.syHello();
    }
}
    interface Gretting{
       public void syHello();
    }
    class getting implements Gretting {
        @Override
      public void syHello() {

        }
    }

