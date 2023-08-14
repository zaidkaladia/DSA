public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] zaid = {9,8,7,5,4,3,2,1};
        int find = 5;
        System.out.print(orderAgnosticBS(zaid,find));

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            boolean isInc = arr[end] > arr[start];
            if(isInc){
                if (arr[mid]<target){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if (arr[mid]<target){
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return start;
    }
}
