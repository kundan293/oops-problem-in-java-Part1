package in.javaProgramming.NestedClass;
 class Library{
     private String libraryname;

     static class BOOK {

         public String getLibrary( String libraryname){
          return libraryname;
         }
     }
}
 class inneerClasaccessing {
     public static void main(String[] args){
         Library.BOOK bn = new Library.BOOK();
         String  libraryname= bn.getLibrary( " Rvn Rao ");

         System.out.println(libraryname);


     }
}
