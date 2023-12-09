import java.util.Scanner;

public class InterfazUsuario {

	static Scanner scanner = new Scanner(System.in);

	static Cuerpo leerCuerpo() {
		System.out.print("Nombre del cuerpo celeste: ");
		String nombre = scanner.nextLine();
		System.out.print("Masa del cuerpo celeste (kg): ");
		double masa = Double.parseDouble(scanner.nextLine());

		return new Cuerpo(nombre, masa);
	}

	static double leerDistancia() {
		System.out.print("Escribe la distancia entre los cuerpos: ");
		double distancia = Double.parseDouble(scanner.nextLine());

		return distancia;
	}

	static void mostrarResultado(double fuerza) {
		System.out.println("Fuerza de atracción gravitatoria: " + fuerza + " N");
	}

}
