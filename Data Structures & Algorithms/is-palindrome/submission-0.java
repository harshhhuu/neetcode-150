class Solution {

    public boolean isPalindrome(String s) {

        StringBuilder clean = new StringBuilder();

        // Step 1: Keep only letters and digits
        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Reverse the cleaned string
        String original = clean.toString();
        String reversed = clean.reverse().toString();

        // Step 3: Compare
        return original.equals(reversed);
    }
}