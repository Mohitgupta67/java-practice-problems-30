
import java.util.*;

public class Main {

    public static void printSubsequences(String str, String ans, HashSet<String> set) {

        // Base case
        if (str.length() == 0) {
            set.add(ans);
            return;
        }

        // Include the current character
        printSubsequences(str.substring(1), ans + str.charAt(0), set);

        // Exclude the current character
        printSubsequences(str.substring(1), ans, set);
    }

    public static void main(String[] args) {

        String str = "aaa";

        HashSet<String> set = new HashSet<>();

        printSubsequences(str, "", set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}