class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums1 = 0;
        int indexNums2 = 0;
        int indexSolution = 0;
        int[] solution = new int[m + n];
        // Merge both arrays until one is exhausted
        while (indexNums1 < m && indexNums2 < n) {
            if (nums1[indexNums1] < nums2[indexNums2]) {
                solution[indexSolution++] = nums1[indexNums1++];
            } else {
                solution[indexSolution++] = nums2[indexNums2++];
            }
        }
        while (indexNums1 < m) {
            solution[indexSolution++] = nums1[indexNums1++];
        }
        while (indexNums2 < n) {
            solution[indexSolution++] = nums2[indexNums2++];
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = solution[i];
        }
    }
}