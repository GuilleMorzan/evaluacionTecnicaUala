package ar.com.uala.ualaMovies.modeloDeDominio;

public class Documental extends Producto {

	private GeneroDocumental genero;

	public Documental() {
		super();
	}

	public GeneroDocumental getGenero() {
		return genero;
	}

	public void setGenero(GeneroDocumental genero) {
		this.genero = genero;
	}
	
	
}
