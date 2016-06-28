package mooc.vandy.java4android.calculator.logic;

import android.widget.Switch;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */

    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        //Constant for the add operation
        final int ADDOPERATOR = 1;

        //Constant for the subtract operation
        final int SUBTRACTOPERATOR = 2;

        //Constant for the multiply operation
        final int MULTIPLYOPERATOR = 3;

        //Constant for the divide operation
        final int DIVIDEOPERATOR = 4;

        //Variable to hold the result
        String resultString = null;

        /* Creating the instance of the Base class
        which is inherited by the
        Add, Subtract, Multiply and Divide Classes */
        Base base = new Base(argumentOne, argumentTwo);

        //Using switch case instead of the if-else loops
        switch(operation)
        {
            case ADDOPERATOR:
                //Instance of the Add class
                Add add = new Add(argumentOne, argumentTwo);

                //Calling the method to perform addition
                resultString = (add.operate());
                break;

            case SUBTRACTOPERATOR:
                //Instance of the Subtract class
                Subtract subtract = new Subtract(argumentOne, argumentTwo);

                //Calling the method to perform subtraction
                resultString = (subtract.operate());
                break;

            case MULTIPLYOPERATOR:
                //Instance of the Multiply class
                Multiply multiply = new Multiply(argumentOne, argumentTwo);

                //Calling the method to perform multiplication
                resultString = (multiply.operate());
                break;

            case DIVIDEOPERATOR:
                //Instance of the Division class
                Divide divide = new Divide(argumentOne, argumentTwo);

                //Calling the method to perform division
                resultString = (divide.operate());
                break;

        }

        //This method is called to print the output in the out textbox
        mOut.print(resultString);
    }
}
