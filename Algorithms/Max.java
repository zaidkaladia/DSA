import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] zaid = {1,2,9,4,5,6};
        System.out.println(Max(zaid));
    }
    static int Max(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(i>max){
                max = i;
            } 
        }
        return max;
    }
}
