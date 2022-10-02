public class Solution {
    //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n==0) {
            return;
        } else {
            int[] resArr = new int[m + n];
            int idx1 = 0, idx2= 0;
            for (int i = 0 ; i < (m + n); i++) {
                if (idx1 < m && idx2 < n && nums1[idx1] < nums2[idx2]) {
                    resArr[i] = nums1[idx1];
                    idx1++;
                } else if (idx1 < m && idx2 < n && nums1[idx1] >= nums2[idx2])  {
                    resArr[i] = nums2[idx2];
                    idx2++;
                } else  if (idx1==m) {
                    resArr[i] = nums2[idx2];
                    idx2++;
                } else {
                    resArr[i] = nums1[idx1];
                    idx1++;
                }
            }

            for (int k = 0 ; k < (m + n); k++) {
                nums1[k] = resArr[k];
            }
        }
    }
}
