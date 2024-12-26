package in.javaProgramming.NestedClass;

class MathUtility{
    static class Calculator{
        public static int add(int a, int b ){
           int   sum = a+b;
            return sum;
        }
    }
}

 class StaticNestedClass {
    public static void main(String[] args){
        MathUtility.Calculator result = new MathUtility.Calculator();
        System.out.println(result.add(3  , 9));

    }
}
