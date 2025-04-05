import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()) {
            return 0;
        } else {
            int sum = 0;
            for (int n : L) {
                sum += n;
            }
            return sum;

        }
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> ret = new ArrayList<>();
        for (int n : L) {
            if (n % 2 == 0) {
                ret.add(n);
            }
        }
        return ret;
    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> ret = new ArrayList<>();
        for (int i : L1) {
            for (int j : L2) {
                if (i == j) {
                    ret.add(i);
                }
            }
        }
        return ret;
    }


    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        //错误版本
//        int count = 0;
//        for (String n : words) {
//            if (n.contains(c)) {
//                count++;
//            }
//        }
//        return count;
//    }
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
