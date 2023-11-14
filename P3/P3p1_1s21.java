import java.util.Scanner;
public class P3p1_1s21{
	static Scanner teclado = new Scanner(System.in);
	public static void Suma(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingrese el 1er numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el 2do numero");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("La suma fue " + c);
	}
	public static void Resta(){
		System.out.println("Resta de 2 numeros");
		System.out.println("Ingrese el 1er numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el 2do numero");
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("La resta fue " + c);
	}
	public static void Division(){
		System.out.println("Division de numeros");
		System.out.println("Ingrese sus primeros numeros");
		int a = teclado.nextInt();
		System.out.println("Ingrese sus segundos numeros");
		int b = teclado.nextInt();
		int c = a/b;
		System.out.println("La division fue " + c);
	}
	public static void Multiplicacion(){
		System.out.println("Multiplicacion de numeros");
		System.out.println("Ingrese sus primeros numeros");
		int a = teclado.nextInt();
		System.out.println("Ingrese sus segundos numeros");
		int b = teclado.nextInt();
		int c = a*b;
		System.out.println("La multiplicacion fue " + c);
	}
	public static void Salir(){
		System.out.println("Salir de las operaciones logicas");
	}
	public static void Menu(){
		System.out.println("Operaciones Basicas");
		System.out.println("A) Suma");
		System.out.println("B) Resta");
		System.out.println("C) Division");
		System.out.println("D) Multiplicacion");
		System.out.println("S) Salir");
		System.out.println("¿Que opcion deseas?");
	}
	public static void main(String[] args) {
		Menu();
		String opc=teclado.nextLine();
		if (opc.equals("A"))Suma();
		if (opc.equals("B"))Resta();
		if (opc.equals("C"))Division();
		if (opc.equals("D"))Multiplicacion();
		if (opc.equals("S"))Salir();
	}
}