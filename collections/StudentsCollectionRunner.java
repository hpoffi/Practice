package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class AscendingStudentComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return Integer.compare(student1.getId(), student2.getId());
    }
}
public class StudentsCollectionRunner{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Harshit"));
        students.add(new Student(4,"Ekansh"));
        students.add(new Student(3,"Bob"));

        List<Student> studentsAl =new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Asc: " + studentsAl);

        Collections.sort(studentsAl, new AscendingStudentComparator());
        System.out.println("Desc: " + studentsAl);

        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("Desc: " + studentsAl);

    }
}