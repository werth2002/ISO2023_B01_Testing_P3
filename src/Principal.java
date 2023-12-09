
public class Principal {

	public static void main(String[] args) {
		try {

			Cuerpo cuerpo1 = InterfazUsuario.leerCuerpo();
			Cuerpo cuerpo2 = InterfazUsuario.leerCuerpo();
			double distancia = InterfazUsuario.leerDistancia();

			double fuerzaGravedad = calcularFuerza(cuerpo1, cuerpo2, distancia);

			InterfazUsuario.mostrarResultado(fuerzaGravedad);

		} catch (Exception e) {
			System.out.println("Ocurrió un error inesperado: " + e.getMessage());
		}
	}

	private static double calcularFuerza(Cuerpo cuerpo1, Cuerpo cuerpo2, double distancia) {

		double G = 6.672 * Math.pow(10, -11); // Constante de gravitación universal de Newton
		double fuerzaGravedad;

		try {
			if (distancia == 0) {
				throw new IllegalArgumentException(
						"La distancia no puede ser cero, los cuerpos no pueden estar en la misma posición.");
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
			throw e;
		}

		return fuerzaGravedad = (G * cuerpo1.masa * cuerpo2.masa) / Math.pow(distancia, 2);
	}
}
