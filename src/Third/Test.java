package Third;

public class Test {

    public static void test()
    {
        System.out.println("PART 3");
        System.out.println(NumberOps.solutions(1, 0, -1));
        System.out.println(TextOps.findZip("all zip files are zipped"));
        System.out.println(NumberOps.checkPerfect(496));
        System.out.println(TextOps.flipEndChars("Cat, dog and mouse."));
        System.out.println(TextOps.isValidHexCode("#CD5C5C"));
        System.out.println(Arrays.same(new int[]{1, 3, 4, 4, 4}, new int[]{2, 5, 7}));
        System.out.println(NumberOps.isKaprekar(297));
        System.out.println(TextOps.longestZero("01100001011000"));
        System.out.println(NumberOps.nextPrime(24));
        System.out.println(NumberOps.rightTriangle(145, 105, 100));
        System.out.println();
    }
}
