public class Solution {
    //[0,1,2,2,3,0,4,2], val = 2
    public int removeElement(int[] nums, int val) {
        int dubCnt = 0;
        int endIdx = nums.length - 1;

        for (int i = 0; i <= endIdx;) {
            if (nums[i] == val) {
                nums[i] = nums[endIdx];
                nums[endIdx] = 0;
                endIdx--;
                dubCnt++;
            } else {
                i++;
            }
        }

        return nums.length - dubCnt;
    }
}