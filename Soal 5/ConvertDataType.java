
package Soal5;
/**
 * <h1>Soal 5: Convert data type</h1>
 * Convert data type program implements an application
 * to convert large data types to small data types
 * (long -> int -> short) and (double -> float -> byte)
 * 
 * @author Dhafin Rizqi F
 * @version 1.0
 * @since 2022-02-12
 */

class ConvertDataType
{
    /**
 * from long to int to short
 * @param l (the number to be converted)
 */
 static short methodOne(long l)
 {
 int i = (int) l;
 return (short)i;
 }
 /**
 * Here's where the number that have large data types 
 * are converted to small data types
 * @param args
 */
 public static void main(String[] args)
 {
 double d = 10.25;
 float f = (float) d;
 byte b = (byte) methodOne((long) f);
 System.out.println(b);
 }
}

