import java.util.Random;
public class Sorts{
  public static void main(String args[]){

  }
  public static int[] bubbleSort(int[] data){
    while(! sorted(data)){
      for(int i = 0; i < data.length - 1; i ++){
        int current = data[i];
        int next = data[i + 1];
        if(current > next){
          data[i] = next;
          data[i + 1] = current;
        }
      }
    }System.out.print("Final array: ");
    System.out.println(toString(data));
    return(data);
  }
  public static boolean sorted(int[] data){
    for(int i = 0; i < data.length - 1; i ++){
      if(data[i] > data[i + 1]){
        return(false);
      }
    }return(true);
  }
  public static String toString(int[] data){
    String str1 = "[";
    for(int i = 0; i < data.length; i ++){
      str1 = str1 + data[i] + ", ";
    }str1 = str1 + "]";
    return(str1);
  }
}
