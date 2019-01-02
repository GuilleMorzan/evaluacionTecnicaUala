package ar.com.uala.ualaMovies.modeloDeDominio;

import java.io.IOException;
import java.math.BigDecimal;

import ar.com.uala.ualaMovies.excepciones.FondosInsuficientesException;

public class Cliente {

	private Integer numeroSocio;
	private Integer cantidadProductosConsumidos;
	private EstadoAnimo estadoAnimo;
	private Boolean esAntiguo = false;
	private EmpresaUalaMovie empresaContratada;
	private Producto productoQueEstaObservando;
	private BigDecimal dineroDisponible;
	
	public Cliente(Integer numeroSocio, Integer cantidadProductosConsumidos,
			EstadoAnimo estadoAnimo, Boolean esAntiguo, BigDecimal dineroDisponible,
			EmpresaUalaMovie empresaContratada, Producto productoQueEstaObservando) {
		super();
		this.numeroSocio = numeroSocio;
		this.cantidadProductosConsumidos = cantidadProductosConsumidos;
		this.estadoAnimo = estadoAnimo;
		this.esAntiguo = esAntiguo;
		this.empresaContratada = empresaContratada;
		this.productoQueEstaObservando = productoQueEstaObservando;
		this.dineroDisponible = dineroDisponible;
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

	public BigDecimal getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(BigDecimal dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
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

	public void pagar(BigDecimal costoMensual) throws IOException, FondosInsuficientesException {
		if(dineroDisponible.compareTo(costoMensual) > 0){
			dineroDisponible = dineroDisponible.subtract(costoMensual);
		}
		else{
			throw new FondosInsuficientesException("No tiene creditos suficientes para pagar");
		}
	}
}
