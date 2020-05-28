package Second;

public class NumberOps {

    private static int Max(int[] numbers)
    {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > result)
                result = numbers[i];
        }
        return result;
    }

    private static int Min(int[] numbers)
    {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < result)
                result = numbers[i];
        }
        return result;
    }

    
    public static int differenceMaxMin(int[] numbers)
    {
        return Max(numbers) - Min(numbers);
    }

    private static double Avg(int[] numbers)
    {
        int result = 0;
        for (int el : numbers)
        {
            result += el;
        }
        return (double)result / numbers.length;

    }
    
    public static boolean isAvgWhole(int[] numbers)
    {
        double avg = Avg(numbers);
        return avg == (int)avg;
    }

    public static int[] cumulativeSum(int[] numbers)
    {
        int[] result = new int[numbers.length];
        result[0] = numbers[0];

        for (int i = 1; i < result.length; i++)
        {
            result[i] = numbers[i];
            result[i] += result[i - 1];
        }

        return result;
    }

    public static int Fibonacci(int num)
    {
        if (num == 1) return 1;
        if (num == 2) return 2;
        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }

    public static int boxSeq(int step)
    {
        if (step % 2 == 0)
            return step;
        else
            return step + 2;
    }

}