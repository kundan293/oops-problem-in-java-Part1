package Javaprogramming.StaticMembers;

 class MathUtility {

     private static int  add(int  num1 , int num2  ){

        int   sum = num1 + num2;
         return sum;

     }



     public static void main(String [] args){
         MathUtility  mu= new MathUtility ();// create with an instance ;

         // or

         int result = MathUtility.add(20,10);// create without an instance
         System.out.println(result);

         System.out.println( mu.add(2,4));


     }
}
