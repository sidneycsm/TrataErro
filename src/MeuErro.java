import java.util.Scanner;

public class MeuErro {

	public static void main(String[] args) {

		System.out.println("Informe o n�mero para divis�o: ");
		Scanner scanner = new Scanner(System.in);
		int valorA = Integer.valueOf(scanner.next());

		System.out.println("Informe o divisor: ");
		int valorB = Integer.valueOf(scanner.next());
	
		String resultado = "";
		Dividir dividir = new Dividir();
	
		resultado = dividir.dividindo(valorA, valorB);
		System.out.println("Resultado da divis�o �: " + resultado);

	}

}
