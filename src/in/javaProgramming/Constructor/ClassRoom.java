package in.javaProgramming.Constructor;

public class ClassRoom {
private String className;
private String[] students;
    private boolean ClassRoom;

    public ClassRoom(String className , String[] students){
  this.className = className;
  this.students = students;
}

public void printClassRoom(){
    System.out.println("class name: " + className );
    System.out.println("students: ");

    for(String student : students){
        System.out.println(student+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
    //ClassRoom cr = new ClassRoom("A, b,g,d,r,d,r","kundan" , "randhir" ,"rahul","alok");
  String[] studentArray = { "kamlesh, Karan", "kaushal"};
        ClassRoom cr= new ClassRoom("Science 101", studentArray);
        cr.printClassRoom();

    }
}
