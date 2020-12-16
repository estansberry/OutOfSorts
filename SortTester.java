import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SortTester{
  public static void main(String args[]){
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray(10))));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray(50))));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray(0))));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray(1))));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray(25))));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray(2))));
  }
  public static int[] RandomtoArray(int length){
    int seednum = ThreadLocalRandom.current().nextInt();
    Random num = new Random(seednum);
    int[] arr = new int[length];
    for(int i = 0; i < length; i ++){
      arr[i] = (num.nextInt() % 100);
    }System.out.print("Random seed: ");
    System.out.println(seednum);
    System.out.print("Array length: ");
    System.out.println(length);
    System.out.print("Array being tested: ");
    System.out.println(Sorts.toString(arr));
    return(arr);
  }

}
