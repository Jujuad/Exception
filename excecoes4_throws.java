import java.util.Scanner;
public class excecoes4_throws {

	public static void main (String [] args) {

		System.out.println("Entre com um numero decimal");
		
		try{
			double num  = leNumero ();
		System.out.println ("Você digitou" + num);
		}
		
		catch (Exception e) {
		System.out.println("Entrada Inválida");
		e.printStackTrace ();
		}
		
	}
		public static double leNumero() throws Exception {
		Scanner scan = new Scanner (System.in);
		double num = scan.nextDouble ();
		return num;
		}

}
