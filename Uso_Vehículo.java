package poo;

public class Uso_Vehículo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCoche1 = new Coche();
		
		miCoche1.estableceColor("Rojo");
		
		
		Furgoneta miFurgoneta1 = new Furgoneta(7,580);
		
		miFurgoneta1.estableceColor("azul");
		miFurgoneta1.configuraAsientos("si");
		miFurgoneta1.configuraClimatizacion("si");
		
		System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());
		System.out.println(miFurgoneta1.dimeDatosGenerales() + " " + miFurgoneta1.dimeDatosFurgoneta());
		
			
	}

}
