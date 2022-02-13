
package Soal4;
/**
 * <h1>Soal 4 : Floating Point</h1>
 * Floating point program implements an application
 * to rounding a number to the nearest integer
 * 
 * @author Dhafin Rizqi F
 * @version 1.0
 * @since 2022-02-12
 */

class FloatingPoint {
    /**
     * Here's where the number is rounded to the nearest integer
     */
 public static void main(String[] args) {
 double x = 92.98;
 int nx = (int) Math.round(x);
 System.out.println(+nx);
 }
}
