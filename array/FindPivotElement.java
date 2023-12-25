/*
 *Input: nums = [1,7,3,6,5,6]
        Output: 3
        Explanation:
        The pivot index is 3.
        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11 
 * 
 */

class FindPivotElement {

    // time complex - 0(N)

    public int pivotIndex(int[] nums) {
            int n = nums.length;
        int []left = new int[n];
        int []right = new int[n];
      
        // make left sum array
        for(int i = 1 ; i < n ; i++){
                left[i] = left[i-1] + nums[i-1];
        }
        // right sum arrn
         for(int i = n-2 ; i >= 0 ; i--){
                right[i] = right[i+1] + nums[i+1];
        }

         for(int i = 0 ; i < n ; i++){
              if(left[i]  == right[i]){
                  return i;
              }
        }
        return -1;
    }
}