public class Main {
   public static void main(String[] args) {

   int[] arr = {6, 54, 23, 13, -21, 5, 67, 5, -8, 0};

   int[] sortedArr = sort(arr);

   for(int i: sortedArr)
      System.out.print(i + " ");

   }

   private static int[] sort(int[] arr) {
      int temp;

      for(int i=0; i<arr.length-1; i++) {
         for(int j=0; j<arr.length-i-1; j++) {
            if(arr[j] > arr[j+1]) {
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }

      return arr;
   }

}
