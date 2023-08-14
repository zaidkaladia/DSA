import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] zaid = {1,2,4,5,6};
        System.out.println(Arrays.toString(zaid));
        Rev(zaid);
        System.out.println(Arrays.toString(zaid));

    }
    static void Rev(int[] arr){
        int start = 0;
        int end = (arr.length - 1);
        while(start < end){
            Swap(arr, start, end); 
            start = start + 1;
            end = end - 1;
        }
    }
    static void Swap(int[] arr,int index1,int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
