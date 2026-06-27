package veterinaria;

//clase derivada de la clase Mascota, clase hija
public class Pez extends Mascota {
	private String tipoAgua; // dulce o salada
	// constructor

	public Pez(String nombre, int edad, String tipoAgua) {
		super(nombre, edad);// llamar al constructor de la clase padre
		this.tipoAgua = tipoAgua;
	}

	// sobrecarga de constructor
	public Pez() {

	}
}
