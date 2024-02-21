public class ArrayMagic{
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        if (array.length == 0){
            return false;
        }

        for(int value:array){
            if(value > number){
                return true;
            }
        }
        return false;

    }
}