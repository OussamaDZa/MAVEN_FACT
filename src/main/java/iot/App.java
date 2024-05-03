// This class represents an application with a factorial calculation method.
package iot;

public class App {

    /**
     * Calculates the factorial of a non-negative integer.
     * 
     * @param n the number whose factorial is to be calculated
     * @return the factorial of the given number
     * @throws IllegalArgumentException if the given number is negative
     */
    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        if (n == 0 || n == 1)
            return 1;
        else
            return (n * fact(n - 1));
    }

    /**
     * The main method of the application.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello !");
    }
}
