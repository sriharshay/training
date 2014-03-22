/**
 * NumberOperations
 */
public class NumberOperations
{
    private static NumberOperations operations = new NumberOperations();
    public static void perform(char operation, int operandX, int operandY)
    {
        switch (operation)
        {
            case '+':
                operations.performAddition(operandX, operandY);
                break;
            case '-':
                operations.performSubtraction(operandX, operandY);
                break;
            case '*':
                operations.performMultiplication(operandX, operandY);
                break;
            default:
                System.out.println("Operation '" + operation + "' not supported");
                break;
        }

    }

    private void performMultiplication(int operandX, int operandY)
    {
        System.out.println(operandX + " * " + operandY + " = " + (operandX * operandY));
    }

    private void performSubtraction(int operandX, int operandY)
    {
        System.out.println(operandX + " - " + operandY + " = " + (operandX - operandY));
    }

    private void performAddition(int operandX, int operandY)
    {
        System.out.println(operandX + " + " + operandY + " = " + (operandX + operandY));
    }
}
