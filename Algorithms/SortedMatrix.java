import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(Search(arr, 9)));
        
    }
    static int[] Search(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == 1){
            return binarySearch(arr,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart < (rEnd-1)){
            int rMid = rStart + (rEnd-rStart)/2;
            if (arr[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }
            if (target>arr[rMid][cMid]){
                rStart = rMid;
            }
            else{
                rEnd = rMid;
            }
        }
        if (target<=arr[rStart][cMid] && target>=arr[rStart][0]){
            return binarySearch(arr,rStart,0,cMid,target);
        }
        if (target>=arr[rStart][cMid] && target<=arr[rStart][cols-1]){
            return binarySearch(arr,rStart,cMid,cols-1,target);
        }
        if (target<=arr[rStart+1][cMid] && target>=arr[rStart+1][0]){
            return binarySearch(arr,rStart+1,0,cMid,target);
        }
        if (target>=arr[rStart+1][cMid] && target<=arr[rStart+1][cols-1]){
            return binarySearch(arr,rStart+1,cMid,cols-1,target);
        }
        return new int[]{-1,-1};
    }
    static int[] binarySearch(int[][] arr,int row, int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart +(cEnd - cStart)/2;
            if (target < arr[row][mid]){
                cEnd = mid-1;
            }
            else if (target > arr[row][mid]){
                cStart = mid+1;
            } 
            else{
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
