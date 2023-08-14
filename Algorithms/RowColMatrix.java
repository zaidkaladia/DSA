import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}};
        
        System.out.println(Arrays.toString(Search(arr, 55)));
        
    }
    static int[] Search(int[][] arr, int target){
        int r = 0;
        int c = arr[r].length-1;
        while(r <= arr.length && c >=0){
            if (target == arr[r][c]){
                return new int[]{r,c}; 
            }
            else{
                if (target>arr[r][c]){
                    r++;
                }
                else{
                    c--;
                }
            }
        }
        return new int[]{r,c};
    }
}
