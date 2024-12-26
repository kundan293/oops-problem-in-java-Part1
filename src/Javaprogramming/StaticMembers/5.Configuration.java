package Javaprogramming.StaticMembers;

 class Configuration {
   public   static String configValue ;
   static {
       configValue = "default config value";
       System.out.println("static bloc is excuted : ");
   }
     public static void main(String[] args)
     {
         System.out.println("cnfig value;" +configValue);
     }
}
