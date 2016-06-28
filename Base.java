package mooc.vandy.java4android.calculator.logic;

/**
 * Base Class is the super class inherited by all
 * the Add, Subtract, Multiply and Divide classes
 */
public class Base {

    //Variable to hold the value of the first integer entered
    protected int number1 = 0;

    //Variable to hold the value of the first integer entered
    protected int number2 = 0;

    //Variable to hold the operator
    public int operator = 0;

    //Overloaded Constructors to the class
    public Base(int num1, int num2)
    {
        this.number1 = num1;
        this.number2 = num2;
    }

    //Method to convert the result into a string
    public String toString(int result)
    {
        return (result +"");
    }

}
