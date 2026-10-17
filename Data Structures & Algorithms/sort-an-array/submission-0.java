class Solution {
     public int[] sortArray(int[] nums) {
        int[] tmp = new int[nums.length];     
        mergeSort(nums, tmp, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] a, int[] tmp, int lo, int hi) {
        if (lo >= hi) return;                  
        int mid = lo + (hi - lo) / 2;          
        mergeSort(a, tmp, lo, mid);
        mergeSort(a, tmp, mid + 1, hi);
        merge(a, tmp, lo, mid, hi);
    }

    private void merge(int[] a, int[] tmp, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) tmp[k] = a[k];  

        int i = lo;        
        int j = mid + 1;   
        for (int k = lo; k <= hi; k++) {
            if (i > mid)               a[k] = tmp[j++];   
            else if (j > hi)           a[k] = tmp[i++];   
            else if (tmp[i] <= tmp[j]) a[k] = tmp[i++];   
            else                       a[k] = tmp[j++];
        }
    }
}