package in.javaProgramming.NestedClass;
// very -very important it clears to your concept

class House{
    public double CalculateArea(int length , int width){
        class Room{
public int  getArea( ){
    int area = length*width;
    return area ;
}
        }
        // instance create of the local class and use
        Room room = new Room();
        return room.getArea();
    }
}
 class LocalClass {
    public static void main(String[] args) {
       House result= new House();
        System.out.println(result.CalculateArea(3 ,4));
    }
}
