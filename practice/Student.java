package practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        //TODO Auto-generated constructor stub
        this.name = name;
        this.marks = marks;
         
    }

    public int getNumberOfMarks() {
        return marks.length;
        
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark : marks){
            sum+= mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        int maxmarks = 0;
        for(int mark : marks){
            if(mark > maxmarks){
                maxmarks = mark;
            }
        }
        return maxmarks;

          
    }

    public int getMinimumMarks() {
        int minimarks =100;
        for(int mark : marks){
            if(mark < minimarks){
                minimarks = mark;
            }
        }
        return minimarks;
        
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
         return new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);
    }

}
