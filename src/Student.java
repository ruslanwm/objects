import java.util.Scanner;

public class Student {

    public String name;
    public int groupNum;
    public int age;


    public void chapEt() {
        System.out.println(name+" "+groupNum+" "+age);
    }

    public static Student doldurVeQaytar() {
        Student s = new Student();
        s.name=new Scanner(System.in).nextLine();
        s.groupNum=new Scanner(System.in).nextInt();
        s.age=new Scanner(System.in).nextInt();
        
        return s;
    }


}
