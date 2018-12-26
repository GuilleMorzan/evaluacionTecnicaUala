package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.List;

public class Serie extends Producto{

	private List<Temporada> temporadas;

	public Serie() {
		super();
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
}
