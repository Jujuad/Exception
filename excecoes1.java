
public class excecoes1 {
	
public static void main (String [] args) {

	try{
		int[] j = new int [4];

		System.out.println ("Antes da exce��o");

		j [4] = 1;
	
	System.out.println("esse texto n�o sera impresso");
	}catch (ArrayIndexOutOfBoundsException exception)
	{
System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe");
}

System.out.println("Esse texto nao sera impresso apos a exception");

}
}