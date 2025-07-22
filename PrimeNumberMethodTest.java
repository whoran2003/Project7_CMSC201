/*
 * Class: CMSC201 
 * Instructor:Grigoriy Grinberg
 * Description: The program checks if a number is a prime number or not. 
 * Due: 07/19/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: William Horan
*/

public class PrimeNumberMethodTest {

    public static void main(String[] args) {
        testIsPrime();  // run prime number checks
    }

    // method that checks if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // test some numbers to see if isPrime works
    public static void testIsPrime() {
        System.out.println("Testing isPrime():");

        System.out.println(isPrime(2) == true ? "Pass" : "Fail");
        System.out.println(isPrime(3) == true ? "Pass" : "Fail");
        System.out.println(isPrime(4) == false ? "Pass" : "Fail");
        System.out.println(isPrime(13) == true ? "Pass" : "Fail");
        System.out.println(isPrime(20) == false ? "Pass" : "Fail");
        System.out.println(isPrime(1) == false ? "Pass" : "Fail");
        System.out.println(isPrime(0) == false ? "Pass" : "Fail");
        System.out.println(isPrime(-5) == false ? "Pass" : "Fail");
    }
}