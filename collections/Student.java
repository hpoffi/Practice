//how to use comparable interface implementation
package collections;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name){
        super();
        this.id=id;
        this.name=name;    
    } 

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public String toString(){
        return id +" "+ name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id, that.id); //sorted in ascending order 
        //return Integer.compare(that.id, this.id); // reversing the order of the list (desceding order)
       
    }
}