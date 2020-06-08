package Fifth;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Test {

    public static void test() throws NoSuchAlgorithmException {
        System.out.println("PART 5");
        System.out.println(Arrays.toString(Text.encrypt("Hello")));
        System.out.println(Text.decrypt(new int[]{72, 29, 7, 0, 3}));
        System.out.println(Fifth.Chess.canMove("Pawn", "E2", "E4"));
        System.out.println(Text.canComplete("butl", "beautiful"));
        System.out.println(Fifth.Math.sumDigProd(new int[] {0}));
        System.out.println(Text.sameVowelGroup(new String[] {"hoops", "chuff", "bot", "bottom"}));
        System.out.println(Fifth.Card.validateCard(1234567890123452L));
        System.out.println(Fifth.NumbersToWords.toEng(919));
        System.out.println(Fifth.NumbersToWords.toRus(919));
        System.out.println(Text.getSha256Hash("password123"));
        System.out.println(Text.correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(Fifth.Math.hexLattice(37));
        System.out.println();
    }
}
