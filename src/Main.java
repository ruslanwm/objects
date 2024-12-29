
public class Main {
    public static void main(String[] args) {

        Student telebe = Student.doldurVeQaytar();
        Student telebe2 = Student.doldurVeQaytar();

        Student[] telebeList = new Student[2];

        telebeList[0]= telebe;
        telebeList[1]= telebe2;

        for (int i = 0; i<telebeList.length;i++) {

            telebeList[i].chapEt();
        }
    }
}