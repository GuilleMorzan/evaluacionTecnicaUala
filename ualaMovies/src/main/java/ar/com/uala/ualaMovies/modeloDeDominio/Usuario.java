package ar.com.uala.ualaMovies.modeloDeDominio;

public class Usuario {

	private Integer numeroSocio;
	private Integer cantidadProductosConsumidos;
	private EstadoAnimo estadoAnimo;
	private Boolean esAntiguo = false;
	private EmpresaUalaMovie empresaContratada;
	private Producto productoQueEstaObservando;
	
	public Usuario(Integer numeroSocio, Integer cantidadProductosConsumidos,
			EstadoAnimo estadoAnimo, Boolean esAntiguo, 
			EmpresaUalaMovie empresaContratada, Producto productoQueEstaObservando) {
		super();
		this.numeroSocio = numeroSocio;
		this.cantidadProductosConsumidos = cantidadProductosConsumidos;
		this.estadoAnimo = estadoAnimo;
		this.esAntiguo = esAntiguo;
		this.empresaContratada = empresaContratada;
		this.productoQueEstaObservando = productoQueEstaObservando;
	}

	public Usuario() {
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

	public Boolean getEsAntiguo() {
		return esAntiguo;
	}

	public void setEsAntiguo(Boolean esAntiguo) {
		this.esAntiguo = esAntiguo;
	}

	public EmpresaUalaMovie getEmpresaContratada() {
		return empresaContratada;
	}

	public void setEmpresaContratada(EmpresaUalaMovie empresaContratada) {
		this.empresaContratada = empresaContratada;
	}
	
	public Producto getProductoQueEstaObservando() {
		return productoQueEstaObservando;
	}

	public void setProductoQueEstaObservando(Producto productoQueEstaObservando) {
		this.productoQueEstaObservando = productoQueEstaObservando;
	}

	public void visualizarProductoRandom(){
		Producto producto = empresaContratada.streamProductoRandom();
		this.productoQueEstaObservando = producto;
		if(producto.esAntiguo()){
			this.esAntiguo = true;
		}
	}
}
