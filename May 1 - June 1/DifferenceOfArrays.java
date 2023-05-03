class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i =0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        
        for(int i =0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        
        List<Integer> list1 = new ArrayList<>();
        
        for(int i =0;i<nums1.length;i++){
            if(!set2.contains(nums1[i]) && !list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        
        List<Integer> list2 = new ArrayList<>();
        
            for(int i =0;i<nums2.length;i++){
            if(!set1.contains(nums2[i]) && !list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        
        ans.add(list1);
        ans.add(list2);
        return ans;
        
    }
}