package First;

public class Tasks {

    public static int remainder(int first, int second)
    {
        return first % second;
    }

    public static double triArea(double base, double height)
    {
        return base * height / 2;
    }

    public static int animals(int chickens, int cows, int pigs)
    {
        return chickens * 2 + 4 * (cows + pigs);
    }

    public static boolean profitableGamble(double prob, double prize, double bet)
    {
        return bet < prize * prob;
    }

    public static String operation(int result, int num1, int num2)
    {
        if (num1 * num2 == result) return "multiplied";
        if (num1 + num2 == result) return "added";
        if (num1 - num2 == result) return "substracted";
        if (num1 / num2 == result && num1 / num2 == (double)num1 / num2) return "divided";
        return "none";
    }

    public static int ctoa(char character)
    {
        return character;
    }

    public static int addUpTo(int number)
    {
        int sum = 0;
        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static int nextEdge(int firstSide, int secondSide)
    {
        return firstSide + secondSide - 1;
    }

    public static int sumOfCubes(int[] array)
    {
        int sum = 0;

        for (int number : array)
        {
            sum += number * number * number;
        }
        return sum;
    }

    public static boolean abcmath(int a, int b, int c)
    {
        for (int i = 0; i < b; i++)
        {
            a += a;
        }

        return a % c == 0;
    }
}
