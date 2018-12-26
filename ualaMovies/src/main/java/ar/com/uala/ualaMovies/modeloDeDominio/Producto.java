package ar.com.uala.ualaMovies.modeloDeDominio;

import java.util.Date;

public abstract class Producto {

	private Date fechaEstreno;
	private Integer minutosDuracion;
	private String titulo;
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
}
