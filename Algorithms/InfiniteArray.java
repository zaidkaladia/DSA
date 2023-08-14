public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
        int target = 10;
        int start = 0;
        int end = 1;
        while (arr[end]<target){
            int newStart = end+1;
            end = end + (end - start +1) * 2; //[no of elements between index no 4 and 1 -> 4-1 + 1]
            start = newStart;
        }
        System.out.println(binarySearch(arr, target, start, end));
        
    }
    static int binarySearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid]<target){
                start = mid+1;
            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
