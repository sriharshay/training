/**
 * HelloWorld
 */
public class HelloWorld
{

    public static void main(String[] args)
    {
        NumberTriangle triangle = new NumberTriangle(6);
        //triangle.printTriangle();
        //NumberPyramid.printPyramid(12);
        NumberOperations.perform('*', 67, 45);
        NumberOperations.perform('+', 67, 45);
        NumberOperations.perform('-', 67, 45);
        NumberOperations.perform('%', 67, 45);
    }
}
