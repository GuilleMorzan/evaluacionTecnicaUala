package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.List;

public class EmpresaUalaMovie {

	private List<Pelicula> peliculas;
	private List<Serie> series;
	private List<Documental> documentales;
	private List<Cliente> usuarios;
	
	public EmpresaUalaMovie() {
		super();
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	public List<Documental> getDocumentales() {
		return documentales;
	}

	public void setDocumentales(List<Documental> documentales) {
		this.documentales = documentales;
	}

	public List<Cliente> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Cliente> usuarios) {
		this.usuarios = usuarios;
	}

	//Asumo que como es una plataforma que hace streaming siempre va a tener al menos una pelicula	
	public Producto streamPeliculaRandom() {
		return peliculas.get(0);
	}
	
	//Asumo que como es una plataforma que hace streaming siempre va a tener al menos una pelicula	
	public Producto streamSerieRandom() {
		return series.get(0);
	}
	
	//Asumo que como es una plataforma que hace streaming siempre va a tener al menos una pelicula	
	public Producto streamDocumentalRandom() {
		return documentales.get(0);
	}
}
