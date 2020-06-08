package Fourth;


public class Test {
	
	public static void test()
	{
		System.out.println("PART 4");
        System.out.println(TextOps.BessieEssay("Test essay", 2, 6));
        System.out.println(TextOps.Split("((()))(())()()(()())"));
        System.out.println(TextOps.toCamelCase("hello_edabit"));
        System.out.println(TextOps.toSnakeCase("helloEdabit"));
        System.out.println(NumberOps.overTime(16, 18, 30, 1.8));
		System.out.println(NumberOps.BMI("205 pounds", "73 inches"));
		System.out.println(NumberOps.bugger(999));
		System.out.println(TextOps.toShortHand("abbccc"));
        System.out.println(TextOps.doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(TextOps.trouble(451999277, 411777899));
		System.out.println(TextOps.countUniqueBooks("$AA$BBCATT$C$$B$", "$"));
		System.out.println();
	}
}
