class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Creating a HashMap to store frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the freq. of each number
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Convert the HashMap into a List of Map Entries
        // Each entry contains (number, frequency)
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list in descending order of frequency
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Create an array to store the top k frequent elements
        int[] ans = new int[k];
        // Pick the first k elements from the sorted list
        for(int i=0; i<k; i++) {
            ans[i] = list.get(i).getKey();
        }
        // Return Answer
        return ans;
    }
}
