package poo;

public class Prueba_constantes {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Virginia");
		Empleados trabajador2 = new Empleados("Paco");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiarSeccion("RRHH");
				
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() 
				+ "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
			
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	
	private final String nombre;
	private String seccion;
	// Queremos darle un id identificativo (num q no se puede repetir) a cada trabajador de forma correlativa
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nom) {
		
		nombre = nom;
		// Regla, todos los empleados empiezan trabajando en la sección de Administración, y pondrán cambiar con el tiempo
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	// SETTER - Cambiar sección del trabajador
	public void cambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
	// GETTER
	public String devuelveDatos() {
		return "El nombre es: " + nombre + " , la sección es: " + seccion + " y el id es: " + id;
	}
	
	// Método q nos de la informacion sobre la idSiguiente
	public static String dameIdSiguiente() {
		return "El id siguiente es: " + idSiguiente;
	}
	
	
	
	
}
