public class Book {
    public static void main(String[] args){
        Readbook Art_of_computer_programming = new Readbook();
        Readbook Effective_java  = new Readbook();
        Readbook Clean_code = new Readbook();

        Art_of_computer_programming.read();
        Effective_java.read();
        Clean_code.read();

        Art_of_computer_programming.setCopies(100);
        Effective_java.setCopies(90);
        Clean_code.setCopies(50);;

    }
}
