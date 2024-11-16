
public class Main {
  public static boolean duplicate(int number[]) {

      int count = 0;
      int n = number.length;
      for (int i = 0; i < n; i++) {
          for (int j = i+1; j < n; j++) {

              if (number[i] == number[j]) {
                  count++;
                  return true;
                 // count++;
              }

          }
      }

      return false ;
  }
          public static void main (String[]args){
              int number[] = {1, 3,  3, 8, 4, 11, 2, 34, 23};
              System.out.println(duplicate(number));
          }
      }