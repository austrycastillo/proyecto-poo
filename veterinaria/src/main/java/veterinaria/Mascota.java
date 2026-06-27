package veterinaria;

//superclase (clase padre, clase base, herencia)
//clase encapsulada
//clase abstracta: no se puede instanciar, solo se puede heredar
public abstract class Mascota {
	private String nombre;
	private int edad;

	// constructor
	public Mascota() {
	}

	// sobrecarga de constructor (polimorfismo)
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// setters y getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String mostrarDatos() {
		return "Nombre: " + nombre + ", Edad: " + edad;
	}

	// toString: sobreescritura del método toString de la clase Object
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
