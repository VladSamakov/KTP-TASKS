package Second;

import java.util.Arrays;

public class Test {

    public static void test()
    {
        // все тесты взяты из заданий
        System.out.println("PART 2");
        System.out.println(TextOps.repeat("mice", 5));
        System.out.println(NumberOps.differenceMaxMin(new int[] { 10, 4, 1, 4, -10, -50, 32, 21 }));
        System.out.println(NumberOps.isAvgWhole(new int[] { 9, 2, 2, 5}));
        System.out.println(Arrays.toString(NumberOps.cumulativeSum(new int[] {3, 3, -2, 408, 3, 3})));
        System.out.println(TextOps.getDecimalPlaces("43.20"));
        System.out.println(NumberOps.Fibonacci(12));
        System.out.println(TextOps.isValid("59001"));
        System.out.println(TextOps.isStrangePair("ratio", "orator"));
        System.out.println(TextOps.isPrefix("automation", "auto-"));
        System.out.println(TextOps.isSuffix("arachnophobia", "-phobia"));
        System.out.println(NumberOps.boxSeq(3));
        System.out.println();
    }

}