
public class excecoes2 {
	
	public static void main (String [] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for(int j = 0; j <numeros.length; j++) {
			try {
		System.out.println(numeros [j] + "/" + demon[j] + "=" + (numeros[j] / demon[j]));
		}
		catch (ArithmeticException e) {
			System.out.println("Erro ao dividir por zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o do array inv�lido");
		}
			
}
	}
}