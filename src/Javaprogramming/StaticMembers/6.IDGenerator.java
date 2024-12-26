package Javaprogramming.StaticMembers;

 class IDGenerator {
    public static int NextID = 1;
    public static  int generateId( ){
        return NextID++;
    }
    public static void main(String[] args)
    {
        System.out.println("Generate id: " + IDGenerator.generateId());
        System.out.println("Generate id: " + IDGenerator.generateId());
        System.out.println("Generate id: " + IDGenerator.generateId());
        System.out.println("Generate id: " + IDGenerator.generateId());

    }
}
