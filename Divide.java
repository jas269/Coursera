package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Base{
    // TODO -- start your code here

    //Variable to hold the quotient
    private int quotient = 0;

    //Variable to hold the remainder
    private int remainder = 0;

    //Consructor to the class
    public Divide(int num1, int num2)
    {
        super(num1,num2); //Using the super construct to call the base class constructor
    }

    //Method to perform the divide operation
    public String operate()
    {
        //Catching the divide by zero exception
        if(super.number2 == 0) {
            return ("Divide by 0 error");
        }
        else {
            quotient = super.number1 / super.number2;
            remainder = super.number1 % super.number2;

            //returning a string value
            return (quotient +" R: "+remainder);
        }


    }
}
