package p.java;
import task.java.LScanner;

import java.io.*;

enum Letter{
    A,
    B,
    C,
    D,
    E,
    F,
    G
}
public class Main {

    public static int readInt() throws IOException {
        return Integer.parseInt(read());
    }
    public static String read() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        return bufferedReader.readLine();
    }
    public static void stringObjects() throws IOException{

        System.out.println("---------------------------");

        String string = read();
        string += read();
        System.out.println(string);

        for (int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i) + ' ');
        }

        for(char i: string.toCharArray()){
            System.out.println("char " + i);
        }

        if (!string.isEmpty()) System.out.println("string is noi empty");

        System.out.println("COMPARE");
        String s1 = read(), s2 = read();
        System.out.println("compareTo: " + s1.compareTo(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
        System.out.println("TO LOWER CASE");
        s1 = read();
        System.out.println(s1.toLowerCase());
        System.out.println(String.join(", ", "a", "b", "c", "d"));
        System.out.println("INDEX OF");
        s1 = read();
        s2 = read();
        System.out.println(s1.indexOf(s2));
        System.out.println("REPLACE");
        s1 = read();
        s2 = read();
        String s3 = read();
        System.out.println(s1.replace(s2, s3));
        System.out.println("STRING TO INT");
        s1 = read();
        int stringToInt = Integer.parseInt(s1);
        System.out.println("---------------------------");
    }

    public static void operations() throws IOException {
        System.out.println("input 3 integers: a, b, c");
        int a = readInt(), b = readInt(), c = readInt();
        if (a == 0 && b == 0) System.out.println("a == 0 && b == 0");
        else System.out.println("not (a == 0 && b == 0)");

        if (a == 0 && b == 1) System.out.println("a == 0 && b == 1");
        else System.out.println("not (a == 0 && b == 1)");

        if (a == 5 || b == 1) System.out.println("a == 5 || b == 1");
        else System.out.println("not (a == 5 || b == 1)");

        if (a == 5 || b == 5) System.out.println("a == 5 || b == 5");
        else System.out.println("not (a == 5 || b == 5)");

        System.out.println(a == 0 ? "a == 0" : "a != 0");
        System.out.println(a == 5 ? "a == 5" : "a != 5");

        System.out.println("~a: " + ~a);
        System.out.println("a&b: " + (a & b));
        System.out.println("a|b: " + (a | b));
        System.out.println("a^b: " + (a ^ b));

        System.out.println("a<<b: " + (a << b));
        System.out.println("a>>b: " + (a >> b));
        System.out.println("a>>>b: " + (a >>> b));
    }

    public static void switchTypes() throws IOException{
        int a = readInt();

        /*INT*/

        Letter letter = switch (a % 9) {
            case 0 -> Letter.A;
            case 1 -> Letter.B;
            case 2 -> Letter.C;
            case 3 -> Letter.D;
            case 4 -> Letter.E;
            case 5 -> Letter.F;
            default -> Letter.G;
        };

        /*ENUM*/

        switch (letter) {
            case A -> System.out.println('A');
            case B -> System.out.println('B');
            case C -> System.out.println('C');
            case D -> System.out.println('D');
            case E -> System.out.println('E');
            default -> System.out.println("other");
        }

        char c = read().charAt(0);

        /*CHAR*/

        switch (c) {
            case 'a' -> System.out.println('A');
            case 'b' -> System.out.println('B');
            case 'c' -> System.out.println('C');
            case 'd' -> System.out.println('D');
            case 'e' -> System.out.println('E');
            default -> System.out.println("other");
        }

        byte b = (byte) readInt();

        /*BYTE*/

        switch (b) {
            case 0 -> System.out.println(0);
            case 1 -> System.out.println(1);
            default -> System.out.println("other");
        }

        short sh = (short) readInt();

        /*SHORT*/

        switch (sh) {
            case 0 -> System.out.println(0);
            case 1 -> System.out.println(1);
            default -> System.out.println("other");
        }

        /*STRING*/

        String str = read();
        switch (str) {
            case "strA" -> System.out.println("strA");
            case "strB" -> System.out.println("strB");
            default -> System.out.println("other");
        }

    }
    public static void main(String[] args) throws IOException {
        stringObjects();
        operations();
        switchTypes();
        LScanner.read();
    }
}