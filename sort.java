import java.util.Arrays;

public class sort{
    public static void main(String [] args){

        //Branch 1 sorts 20 integers, ranging from 0 - 1067.
        int array[] = {1067,6,9,79,2,3,23,29,12,389};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}