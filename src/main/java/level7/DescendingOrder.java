package level7;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] > chars[j - 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j - 1];
                    chars[j - 1] = temp;
                }
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }

    /*public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                    .chars()
                                    .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.joining()));
    }*/
}
