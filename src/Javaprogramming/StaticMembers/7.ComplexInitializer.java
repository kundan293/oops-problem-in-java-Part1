package Javaprogramming.StaticMembers;

 class ComplexInitializer {
   static  int x;
    static int y;
     static int z;

    static {
        System.out.println("static bloc executing");
      x=(int)(Math.random()*100);

      y=(x*2)+10;
        if (x % 2 == 0) {
            z = x * 3;
        } else {
            z = y + 5;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    public static void main(String[] args) {
        System.out.println("\nMain method executed:");
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
        System.out.println("Value of z = " + z);
    }

}
