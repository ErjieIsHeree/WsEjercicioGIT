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

public void motrarValoraciones() {
		
		for(int i = 0;i < this.valoraciones.length ;i++) {
			System.out.println("Lista de valoraciones");
			System.out.println("Valoracion  " + i + " : " +  this.valoraciones[i]);
			
		}
	}
	
	public int devolverPuntuacionesMasAltas(double nota) {
		int notas_mayores = 0;
		for (double d : valoraciones) {
			if (d>nota) {
				notas_mayores++;
			}

		}
		return notas_mayores;
	}
	
}
