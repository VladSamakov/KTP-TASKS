package Second;

public class TextOps {

    public static String repeat(String str, int count)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < count; j++)
            {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int getDecimalPlaces(String str)
    {
        return str.length() - str.indexOf('.') - 1;
    }


    public static boolean isValid(String index)
    {
        if (index.length() > 5)
            return false;
        for (int i = 0; i < index.length(); i++)
        {
            if (!Character.isDigit(index.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isStrangePair(String str1, String str2)
    {
        return str1.charAt(str1.length() - 1) == str2.charAt(0) &&
                str2.charAt(str2.length() - 1) == str1.charAt(0);
    }

    public static boolean isPrefix(String word, String prefix)
    {
        String purePrefix = prefix.substring(0, prefix.length() - 1);
        return word.startsWith(purePrefix);
    }

    public static boolean isSuffix(String word, String suffix)
    {
        String pureSuffix = suffix.substring(1);
        return word.endsWith(pureSuffix);
    }
}