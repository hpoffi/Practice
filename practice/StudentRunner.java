package practice;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = { 99, 98, 97, 96, 95 };

        Student student = new Student("Ranga", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Numberof marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("getTotalSumOfMarks: " + sum);

        int maxmarks = student.getMaximumMarks();
        System.out.println("MaximumMarks: " + maxmarks);

        int minimarks = student.getMinimumMarks();
        System.out.println("MinimumMarks: " + minimarks);

        BigDecimal average = student.getAverageMarks();
        System.out.println("AverageMarks: " + average);
    }

}
