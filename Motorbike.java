public class Motorbike{

    private int speed;

    void setSpeed(int speed){
        if(speed > 0)
        this.speed=speed;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void increaseSpeed(int howMuch){
        this.speed =this.speed + howMuch;
    }
    
    public void decreaseSpeed(int howMuch){
        this.speed = this.speed - howMuch;
    }

    void start(){
        System.out.println("Bike started");
    }

}