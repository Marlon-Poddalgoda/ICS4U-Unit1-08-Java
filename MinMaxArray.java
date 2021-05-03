import java.util.Random;
/**
 * This program generates 10 random numbers and finds the max/min values.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-03
 */

public final class MinMaxArray {
    private MinMaxArray() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method finds the max value.
    * @param array This value is the array.
    * @return maxValue This value holds the maximum value.
    */
    public static int maxValue(final int[] array) {

        // checkstyle wanted this as a constant
        final int startValue = 0;

        int maxValue = startValue;

        for (int counter = 0; counter < array.length; counter++) {
            // loop goes through each value, checking for highest
            if (array[counter] > maxValue) {
                // if value is higher than current maxValue,
                //  set maxValue to that value
                maxValue = array[counter];
            } else {
                maxValue += 0;
            }
        }

        // return statement
        return maxValue;
    }

    /**
    * This method finds the min value.
    * @param array This value is the array.
    * @return minValue This value holds the minimum value.
    */
    public static int minValue(final int[] array) {

        // checkstyle wanted this as a constant
        final int startValue = 99;

        int minValue = startValue;

        for (int counter = 0; counter < array.length; counter++) {
            // loop goes through each value, checking for lowest
            if (array[counter] < minValue) {
                // if value is lower than current minValue,
                //  set minValue to that value
                minValue = array[counter];
            } else {
                minValue += 0;
            }
        }

        // return statement
        return minValue;
    }

    /**
    * This method generates 10 random numbers and places then within an array.
    * @param args
    */
    public static void main(final String[] args) {

        // Constants
        final int arrayLength = 10;
        final int randomRange = 99;

        // creating array
        int[] randomArray = new int[arrayLength];

        // random number variable
        Random rand = new Random();

        // program information
        System.out.println("This program creates 10 random numbers and finds "
            + "the min and max values.");
        System.out.println();

        // for loop to place random numbers within array
        for (int counter = 0; counter < arrayLength; counter++) {
            // generating random numbers
            randomArray[counter] = rand.nextInt(randomRange);
            System.out.println(randomArray[counter]);
        }

        // call max function
        int highestValue = maxValue(randomArray);
        // call min function
        int lowestValue = minValue(randomArray);

        System.out.println();
        System.out.println("The highest value is " + highestValue);
        System.out.println("The lowest value is " + lowestValue);

        System.out.println();
        System.out.println("Done.");
    }
}
