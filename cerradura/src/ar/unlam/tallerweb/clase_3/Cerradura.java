package ar.unlam.tallerweb.clase_3;

public class Cerradura {
	
	private Integer claveGuardada;
	private Integer cantidadErrores;
	public Integer contador=0;

	public Cerradura(Integer clave) {
		claveGuardada = clave;
	
		
	}

	public boolean Abrir(Integer clave) {
		if (clave.equals(claveGuardada)) {
			return true;
		}
		return false;
	}

	public boolean cerrar(Integer clave) {

		if (clave.equals(claveGuardada)) {
			cantidadErrores++;
			return true;

			
		}

		return false;
	}

}
