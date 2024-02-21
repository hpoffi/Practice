package practice;

public class StudentRunner {
    public static void main(String[] args){
        int[] marks = {99,98,97,96,95};
        Student student = new Student("Ranga",marks);
        int number = student.getNumberOfMarks();
        System.out.println("Numberof marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("getTotalSumOfMarks: " + sum);
        int maximumMark = student.getMaximumMarks();
        int minimumMark = student.getMinimumMarks();
    }
    
}
