
public class excecoes1 {
	
public static void main (String [] args) {

	try{
		int[] j = new int [4];

		System.out.println ("Antes da exceção");

		j [4] = 1;
	
	System.out.println("esse texto não sera impresso");
	}catch (ArrayIndexOutOfBoundsException exception)
	{
System.out.println("Exceção ao acessar um índice do vetor que não existe");
}

System.out.println("Esse texto nao sera impresso apos a exception");

}
}