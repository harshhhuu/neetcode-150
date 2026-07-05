class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i < str.length()) {
            int j=i;
            // Find #
            while(str.charAt(j) != '#') {
                j++;
            }
            // Getting Length of String
            int length = Integer.parseInt(str.substring(i,j));
            // Move after #
            j++;
            // Extracting String
            result.add(str.substring(j,j+length));
            // Next String in the list
            i = j+length;
        }
        return result;
    }
}
