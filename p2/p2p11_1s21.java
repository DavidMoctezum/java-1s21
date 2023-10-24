public class p2p11_1s21{
	public static void main(String[] args) {
		for (String cadena : args){
			char operacion=cadena.charAt(1);
			switch(operacion){
			case 'a':System.out.println("Analisis de datos"); break;
			case 'b':System.out.println("Instalacion avanzada"); break;
			case 'h':System.out.println("Lista de parametros"); break;
			case 'e':System.out.println("Ejecutar el programa sin ningun elemento"); break;
			}
		}
	}
}