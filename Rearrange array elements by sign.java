class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < positives.size(); i++) {
            result[index++] = positives.get(i); 
            result[index++] = negatives.get(i);  
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
    
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        int[] result1 = solution.rearrangeArray(nums1);
        System.out.println(Arrays.toString(result1)); 
        int[] nums2 = {-1, 1};
        int[] result2 = solution.rearrangeArray(nums2);
        System.out.println(Arrays.toString(result2)); 
    }
}

