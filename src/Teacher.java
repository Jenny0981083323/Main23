public class Teacher extends   People {


    private  String subjectName;

    public Teacher(String name, int id, int age, String subjectName) {
        super(name, id, age);//呼叫父類別的建構子
        this.subjectName=subjectName;
    }
    public  void teach(){
        System.out.println("teaching ...");
    }


}
