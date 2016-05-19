package ar.edu.unlam.tallerweb.obras;

public class ObraDeArte implements Comparable<ObraDeArte> {
	
	String nombreObra;
	Autor autorObra;
	//constructor
	public ObraDeArte (String nombre, Autor autor){
		this.nombreObra = nombre;
		this.autorObra = autor;
	}

	public Object getNombre() {
		return nombreObra;
	}
	//ComparaObras
	@Override
	public int compareTo(ObraDeArte nombreObra) {
		return this.nombreObra.compareTo(nombreObra.nombreObra);
	}
}
