package ar.com.uala.ualaMovies.modeloDeDominio;

public class Cliente {

	private Integer numeroSocio;
	private Integer cantidadProductosConsumidos;
	private EstadoAnimo estadoAnimo;
	private Boolean esAntiguo = false;
	private EmpresaUalaMovie empresaContratada;
	private Producto productoQueEstaObservando;
	
	public Cliente(Integer numeroSocio, Integer cantidadProductosConsumidos,
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

	public Cliente() {
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

	public void visualizarPeliculaRandom(){
		Producto producto = empresaContratada.streamPeliculaRandom();
		setearProducto(producto);
	}

	public void visualizarSerieRandom(){
		Producto producto = empresaContratada.streamSerieRandom();
		setearProducto(producto);
	}
	
	public void visualizarDocumentalRandom(){
		Producto producto = empresaContratada.streamDocumentalRandom();
		setearProducto(producto);
	}
	
	private void setearProducto(Producto producto) {
		this.productoQueEstaObservando = producto;
		if(producto.esAntiguo()){
			this.esAntiguo = true;
		}
	}
	
	public boolean miraAlgoInteresante(){
		return productoQueEstaObservando.esInteresante();
	}
}
