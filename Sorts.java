import java.util.Random;
public class Sorts{
  public static void main(String args[]){
  }
  public static int[] insertionSort(int[] data){
    for(int j = 1; j < data.length; j ++){
      int moving = data[j];
      for(int i = j - 1; i >= 0; i --){
        if(moving < data[i]){
          data[i + 1] = data[i];
        }else{
          data[i + 1] = moving;
          break;
        }
        if(i == 0 && moving < data[i]){
          data[i] = moving;
        }
      }
    }
    return(data);
  }


  public static int[] addAtIndex(int[] data, int element, int index, int oldindex){
    if(index == 0){
      for(int i = oldindex; i > 0; i --){
          data[i] = data[i - 1];
      } data[0] = element;
    }else{
      for(int i = oldindex; i >= index; i --){
          data[i] = data[i - 1];
      }data[index] = element;
    }
    return(data);
  }

  public static void selectionSort(int[] data){
    int smallest = 2147483647;
    int smallindex = 0;
    int last = 0;
    int current = 0;
    for(int j = last; j < data.length; j ++){
      for(int i = last; i < data.length; i ++){
        if(data[i] < smallest){
          smallest = data[i];
          smallindex = i;
        }

      }current = data[last];
      data[last] = smallest;
      data[smallindex] = current;
      last ++;
      smallest = 2147483647;
    }
  }

  public static void bubbleSort(int[] data){
    while(! sorted(data)){
      for(int i = 0; i < data.length - 1; i ++){
        int current = data[i];
        int next = data[i + 1];
        if(current > next){
          data[i] = next;
          data[i + 1] = current;
        }
      }
    }
  }
  public static boolean sorted(int[] data){
    for(int i = 0; i < data.length - 1; i ++){
      if(data[i] > data[i + 1]){
        return(false);
      }
    }return(true);
  }
  public static String toString(int[] data){
    if(data.length == 0){
      return("[]");
    }
    String str1 = "[";
    for(int i = 0; i < data.length - 1; i ++){
      str1 = str1 + data[i] + ", ";
    }
    str1 = str1 + data[data.length - 1] + "]";
    return(str1);
  }
}
