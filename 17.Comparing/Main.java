import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student mehedi = new Student(34, 67.89f);
        // Student aurnob = new Student(5, 67.89f);
        // Student aurnob = new Student(5, 89.67f);
        Student aurnob = new Student(5, 9.67f);

        // if (mehedi.compareTo(aurnob) < 0) {
        //     System.out.println("aurnob  is greater than mehedi");
        // }
        // if (mehedi.compareTo(aurnob) > 0) {
        //     System.out.println("aurnob  is smaller than mehedi");
        // }

        // if (mehedi.compareTo(aurnob) == 0) {
        //     System.out.println("Both are equal");
        // }

        Student lewa = new Student(4, 89.67f);
        Student taa = new Student(8, 79.67f);
        Student macca = new Student(3, 69.67f);

        Student[] list ={mehedi,aurnob,lewa,taa,macca};

        System.out.println(Arrays.toString(list));

        // Arrays.sort(list , new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         //return (int)(o1.marks-o2.marks); //asscending

        //         return -(int)(o1.marks-o2.marks); //desscending
        //     }
        // });

        Arrays.sort(list,(o1,o2) -> (int)(o1.marks - o2.marks));  //lamda functions
        System.out.println(Arrays.toString(list));
    }
}
