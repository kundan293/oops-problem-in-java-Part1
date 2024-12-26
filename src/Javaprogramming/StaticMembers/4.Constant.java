package Javaprogramming.StaticMembers;

class Constant {
    public static  final double PI =  3.14159;

    public static double Area(double radius ){
        return PI*radius*radius;
    }


    public static void main(String[] args)
    {

        double CalculateAreaOfCircle =  Constant.Area(3.4);
        System.out.println(CalculateAreaOfCircle );
    }
}
