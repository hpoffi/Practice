class Refdemo{
    public static void mian(String[] args){
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Boxinherit plainbox = new Boxinherit();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " +vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        plainbox = weightbox; //assign reference  

        vol = plainbox.volume();
        System.out.println("Volume of plainbox is " + vol);

    }
}