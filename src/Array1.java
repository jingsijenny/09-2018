public class Array1 {
    public static void main(String[] args) {
        long[] array = new long[100];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++){
            array[i] = array[i-1] + array[i -2];
        }
        // print(array);

        long[] array2 = new long[10];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 6;
/*        for (int i = 4; i < array2.length; i++){
            array2[i] = 2 * array2[i -1];

        }
        print(array2);*/

        for (int i = 4; i < array2.length; i++) {
            long tmp = 0;
            for (int j = 0; j < i; j++) {
                tmp += array2[j];
            }
            array2[i] = tmp;
        }
        print(array2);

        int[][] d = new int[3][5];
        for (int r = 0; r < d.length; r++) {
            for (int c = 0; c < d[r].length; c++) {
                d[r][c] = 1;
            }
        }
    }
    public static void print(long[] input){
        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }

}