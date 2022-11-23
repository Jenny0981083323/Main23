public class Main {
    public static void main(String[] args) {
        Teacher T1=new Teacher("Kin",12345,45,"w");
        Student S1=new Student("joolse",12546,14,"java");
        Teacher T2=new Teacher("Jenny",12345,45,"m");
        T1.teach();
        S1.eat();
        S1.sit();
        System.out.println(T1.equals(T2));
        }
}
