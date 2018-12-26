package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.List;

public class Pelicula extends Producto{

	List<Oscar> oscarsObtenidos;

	public Pelicula() {
		super();
	}

	public List<Oscar> getOscarsObtenidos() {
		return oscarsObtenidos;
	}

	public void setOscarsObtenidos(List<Oscar> oscarsObtenidos) {
		this.oscarsObtenidos = oscarsObtenidos;
	}
}
