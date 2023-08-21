public class BinarySearch {
    public static void main(String[] args) {
        int[] zaid = {1,2,3,4,6,7,8,9};
        int find = 9;
        // System.out.println(binarySearch(zaid, find));
        System.out.println(recBinarySearch(zaid,find,0,zaid.length-1));
    }
    // static int binarySearch(int[] arr,int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start <= end){
    //         int mid = start + (end-start)/2;

    //         if (arr[mid]<target){
    //             start = mid+1;
    //         }
    //         else if (arr[mid]>target){
    //             end = mid-1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return arr[end];

    // }

    static int recBinarySearch(int[] arr,int target,int start,int end){
        int mid = start + (end-start)/2;
        
        if(start>end){
            return -1;
        }
        if (arr[mid] == target) return mid;
        
        if(target < arr[mid]) return recBinarySearch(arr, target, start, mid-1);
        return recBinarySearch(arr, target, mid+1, end);
        
    }
}
