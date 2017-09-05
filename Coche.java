package poo;

public class Coche {
	// Caracteristicas comunes
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	// Establezco otras propiedades que podrán variar en función de cada coche
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
		
	//Metodo constructor - Construir el estado inicial del objeto. Se tiene que llamar igual que la Clase
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	// Primer método GETTER para acceder a los datos
	public String dimeDatosGenerales() {
		return (
			"La plataforma del vehículo tiene " + ruedas + " ruedas. Mide " 
			+ largo/1000 + " metros, con un ancho de " + ancho
			+ " cm y un peso de plataforma de " + pesoPlataforma + " kilos."
		);
	}
	
	// Primer método SETTER para modificar el valor de la propiedad
	public void estableceColor(String colorCoche) {
		color = colorCoche;
	}
	
	// Método GETTER para acceder al color del coche
	public String dimeColor() {
		return "El color del coche es " + color;
	}
	
	// SETTER
	public void configuraAsientos (String asientosCuero) {
		
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}
	
	// GETTER
	public String dimeAsientos() {
		// Aqui no se pone el this porque no hay lugar a error. No se le pasa argumento
		if(asientosCuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
		
	}
	
	// SETTER
	public void configuraClimatizacion(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}
	
	// GETTER
	public String dimeClimatizador() {
		if(climatizador == true) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	// SETTER Y GETTER (NO RECOMENDADA en la programacion de objetos)
	public String dimePesoCoche() {
		// Declaramos e iniciamos una variable - solo accesible desde el método
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if(asientosCuero == true) {
			pesoTotal += 50;
		}
		if(climatizador == true) {
			pesoTotal += 20;
		}
		return "El peso del coche es " + pesoTotal;
	}
	
	public int precioCoche() {
		int precioFinal = 10000;
		if(asientosCuero == true) {
			precioFinal += 2000;
		}
		if (climatizador == true) {
			precioFinal += 1500;
		}
		return precioFinal;
	}
	
	
}
 