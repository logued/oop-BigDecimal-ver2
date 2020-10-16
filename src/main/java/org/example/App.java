package org.example;
/* Data Types
 * Illustrating Rounding errors with data type "double"
 * Using  along for money
 * Using type BigDecimal for great accuracy
 */

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        double teaCost = 1.10; //
        System.out.println("Cup of Tea Cost = " + String.format("%6.2f",teaCost ) + " euro");

        // demonstrates a rounding error introduced based on a very simple calculation
        // We would expect the sum to be 1.30, but there is a slight error (see output)
        double threeTeas = teaCost + teaCost + teaCost;
        System.out.println("Three teas cost: " + threeTeas +" oops - rounding error!");

        //In the case above the error wont matter, but if we were adding thousands of numbers then
        // the rounding number can accumulate and become significant


        // We can use type long for money, but must work in cent, and convert to euro when displaying
        // This will avoid rounding errors
        long coffeeCost = 210;  // i.e. 2.10 euro, which is 210 cent
        System.out.println("Coffee cost (euro) = " + String.format("%6.2f",(double)coffeeCost/100) + " euro");

        long threeCoffees = coffeeCost + coffeeCost + coffeeCost;  // can't be any rounding with integer values
        System.out.println("Three Coffees cost = " + String.format("%6.2f",(double)threeCoffees/100) + " euro");

        // BigDecimal
        // For really ginormous numbers we can use the BigDecimal object type
        // (It is not a primitive type and it does not have a fixed size)

        // BigDecimal should be initialized with a string for accuracy (strange but true!)
        BigDecimal bd1 = new BigDecimal(12.1);  // Not recommended, as it will have rounding error
        System.out.println("bd1 = " + bd1);

        // Best initialize with a String for accuracy
        BigDecimal bd2 = new BigDecimal("12.1");
        System.out.println("bd2  = " + bd2 );

        BigDecimal bd3 = new BigDecimal("1111222333444555666777888999000111222333444555666777888999");
        System.out.println("bd3  = " + bd3 );
        BigDecimal bd4 = bd2.add(bd3);
        System.out.println("bd2 + bd3 = " + bd4);

        // reverted to previous code and added new line
        int x = 0;
        System.out.println("x="+x);
        int z=0;

    }
}
