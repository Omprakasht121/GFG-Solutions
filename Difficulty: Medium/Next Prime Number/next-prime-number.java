// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        int candidate = n + 1;

        while (true) {
            boolean isPrime = true;

            if (candidate <= 1) {
                isPrime = false;
            } else {
                // Check divisibility
                for (int i = 2; i * i <= candidate; i++) {
                    if (candidate % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // If prime, return it
            if (isPrime) {
                return candidate;
            }

            candidate++; // move to next number
        }
    }
}