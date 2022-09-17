import java.util.Arrays;

public class sort{
    public static void main(String [] args){
        int array[] = {7,0,8,4,1};

        Arrays.sort(array);

        //System.out.println(Arrays.toString(array));

        //Test
        if(Arrays.toString(array).equals("[0, 1, 4, 7, 8]")){
            System.out.println("Test Passed.");
        }
        else{
            System.out.println("Test Failed.");
        }
    }


}