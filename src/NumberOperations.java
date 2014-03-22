/**
 * Created by Sriharsha on 22-03-2014.
 */
public class NumberOperations
{
    public static void perform(char operation, int operandX, int operandY)
    {
        switch (operation)
        {
            case '+':
                performAddition(operandX, operandY);
                break;
            case '-':
                performSubtraction(operandX, operandY);
                break;
            case '*':
                performMultiplication(operandX, operandY);
                break;
            default:
                System.out.println("Operation not supported");
        }

    }

    private static void performMultiplication(int operandX, int operandY)
    {
        System.out.println(operandX + " * " + operandY + " = " + (operandX * operandY));
    }

    private static void performSubtraction(int operandX, int operandY)
    {
        System.out.println(operandX + " - " + operandY + " = " + (operandX - operandY));

    }

    private static void performAddition(int operandX, int operandY)
    {
        System.out.println(operandX + " + " + operandY + " = " + operandX + operandY);
    }
}
