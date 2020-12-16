import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SortTester{
  public static void main(String args[]){
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray())));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray())));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray())));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray())));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray())));
    System.out.println(Sorts.sorted(Sorts.bubbleSort(RandomtoArray())));
  }
  public static int[] RandomtoArray(){
    int seednum = ThreadLocalRandom.current().nextInt();
    Random num = new Random(seednum);
    int[] arr = new int[10];
    for(int i = 0; i < 10; i ++){
      arr[i] = (num.nextInt() % 100);
    }System.out.print("Random seed: ");
    System.out.println(seednum);
    System.out.print("Array being tested: ");
    System.out.println(Sorts.toString(arr));
    return(arr);
  }

}
