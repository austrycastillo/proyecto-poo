package veterinaria;

//clase encapsulada
public class Gato {
	// atributos
	private String nombre;
	private int edad;

	// métodos
	// constructor
	public Gato() {
	}

	// sobrecarga de constructor
	public Gato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// setters: inicializar los atributos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// y getters: retornar los atributos
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
}
