import java.util.Scanner;
public class P3p11_1s21{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor de n: ");
        int n=teclado.nextInt();
        System.out.println("Ingresa el valor de k: ");
        int k;
        k=teclado.nextInt();
        int j;
        int acomulador=0;
        int den=0;

    for (int i=0;i<n;i++){
        den += rest(j)*falk(k);
        acomulador += factorial(i)/(factorial(k)=(factorial((n-k))));
        System.out.println("El resultado de la sumatoria es: " + acomulador);
    }
    }

    public static double falk(int k) {
        double fal = 1;
        for (int i = 1; i <= k; i++) {
            fal = fal * i;
        }
        return fal;

    }

    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static double rest(int j) {
        int n;
        int k;
        double res = n-k;
        for (int i = 1; i <= j; i++) {
        res = res * i;
        }
        return res;
    }
}