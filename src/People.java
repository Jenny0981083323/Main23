public class People {
    protected  String name;
    protected int id;
    protected int age;

    public People(String name,int id,int age){
        this.name=name;
        this.age=age;
        this.id=id;

    }
    public  void  sit(){
        System.out.println("Sitting....");
    }
    public  void eat(){
        System.out.println("eating...");
    }
}
