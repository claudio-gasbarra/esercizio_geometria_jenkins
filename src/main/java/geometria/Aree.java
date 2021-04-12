package geometria;

public class Aree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chiamate di metodo
		 System.out.print("L'area del triangolo è: ");
		 System.out.println(triangolo(10,4));
		 
		 System.out.print("L'area del quadrato è: ");
		 System.out.println(quadrato(5));
		 
		 System.out.print("L'area del rombo è: ");
		 System.out.println(rombo(8,6));

	}
	
	// metodo per l'area del triangolo
	public static int triangolo (int base, int alt) {
		return (base*alt/2);
	}
	
	// metodo per l'area del quadrato
	public static int quadrato (int lato) {
		return (lato * lato);
	}
	
	// metodo per l'area del rombo
	public static int rombo (int dmag, int dmin) {
		return (dmag*dmin/2);
	}

}
