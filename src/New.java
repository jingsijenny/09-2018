public class New{
    public static void main (String[] args){
        int[] aa = new int[]{9,8,12,5,7,4,1};
        sort(aa);
        for (int e : aa){
            System.out.println(e);
        }
    }


    public static void sort(int[] input){
        int n = input.length;
        for (int i = 0; i < n; i++){
            int temp = Integer.MIN_VALUE;
            int index = i;
            for (int j = i; j < n; j++){
                if (input[j] > temp){
                    temp = input[j];
                    index = j;
                }
            }
            swap(input, i, index);
        }
    }


    public static void swap(int[] input, int i, int j){
        int a  = input[i];
        input[i] = input[j];
        input[j] = a;
    }
}