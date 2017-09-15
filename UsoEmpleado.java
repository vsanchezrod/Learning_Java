// �nico fichero que va a albergar todas las clases. NO RECOMENDABLE

package poo;

import java.util.*; // Para poder utilizar el DATE. Mirar en la API de JAVA

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Jefe jefeRRHH = new Jefe ("Marta L�pez", 55000, 2006, 5, 28);
		jefeRRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Virginia S�nchez", 45000, 2000, 12, 1);
		misEmpleados[1] = new Empleado("Paquito Redondo", 50000, 1995, 10, 17);
		misEmpleados[2] = new Empleado("Pedro Casas", 65000, 1986, 2, 15);
		misEmpleados[3] = new Empleado("Mario Rodr�guez");
		// POLIMORFISMO
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new Jefe ("Pepe Redondo", 75000, 1990, 4, 23);
		
		Jefe jefaFinanzas = (Jefe) misEmpleados[5];
		
		jefaFinanzas.estableceIncentivo(5000);
		
		
		// BUCLE FOR mejorado. Variable e de objeto Empleado. 
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		// La e Cuando sea un empleado usar� el metodo de empleado y cuando sea un jefe ser� el de jefe. ENLAZADO DINAMICO
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dimeNombre() + " Sueldo: " + e.dimeSueldo() + " Fecha de alta: " + e.dimeFecha());
		}
				
	}

}


// Solo una clase puede ser Publica y solo una puede ser main
class Empleado{
	
	// Vamos a crear un constructor que va a recibir par�metros o argumentos
	public Empleado(String nom, double suel, int year, int month, int day) {
		
		nombre = nom;
		sueldo = suel;
		
		// Para la fecha vamos a utilizar una clase predefinida en el API que construye una fecha - GregorianCalendar
		// Creamos un objeto de esa clase
		
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
		
		// Usamos un m�todo dentro de la clase GregorianCalendar para obtener la fecha
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}
	
	public Empleado(String nom) {
		
		// Datos por defecto para aquellos trabajadores q solo conocemos el nombre.
		// El this en este caso llama al otro constructor y le pasa los par�metros de nombre y los de por defecto.
		this(nom, 30000, 2000, 01, 01);

	}
	
	// METODO GETTER
	public String dimeNombre() {
		return nombre + " Id: " + id;
	}
	
	// GETTER
	public double dimeSueldo() {
		return sueldo;
	}
	
	// GETTER
	public Date dimeFecha() {
		return altaContrato;
	}
	
	// SETTER - M�todo que sube el sueldo
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
		
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
	
	// Da igual donde definamos las variables. 
}

final class Jefe extends Empleado{
	
	private double incentivo;
	
	// Si no a�adimos constructor, va a coger por defecto el de la clase PADRE (el q no recibe parametro alguno) - public Empleado(){
	// En este caso no hay ningun constructor sin par�metros por lo que nos da error.
	public Jefe(String nom, double suel, int year, int month, int day) {
		
		super(nom, suel, year, month, day);
		
	}
	public void estableceIncentivo(double b) {
		
		incentivo = b;
		
	}
	
	// Machamos el m�todo de dimeSueldo de la clase Empleado, para la clase Jefe
	public double dimeSueldo() {
		double sueldoJefe = super.dimeSueldo();
		return sueldoJefe + incentivo;
	}
	
}

