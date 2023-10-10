import java.util.Scanner;
public class P2p3_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Ingresa un número del 0 al 10");
		numero = teclado.nextInt();
		if (numero>=0 && numero<=10){
			System.out.println("Tabla de multiplicación del " + numero + ":");
			for (int i=0; i<=10; i++){
				int resultado = numero*i;
				System.out.println(numero + "x" + i + "=" + resultado);
			}
		}
	}
}