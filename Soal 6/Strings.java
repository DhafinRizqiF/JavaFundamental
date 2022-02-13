package Soal6;
/**
 * <h1>Soal 6</h1>
 * Sum the length of string
 * Determine if A is lexicographically larger than B
 * Capitalize the first letter in A and B and print them on a single line, separated by a
space
 * 
 * @author Dhafin Rizqi F
 * @version 1.0
 * @since 2022-02-12
 */
import java.util.Scanner; 

public class Strings
 {
    /**
     * This is the main method.
     * where's both string A and B inputted.
     * And Uppercasing the string.
     * @param args unused.
     */
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            String A = input.nextLine();
            String B = input.nextLine();
            System.out.println(A.length() + B.length());
            if ((A.compareTo(B)) == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            System.out.printf("%s %s", A.substring(0, 1).toUpperCase() + A.substring(1),
                    B.substring(0, 1).toUpperCase() + B.substring(1));
        } catch (Exception e) {
            System.out.println("something error");
        }
    }
}