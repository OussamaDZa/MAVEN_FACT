// after refactoring test
package iot;

public class App {
    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        if (n == 0 || n == 1)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello !");
    }
}
