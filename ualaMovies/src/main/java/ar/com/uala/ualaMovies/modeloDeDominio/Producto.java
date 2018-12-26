package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.Date;

public abstract class Producto {

	private final Long MILLS_DOS_AÑOS = 1000L * 60L * 60L * 24L * 365L * 2L;	
	protected Date fechaEstreno;
	protected Integer minutosDuracion;
	protected String titulo;
	
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public Integer getMinutosDuracion() {
		return minutosDuracion;
	}
	public void setMinutosDuracion(Integer minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean esAntiguo() {
		Long millsFechaEstreno = fechaEstreno.getTime();
		Date now = new Date();
		Long millsActual = now.getTime();
		return ((millsActual - millsFechaEstreno) > MILLS_DOS_AÑOS);
	}

	public boolean esInteresante() {
		return false;
	}
}
