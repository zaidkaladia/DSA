import java.util.Arrays;

public class LinSer {
    
    public static void main(String[] args) {
        int[][] zaid = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int target = 9;
        System.out.println(Arrays.toString(linearSearch(zaid, target)));


        }
    static int[] linearSearch(int[][] arr,int target ){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}