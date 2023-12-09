
public class Cuerpo {

	String nombre;
	double masa;

	public Cuerpo(String nombre, double masa) {
		super();
		this.nombre = setNombre(nombre);
		this.masa = setMasa(masa);
	}

	public String getNombre() {
		return nombre;
	}

	public String setNombre(String nombre) {
		return this.nombre = nombre;

	}

	public double getMasa() {
		return masa;
	}

	public double setMasa(double masa) {
		return this.masa = masa;

	}

	public String toString() {
		return "Cuerpo [Nombre: " + nombre + ", masa: " + masa + " kg ]";
	}

}
