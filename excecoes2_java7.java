
public class excecoes2_java7 {

	public static void main (String [] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for(int j = 0; j <numeros.length; j++) {
			try {
		System.out.println(numeros [j] + "/" + demon[j] + "=" + (numeros[j] / demon[j]));
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {
			System.out.println("Ocorreu um erro");
		}		
}
}
}