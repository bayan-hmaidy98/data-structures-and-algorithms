import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println(Arrays.toString(binarySearch(new int[] {2,5,9,11},5)));
        System.out.println(Arrays.toString(binarySearch(new int[] {2,5,9,11},4)));
    }

    public static int[] binarySearch(int[] array, int value){
        int min = 0;
        int max = array.length-1;
        int middle;
        while(min == max || min < max){
            middle = floor((min + max) / 2);
            if(array[middle] > value){
                max = middle -1;
            }
            else if(array[middle] < value){
                min = middle + 1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
}