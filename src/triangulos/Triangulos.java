package triangulos;

import java.util.Scanner;

public class Triangulos {

    public static int m, n, t, contador = 0, acumulador = 0, i = 0, numero;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (i = 1; i <= 1000; i++) {
            do {
                System.out.println("Dame el valor de m: ");
                m = leer.nextInt();
            } while (m < 1 || m > 1000);

            do {
                System.out.println("Dame el valor de n: ");
                n = leer.nextInt();
            } while (n < 1 || n > 1000);

            while (contador < 1000) {
                for (int a = m; a <= n; a++) {
                    contador = contador + 1;
                    acumulador = acumulador;
                    for (int b = m; b <= n; b++) {
                        contador = contador + 1;
                        acumulador = acumulador;
                        for (int c = m; c <= n; c++) {
                            contador = contador + 1;
                            acumulador = acumulador;
                            System.out.println(a + "  " + b + "  " + c);
                        }
                    }
                }
            }
        }

    }

}
