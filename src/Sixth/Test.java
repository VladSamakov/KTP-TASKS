package Sixth;

import javax.script.ScriptException;
import java.util.Arrays;

public class Test {

    public static void test() throws ScriptException {
        System.out.println("PART 6");
        System.out.println(NumberOps.Bell(10));
        System.out.println(TestOps.translateWord("button"));
        System.out.println(TestOps.translateSentence("Do you think, it is going to rain today?"));
        System.out.println(TestOps.validColor("rgb(255,255,255,0.2342)"));
        System.out.println(TestOps.stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[] {"b", "a"}));
        System.out.println(Arrays.toString(TestOps.getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));
        System.out.println(NumberOps.ulam(206));
        System.out.println(TestOps.longestNonrepeatingSubstring("abcde"));
        System.out.println(NumberOps.convertToRoman(16));
        System.out.println(NumberOps.formula("6 * 4 = 24"));
        System.out.println(NumberOps.palindromeDescendant(123312));
    }


}
