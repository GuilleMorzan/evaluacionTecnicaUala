package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Producto{

	List<Oscar> oscarsObtenidos = new ArrayList<Oscar>();

	public Pelicula() {
		super();
	}

	public List<Oscar> getOscarsObtenidos() {
		return oscarsObtenidos;
	}

	public void setOscarsObtenidos(List<Oscar> oscarsObtenidos) {
		this.oscarsObtenidos = oscarsObtenidos;
	}
	
	@Override
	public boolean esInteresante() {
		return (oscarsObtenidos != null && (oscarsObtenidos.size() > 0));
	}
}
