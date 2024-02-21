public class Motorbikerunner {
    public static void main(String[] args){
        Motorbike ducati = new Motorbike();
        Motorbike honda = new Motorbike();

        ducati.start();
        honda.start(); 

        ducati.setSpeed(100);

        // int ducatiSpeed =ducati.getSpeed();
        // ducatiSpeed = ducatiSpeed + 100;
        // ducati.setSpeed(ducatiSpeed);
        ducati.increaseSpeed(100);

        honda.setSpeed(80);

        int hondaSpeed =honda.getSpeed();
        hondaSpeed = hondaSpeed + 100;
        honda.setSpeed(hondaSpeed);


        System.out.println(ducati.getSpeed());


        System.out.println(honda.getSpeed());

        



        
    }  
    
}
