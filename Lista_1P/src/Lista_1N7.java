package Lista_1P;

public class Lista_1N7 {
	
	public static void main (String[] args) {
		double A = Math.floor(Math.random() * 20);
		double B = Math.floor(Math.random() * 20);

		
		
		System.out.println("Valor de A:" +A);
		System.out.println("Valor de B:" +B);
		
		
		if (A > 10 || A+B == 20) {
					System.out.println("numeros válidos");
				 }else if (A < 10) {
					System.out.println("numeros nao válidos");
		} 
	}
}

