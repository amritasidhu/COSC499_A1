import java.util.Arrays;

public class sort{
    public static void main(String [] args){

        //Branch 1 sorts 20 integers, ranging from 0 - 1067.
        int array[] = {1067,7,0,17,50,8,4,119,5,202,1,34,6,9,79,2,3,23,29,12};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}