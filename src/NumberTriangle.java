/**
 * Created by Sriharsha on 21-03-2014.
 */
public class NumberTriangle
{
    /*
    5

    1 - 1
    2 - 11
    3 - 121
    4 - 1231
    5 - 12341
     */
    private int lines = 0;

    public NumberTriangle(int i)
    {
        lines = i;
    }

    public void printTriangle()
    {
        int lineNumbers = lines + 2;
        for (int i = 1; i < lineNumbers; i++)
        {
            for (int j = 1; j < i; j++)
            {
                if (j > 1 && (j == (i - 1)))
                {
                    System.out.print(i - j);
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
