import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-3,1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = MaxRange(arr, 0, lastIndex);
            if (maxIndex != lastIndex){
                int temp = arr[maxIndex];
                arr[maxIndex]=arr[lastIndex];
                arr[lastIndex] = temp;
            }
        }

    }
    static int MaxRange(int[] arr,int index1 ,int index2){
        int max = arr[index1];
        int maxIndex = index1;
        for (int i = index1; i <= index2; i++) {
            if (max< arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
