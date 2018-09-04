package SarumansLevelUp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import javafx.util.converter.BigIntegerStringConverter;

/**
 *
 * @author Santiago Soto 219266
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        java.util.Scanner in = new java.util.Scanner(System.in);
        //System.setOut(new PrintStream(new java.io.File("res1.txt")));

        for (int dia = 0; dia < Long.MAX_VALUE; dia++) {
            StringBuilder b = new StringBuilder();

            int aux = Integer.bitCount(dia);
            if (aux % 3 == 0) {
                b.append(dia);
                b.append(": ");
                b.append(aux);
                System.out.println(b.toString());
            }
            
        }

    }

}
