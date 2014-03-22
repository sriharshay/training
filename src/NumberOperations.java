/**
 * NumberOperations
 */
public class NumberOperations
{
    public static void perform(char operation, int operandX, int operandY)
    {
        NumberOperations operations = new NumberOperations();
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
                throw new IllegalArgumentException("Operation '" + operation + "' not supported");
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
