/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberSteps;

/**
 *
 * @author Santiago Soto 219266
 */
public class NumberSteps {

    static java.util.Scanner in = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos, x, y;
        casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            x = in.nextInt();
            y = in.nextInt();
            if (y >= 0) {
                if (x == y) {
                    if (x % 2 == 0) {
                        System.out.println(2 * x);
                    } else {
                        System.out.println(2 * x - 1);
                    }
                } else if (x == y + 2) {
                    if (x % 2 == 0) {
                        System.out.println(2 * x - 2);
                    } else {
                        System.out.println(2 * x - 3);
                    }
                } else {
                    System.out.println("No Number");
                }
            } else {
                System.out.println("No Number");
            }
        }
    }
}
