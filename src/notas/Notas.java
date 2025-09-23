package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		double expediente;
		double primero;
		double segundo;
		double tercero;
		double boletin;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota primer trimestre: ");
		primero = sc.nextDouble();
		System.out.println("Nota segundo trimestre: ");
		segundo = sc.nextDouble();
		System.out.println("Nota tercer trimestre: ");
		tercero = sc.nextDouble();
		
		expediente = (primero + segundo + tercero) / 3;
		boletin = (int) expediente;
		System.out.println("Nota media: " + (int) boletin);
		System.out.println("Nota media: " + expediente);
	}

}
