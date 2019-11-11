package level8;

import java.util.NoSuchElementException;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        if (args.length == 0) {
            throw new NoSuchElementException();
        }

        int min = args[0];
        for (int value :
            args) {
            min = min > value ? value : min;
        }
        return min;
    }

}
