import java.util.Arrays;

import static java.lang.Math.floor;

public class Main {

  public static void main(String[] args){
    System.out.println(binarySearch(new int[] {2,5,9,11},5));
    System.out.println(binarySearch(new int[] {2,5,9,11},4));
  }

  public static int binarySearch(int[] array, int value){
    int min = 0;
    int max = array.length-1;
    int middle;
    while(min == max || min < max){
      middle = (int) Math.floor((min + max) / 2);
      if(array[middle] > value){
        max = middle -1;
      }
      else if(array[middle] < value){
        min = middle + 1;
      }
      else {
        return middle;
      }
    }
    return -1;
  }

}
