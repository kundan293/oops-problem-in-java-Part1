package in.javaProgramming.NestedClass;

 class University {


     static  class   Department  {
         private String DepartmentName;
         private int facultyCount;

    public Department(String DepartmentName, int facultyCount) {


        this.DepartmentName = DepartmentName;
        this.facultyCount = facultyCount;
    }
        public void DisplayInfo() {
            System.out.println("Department: " + DepartmentName);
            System.out.println("number of faculty member: " + facultyCount);


    }
    public static void main(String[] args){
        //University.Department compSciDept = new University.Department()

        University.Department  ComSci = new University.Department ("Computer Science", 60);
        ComSci.DisplayInfo();

    }

    }

     }


