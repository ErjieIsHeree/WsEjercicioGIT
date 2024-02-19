package actividades;

public class Usuario {

	String id;
	String nombre;
	double valoraciones[];
	
	public Usuario() {
		super();
	}
	public Usuario(String id, String nombre, double[] valoraciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}
	
	public int devolverCantValoracionesSuperioresa(int numero) {
		int cantSup = 0;
		for(int i = 0; i < this.valoraciones.length; i++) {
			if(numero < this.valoraciones[i]) {
				cantSup++;
			}
		}
		return cantSup;
	}

	public boolean devolverSuperaMedia(int numero) {
		boolean esMayorMedia = false;
		if(numero < devolverMediaValoraciones() ) {
			esMayorMedia = true;
		}
		return esMayorMedia;
	}
	
}
