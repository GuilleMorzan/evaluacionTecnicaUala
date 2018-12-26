package ar.com.uala.ualaMovies.modeloDeDominio;

public class Usuario {

	private Integer numeroSocio;
	private Integer cantidadProductosConsumidos;
	private EstadoAnimo estadoAnimo;
	
	public Usuario(Integer numeroSocio, Integer cantidadProductosConsumidos,
			EstadoAnimo estadoAnimo) {
		super();
		this.numeroSocio = numeroSocio;
		this.cantidadProductosConsumidos = cantidadProductosConsumidos;
		this.estadoAnimo = estadoAnimo;
	}

	public Integer getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public Integer getCantidadProductosConsumidos() {
		return cantidadProductosConsumidos;
	}

	public void setCantidadProductosConsumidos(Integer cantidadProductosConsumidos) {
		this.cantidadProductosConsumidos = cantidadProductosConsumidos;
	}

	public EstadoAnimo getEstadoAnimo() {
		return estadoAnimo;
	}

	public void setEstadoAnimo(EstadoAnimo estadoAnimo) {
		this.estadoAnimo = estadoAnimo;
	}
}
