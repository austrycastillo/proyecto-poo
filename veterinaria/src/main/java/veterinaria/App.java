package veterinaria;

public class App {

	public static void main(String[] args) {
		// crear mi primer objeto
		Perro perro1 = new Perro();// instancia de la clase perro
		Perro perro2 = new Perro();
		Perro perro3 = new Perro();
		Perro perro4 = new Perro("Laqui", "Labrador", 5);
		// utilizar los atributos y métodos
		perro1.nombre = "Rocco";
		perro1.raza = "Rottweiler";
		perro1.edad = 3;
		perro1.ladrar();
		perro1.ladrar();
		perro1.ladrar("oy oy");
		System.out.println(perro1.mostrarDatos());
		// crear un objeto de tipo gato
		Gato gato1 = new Gato();
		gato1.setNombre("Fifi");
		gato1.setEdad(2);
		System.out.println("Nombre del gato: " + gato1.getNombre() + ", Edad: " + gato1.getEdad());
		Gato gato2 = new Gato("Michi", 4);
		System.out.println("Nombre del gato: " + gato2.getNombre() + ", Edad: " + gato2.getEdad());

		// crear un objeto de tipo pez
		Pez pez1 = new Pez();
		pez1.setNombre("Nemo");
		pez1.setEdad(1);
		System.out.println("Nombre del pez: " + pez1.getNombre() + ", Edad: " + pez1.getEdad());

		// Mascota mascota1 = new Mascota("Bobby", 2);//la bloqueamos porque es
		// abstracta, no se puede instanciar


		Pez pez2 = new Pez("Dory", 2, "dulce");
		// iniciar por herencia por un diagrama de clases

}
}
