package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Base{
    // TODO -- start your code here

    //Variable to hold the result
    private int resultSubtract = 0;

    //Consructor to the class
    public Subtract(int num1, int num2)
    {
        super(num1, num2);//Using the super construct to call the base class constructor
    }

    //Method to perform the subtract operation
    public String operate()
    {
     resultSubtract = super.number1 - super.number2;

        //Calling the toString method from the base class to return a string value
        return (toString(resultSubtract));
    }
}
