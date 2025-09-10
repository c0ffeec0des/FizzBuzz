package lab1;

public class Multiples {
    public static void main(String[] args) {
        // Test example
        int count = multiples(200, 4, 7);
        System.out.println(count);

        // Calling overloaded method
        int count2 = multiples();
        System.out.println(count2);
    }

    // Overloaded method
    public static int multiples() {
        return multiples(1000, 3, 5);

    }

    // Original method with parameters
    public static int multiples(int n, int a, int b) {
        int numOfMultiples = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                numOfMultiples++;
            }
        }
        return numOfMultiples;
    }
}