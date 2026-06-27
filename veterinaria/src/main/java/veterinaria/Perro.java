package veterinaria;

//mi clase
public class Perro {
//atributos: caracteristicas: nombre raza edad
	public String nombre;
	public String raza;
	public int edad;

//métodos: acciones
	// constructor
	public Perro(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	// polimorfismo: sobrecarga de constructor
	// sobreescrito
	public Perro() {
	}

	public Perro(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void ladrar() {
		System.out.println("Guau Guau");
	}

	public void ladrar(String ladrido) {
		System.out.println(ladrido);
	}

	public String mostrarDatos() {
		return "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad;
	}
}
