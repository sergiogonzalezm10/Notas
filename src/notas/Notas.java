package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		double expediente;			//Variable double para almacenar la nota del expediente
		double primero;				//Variable double para almacenar la nota del primer trimestre	
		double segundo;				//Variable double para almacenar la nota del segundo trimestre	
		double tercero;				//Variable double para almacenar la nota del tercer trimestre	
		double boletin;				//Variable double para almacenar la nota del boletín	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota primer trimestre: ");
		primero = sc.nextDouble();
		System.out.println("Nota segundo trimestre: ");
		segundo = sc.nextDouble();
		System.out.println("Nota tercer trimestre: ");
		tercero = sc.nextDouble();
		
		expediente = (primero + segundo + tercero) / 3;		//Operación para calcular la nota media de los tres trimestres y almacenarla en la variable expediente
		boletin = (int) expediente;							//La nota del boletin es la misma que la del expediente pero sin decimales, para ello utilizamos int entre paréntesis
		System.out.println("Nota media: " + (int) boletin);
		System.out.println("Nota media: " + expediente);
	}

}
