package gscript;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Gio extends Print implements NewMath{

    //for instantiating a new Scanner object for UserInput
    public static Scanner scan(){
        return new Scanner(System.in);
    }

    //for instantiating a new Scanner object for any object
    public static Scanner scan(Object obj){
        return new Scanner(String.valueOf(obj));
    }

    //for type of a var
    public static void typeOut(Object obj){
        System.out.println(obj.getClass().getName());
    }

    //for type of a var in simple
    public static void typeOut(Object obj,Boolean bool){
        if (bool){
            System.out.println(obj.getClass().getSimpleName());
        }

    }
    public static void typeOut(String printString,Object obj,Boolean bool){
        if (bool){
            System.out.println(printString+obj.getClass().getSimpleName());
        }

    }

    //for type of a var
    public static String type(Object obj){
        return obj.getClass().getName();
    }

    //for type of a var
    public static String type(Object obj,Boolean bool){
        return obj.getClass().getSimpleName();
    }

    //for a pattern
    public static String read() {

        Scanner get = new Scanner(System.in);
        return get.next();
    }

    //for a Pattern
    public static Pattern pat(String pattern){
        return Pattern.compile(pattern);
    }



    //for a line
    public static String read(Pattern pattern) {

        Scanner get = new Scanner(System.in);
        return get.next(pattern);

    }

    //for a line
    public static String readLine() {

        Scanner get = new Scanner(System.in);
        return get.nextLine();
    }


    //for a bool if 0 or 1
    public static Boolean readBool() {

        String get = read();
        if (get.equals("0") || get.equals("false") )
            return false;
        else if (get.equals("1") || get.equals("true"))
            return true;

        InputMismatchException inputMismatchException = new InputMismatchException();
        inputMismatchException.printStackTrace();
        System.exit(0);

        return true;
    }

    //for a byte
    public static Byte readByte() {

        Scanner get = new Scanner(System.in);
        return get.nextByte();
    }

    //for a short
    public static Short readShort() {

        Scanner get = new Scanner(System.in);
        return get.nextShort();
    }

    //for a integer
    public static Integer readInt() {

        Scanner get = new Scanner(System.in);
        return get.nextInt();
    }

    //for a float
    public static Float readFloat() {

        Scanner get = new Scanner(System.in);
        return get.nextFloat();
    }

    //for a Double
    public static Double readDouble() {

        Scanner get = new Scanner(System.in);
        return get.nextDouble();
    }

    //for a Long
    public static Long readLong() {

        Scanner get = new Scanner(System.in);
        return get.nextLong();
    }

    //for BigDecimal
    public static BigDecimal readBigDec() {

        Scanner get = new Scanner(System.in);
        return get.nextBigDecimal();
    }

    //for BigInteger
    public static BigInteger readBigInt() {

        Scanner get = new Scanner(System.in);
        return get.nextBigInteger();
    }

}
