import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
