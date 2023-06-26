import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        // Create a frequency map to store the count of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the string to build the frequency map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character by iterating over the string again
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequencyMap.get(c) == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }

        return -1; // If no non-repeating character is found, return -1
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Index of the first non-repeating character in \"" + s1 + "\": " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Index of the first non-repeating character in \"" + s2 + "\": " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Index of the first non-repeating character in \"" + s3 + "\": " + firstUniqChar(s3));
    }
}
