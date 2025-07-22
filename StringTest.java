/*
 * Class: CMSC201 
 * Instructor:Grigoriy Grinberg
 * Description: The program tests if string methods give the right results. 
 * Due: 07/19/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: William Horan
*/
public class StringTest {

    public static void main(String[] args) {
        testLength();
        testCharAt();
        testSubstring();
        testIndexOf();
    }
// checks if length gives right number
    public static void testLength() {
        System.out.println("Testing length():");
        if ("Hello".length() == 5) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        if ("".length() == 0) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
// checks if charAt gives the right letter
    public static void testCharAt() {
        System.out.println("Testing charAt():");
        if ("Hello".charAt(1) == 'e') {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        if ("Hello".charAt(4) == 'o') {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
// checks if substring gives the correct part of the word.
    public static void testSubstring() {
        System.out.println("Testing substring():");
        if ("Hello".substring(1, 4).equals("ell")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        if ("Hello".substring(3).equals("lo")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
//checks if indexOf finds the letter of returns -1.
    public static void testIndexOf() {
        System.out.println("Testing indexOf():");
        if ("banana".indexOf("n") == 2) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        if ("banana".indexOf("z") == -1) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
