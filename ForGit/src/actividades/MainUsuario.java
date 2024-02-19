package actividades;

public class MainUsuario {

	
	
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

