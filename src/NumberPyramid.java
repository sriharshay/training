/**
 * NumberPyramid
 */
public class NumberPyramid
{
    /*
    5

    1 -        1
    2 -      1 2 1
    3 -    1 2 3 2 1
    4 -  1 2 3 4 3 2 1
    5 - 1 2 3 4 5 4 3 2 1

    Number has to be less than 34 to view valid pyramid its because of space
     */

    public static void printPyramid(int count)
    {
        if (count < 2 || count > 34)
        {
            throw new IllegalArgumentException("Provide a integer value less than 35 or greater than 2 to view perfect number pyramid");
        }
        for (int i = 1; i <= count; i++)
        {
            for (int j = 1; j <= count - i; j++)
            {

                System.out.print(" ");
            }
            printNumbers(i, count);
            System.out.println();
        }
    }

    private static void printNumbers(int i, int totalLines)
    {
        int lineNumber = i;
        for (int k = 1; k <= lineNumber; k++)
        {
            for (int m = totalLines - lineNumber; m >= 0 && k == 1; m--)
            {
                System.out.print(" ");
            }
            System.out.print(k + " ");
        }
        for (int k = lineNumber; k > 1; k--)
        {
            System.out.print((k - 1) + " ");
        }
    }
}
