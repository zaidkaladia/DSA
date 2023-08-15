import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    //my solution
    // static void cyclic(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         while(arr[i] != i+1){
    //             int temp = arr[arr[i]-1];
    //             arr[arr[i]-1] = arr[i];
    //             arr[i]= temp;
    //         }  
    //     }
    // }
    //kunals solution
    static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                Swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void Swap(int[] arr,int index1,int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
