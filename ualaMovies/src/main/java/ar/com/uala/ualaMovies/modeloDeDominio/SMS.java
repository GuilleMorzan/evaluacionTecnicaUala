package ar.com.uala.ualaMovies.modeloDeDominio;

public class SMS implements MedioComunicacion{

	private Integer costo;

	public SMS() {
		super();
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}
	
}
