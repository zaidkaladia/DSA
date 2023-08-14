import java.util.Arrays;

public class ary {
    public static void main(String[] args) {
        int[] zaid = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(zaid));
        Swap(zaid,2,4);
        System.out.println(Arrays.toString(zaid));
    }
    static void Swap(int[] arr,int index1,int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
