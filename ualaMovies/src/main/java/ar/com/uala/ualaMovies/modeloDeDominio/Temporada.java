package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.List;

public class Temporada {

	private List<Capitulo> capitulos;

	public Temporada() {
		super();
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
}
