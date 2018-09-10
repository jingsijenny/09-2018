public class DoubleForLoop {
    public static void print(long[] input){
        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
    public static void main(String[] args){
      /* long[] array2 = new long[10];
       array2[0] = 1;
       array2[1] = 2;
    for (int i = 2; i < array2.length; i++) {
            array2[i] = 0;
            for (int j = 0; j < i; j++) {
                array2[i] = array2[i] + array2[j];
            }
         }
        print(array2);
    */


   /* int[][] doublearray = new int[10][10];
    for (int i = 0; i < doublearray.length; i++) {
        for (int j = 0; j < doublearray[i].length; j++) {
            if (i == j || i + j == 9) {
                doublearray[i][j] = 1;
            }
        }
    }*/


     /* public static void print2D(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length;j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
   }*/


/* public static void swap(int[] input) {
       int a = input[0];
       input[0] = input[1];
       input[1] = a;
   }*/

// Sort Min to Max
        int[] aa = new int[]{9,8,12,5,7,4,1};
        sort(aa);
        for (int a : aa) {
            System.out.println(a);
        }
   }


   public static void sort(int[] input) {
        int n = input.length;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < n; j++) {
                if (input[j] < tmp) {
                    tmp = input[j];
                    index = j;
                }
            }
            swap2(input, i, index);
        }
   }


   public static void swap2 (int[] input, int i, int j) {
        int a = input[i];
        input[i] = input[j];
        input[j] = a;
   }


  /* public static int acce() {
       int intArray[ ][ ]={{1,2},{2,3},{3,4,5}};

       int a = 5;
        for (int i = 0; i < 10; i ++) {
            a = a + i;
        }
       System.out.println(a);
        return a;
   }*/
}
