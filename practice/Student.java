package practice;

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
        for(int marks : marks){
            sum+= marks;
        }
        return sum;
    }

    public int getMaximumMarks() {
        
        
    }

    public int getMinimumMarks() {
        
    }

}
