package ar.com.uala.ualaMovies.modeloDeDominio;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import ar.com.uala.ualaMovies.excepciones.FondosInsuficientesException;
import ar.com.uala.ualaMovies.utils.ApplicationProperties;

public class EmpresaUalaMovie {

	private List<Pelicula> peliculas;
	private List<Serie> series;
	private List<Documental> documentales;
	private List<Cliente> clientes;
	private BigDecimal dinero;
	
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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public BigDecimal getDinero() {
		return dinero;
	}

	public void setDinero(BigDecimal dinero) {
		this.dinero = dinero;
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
	
	public void cobrarTodosLosClientes() throws IOException, FondosInsuficientesException{
		for(Cliente cliente:clientes){
			cobrarCliente(cliente);
		}
	}

	private void cobrarCliente(Cliente cliente) throws IOException, FondosInsuficientesException {
		ApplicationProperties applicationProperties = ApplicationProperties.getInstance();
		BigDecimal costoMensual = new BigDecimal(applicationProperties.getPropertyValue("COSTO_MENSUAL"));
		cliente.pagar(costoMensual);
		dinero = dinero.add(costoMensual);
	}
}
