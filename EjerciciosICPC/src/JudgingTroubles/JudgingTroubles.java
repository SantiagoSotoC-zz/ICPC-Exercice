package JudgingTroubles;

import java.util.Scanner;

import java.util.*;

public class JudgingTroubles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            ArrayList<String> datos1 = new ArrayList<>();
            ArrayList<String> datos2 = new ArrayList<>();
            int cant = in.nextInt();
            in.nextLine();

            for (int i = 0; i < cant; i++) {
                datos1.add(in.nextLine());
            }

            for (int i = 0; i < cant; i++) {
                datos2.add(in.nextLine());
            }

        
            Collections.sort(datos2);

            int iguales = 0;

            for (int i = 0; i < datos1.size(); i++) {
                
                int algo = Collections.binarySearch(datos2,datos1.get(i));
                if (algo >= 0) {
                    iguales++;
                    datos2.remove(algo);
                }
            }
            
            System.out.println(iguales);

        }

    }

}
