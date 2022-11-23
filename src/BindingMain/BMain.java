package BindingMain;
//動態綁定
class A{
    public  void  hello(){
        System.out.println("is class a");
    }
}
class B extends A{
    public void hello(){
        System.out.println("is class b");
    }
}

public class BMain {

    public static void main(String[] args) {
        A obj1=new B();
        A obj2=new A();

        obj1.hello();
        obj2.hello();
    }
}
