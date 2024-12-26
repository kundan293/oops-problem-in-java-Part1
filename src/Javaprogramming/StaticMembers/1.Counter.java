package Javaprogramming.StaticMembers;

 class Counter {
    private  static int count;

     public Counter(int count){
         this.count = count;
         for(int i =0; i<=count; i++){
             System.out.println("Counter ");
         }
     }
    public static void main (String[] args){
        Counter c = new Counter( 5);
        System.out.println("second time pass the object ");

        Counter c2 = new Counter(9);


    }
}
