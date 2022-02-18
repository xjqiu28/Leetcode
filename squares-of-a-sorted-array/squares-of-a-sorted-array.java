class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }
        for (int i =0; i< arr.length; i++){
            for (int j =0; j<arr.length; j++){
                int temp =0;
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}