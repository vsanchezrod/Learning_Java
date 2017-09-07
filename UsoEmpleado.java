// Único fichero que va a albergar todas las clases. NO RECOMENDABLE

package poo;

import java.util.*; // Para poder utilizar el DATE. Mirar en la API de JAVA

public class UsoEmpleado {

	public static void main(String[] args) {
			
		// Instanciamos la clase con los argumentos necesarios del constructor
		Empleado empleado1 = new Empleado("Virginia Sánchez", 45000, 2000, 12, 1);
		Empleado empleado2 = new Empleado("Paquito Redondo", 50000, 1995, 10, 17);
		Empleado empleado3 = new Empleado("Pedro Casas", 65000, 1986, 2, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dimeNombre() + " Sueldo: " + empleado1.dimeSueldo() + " Fecha de alta: " + empleado1.dimeFecha()); 
		System.out.println("Nombre: " + empleado2.dimeNombre() + " Sueldo: " + empleado2.dimeSueldo() + " Fecha de alta: " + empleado2.dimeFecha());
		System.out.println("Nombre: " + empleado3.dimeNombre() + " Sueldo: " + empleado3.dimeSueldo() + " Fecha de alta: " + empleado3.dimeFecha());
	}

}


// Solo una clase puede ser Publica y solo una puede ser main
class Empleado{
	
	// Vamos a crear un constructor que va a recibir parámetros o argumentos
	public Empleado(String nom, double suel, int year, int month, int day) {
		
		nombre = nom;
		sueldo = suel;
		
		// Para la fecha vamos a utilizar una clase predefinida en el API que construye una fecha - GregorianCalendar
		// Creamos un objeto de esa clase
		
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
		
		// Usamos un método dentro de la clase GregorianCalendar para obtener la fecha
		altaContrato = calendario.getTime();
		
		
	}
	
	// METODO GETTER
	public String dimeNombre() {
		return "El nombre es " + nombre;
	}
	
	// GETTER
	public double dimeSueldo() {
		return sueldo;
	}
	
	// GETTER
	public Date dimeFecha() {
		return altaContrato;
	}
	
	// SETTER - Método que sube el sueldo
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
		
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	// Da igual donde definamos las variables. 
}

