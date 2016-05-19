package ar.edu.unlam.tallerweb.obras;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Catalogo {
	
	private Boolean contieneObra;
	//ListaDeObras
	SortedSet<ObraDeArte> ListaObras = new TreeSet<ObraDeArte>();
	
	//TestCantidad
	public Integer ontenerCantidadObras() {
		return ListaObras.size();
	}
	
	//AgregarObra
	public void agregarObra(ObraDeArte obraDeArte)throws Exception{
		
		//ObraDuplicada
		if(existeObra(obraDeArte)){
			throw new Exception ("Obra Existente");
		}
		else{	
			this.ListaObras.add(obraDeArte);
		}
	}
	
	//ExisteObra
	public boolean existeObra(ObraDeArte obraDeArte){
			contieneObra = ListaObras.contains( obraDeArte);
			return contieneObra;
	}
	
	//OrdenarObras
	public Set<ObraDeArte> getObras() {
		return ListaObras;
	}

}
	
