package Javaprogramming.StaticMembers;

 class Intializer {
static int initialValue;

 static  {
      initialValue = 1000;

  }

  public static void main(String[] args) {


   System.out.println("before creating an insatance "+Intializer.initialValue );
   System.out.println(initialValue);
  }
}
