package poo;
import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar una clase = Crear un objeto de esa clase
		Coche miCoche = new Coche(); // EJEMPLAR DE CLASE
		
		System.out.println(miCoche.dimeDatosGenerales());
		// Se establece el color del coche
		miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(miCoche.dimeColor());
		
		miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(miCoche.dimeAsientos());
		
		miCoche.configuraClimatizacion(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(miCoche.dimeClimatizador());
		
		System.out.println(miCoche.dimePesoCoche());
		System.out.println("El precio final del coche es: " + miCoche.precioCoche());
		
		
	}

}
