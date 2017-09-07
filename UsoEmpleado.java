// Único fichero que va a albergar todas las clases. NO RECOMENDABLE

package poo;

import java.util.*; // Para poder utilizar el DATE. Mirar en la API de JAVA

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("Virginia Sánchez", 45000, 2000, 12, 1);
		misEmpleados[1] = new Empleado("Paquito Redondo", 50000, 1995, 10, 17);
		misEmpleados[2] = new Empleado("Pedro Casas", 65000, 1986, 2, 15);
		
		// BUCLE FOR tradicional
		/*for(int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
			System.out.println("Nombre: " + misEmpleados[i].dimeNombre() + " Sueldo: " + misEmpleados[i].dimeSueldo() + " Fecha de alta: " + misEmpleados[i].dimeFecha()); 
		}*/
		
		// BUCLE FOR mejorado
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
			System.out.println("Nombre: " + e.dimeNombre() + " Sueldo: " + e.dimeSueldo() + " Fecha de alta: " + e.dimeFecha());
		}
				
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

