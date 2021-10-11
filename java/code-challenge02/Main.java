
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftedArray(new int[] { 2, 4, 6, -8 }, 5)));
        System.out.println(Arrays.toString(shiftedArray(new int[] { 42, 8, 15, 23, 42 }, 16)));
    }

    public static int [] shiftedArray (int [] array, int value) {
        int [] arrayShifted = new int[array.length +1]; 
        int middle = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1; // specify the middle position of the input array

        for(int i = 0 ; i <= array.length ; i++) {
            if (i == middle) {
               arrayShifted[i] =  value;
            }
            else if  (i > middle) {
                arrayShifted[i] = array[i-1];
            }
            else {
                arrayShifted[i] = array[i];
            }
        }
        return arrayShifted;
    }

}

