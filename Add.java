package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Base {
    // TODO -- start your code here

    //Variable to hold the result
    private int resultAdd = 0;

    //Consructor to the class
    public Add(int num1, int num2)
    {
        super(num1, num2);//Using the super construct to call the base class constructor
    }

    //Method to perform the add operation
    public String operate()
    {
        resultAdd = super.number1 + super.number2;

        //Calling the toString method from the base class to return a string value
        return (toString(resultAdd));
    }
}
