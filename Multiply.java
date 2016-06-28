package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Base{
    // TODO -- start your code here

    //Variable to hold the result
    private int resultMultiply = 0;

    //Consructor to the class
    public Multiply(int num1, int num2)
    {
        super(num1, num2);//Using the super construct to call the base class constructor
    }

    //Method to perform the multiply operation
    public String operate()
    {
        resultMultiply = super.number1 * super.number2;

        //Calling the toString method from the base class to return a string value
        return (toString(resultMultiply));
    }
}
