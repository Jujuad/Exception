
public class excecoes3p {
	
	public static void main (String [] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int j = 0; j <numeros.length; j ++) {
		try{
		System.out.println(numeros [j] + "/" + demon [j] + "=" + (numeros [j] / demon [j]));
		}
		
		catch (ArithmeticException e) {
		System.out.println("Erro ao dividir por zero");
		System.exit (0);
		}

		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Posição do array inválido");
		System.exit (0);
		}
		
		finally{
		System.out.println ("Essa linha é impressa sempre depois do try or catch");
		System.out.println();
		    }
		}
	}
}
