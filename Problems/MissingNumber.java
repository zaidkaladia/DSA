// https://leetcode.com/problems/missing-number/

class MissingNumber {
    public int missingNumber(int[] arr) {
        int i=0;
        while (i<arr.length){
            if (arr[i]!=arr.length && arr[i] != arr[arr[i]]){
                Swap(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }
        for(int j = 0 ; j<arr.length;j++){
            if (arr[j]!=j){
                return j;
            }

        }
        return arr.length;
    }
    static void Swap(int[] arr,int index1,int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}