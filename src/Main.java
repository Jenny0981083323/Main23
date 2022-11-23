import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher T1=new Teacher("Kin",12345,45,"w");
        Student S1=new Student("joolse",12546,14,"java");
        //Teacher T2=new Teacher("Jenny",12345,45,"m");等於下面P.36
        People T2=new Teacher("Jenny",12345,45,"m");
        T1.teach();
        S1.eat();
        S1.sit();
        System.out.println(T1.equals(T2));
        System.out.println("......polymirphism....");
        //多型
        People[]peopleInSchool=new People[4];
        peopleInSchool[0]=T1;
        peopleInSchool[1]=T2;
        peopleInSchool[2]=S1;
        for (int i = 0; i < 3; i++) {

            System.out.println(peopleInSchool[i].name);
        }

        System.out.println(".......ArrayList.....");
        //ArrayList
        ArrayList<People>peopleInSchool1=new ArrayList<>();
        peopleInSchool1.add(T1);
        peopleInSchool1.add(S1);
        for(People p:peopleInSchool1){
            System.out.println(p.name);
        }

    }
}
