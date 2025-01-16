import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        StringMatching sm = new StringMatching();

        // Test cases
        String[] words1 = {"mass", "as", "hero", "superhero"};
        System.out.println(sm.stringMatching(words1)); // Output: ["as", "hero"]

        String[] words2 = {"leetcode", "et", "code"};
        System.out.println(sm.stringMatching(words2)); // Output: ["et", "code"]

        String[] words3 = {"blue", "green", "bu"};
        System.out.println(sm.stringMatching(words3)); // Output: []
    }
}
