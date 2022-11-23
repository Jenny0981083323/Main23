package AbstractMain;
//抽象類別
public class AMain {
    public static void main(String[] args) {
        Animal dog1=new Dog();
        Animal cat1=new Cat();
        Dog dog2=new Dog();
        //Animal dog2=new Dog();
        dog1.makeSound();
        cat1.makeSound();
        dog2.sleep();

    }
}
