package ar.com.uala.ualaMovies.modeloDeDominio;

public class Notificacion implements MedioComunicacion{

	private Integer longitudCaracteres;

	public Notificacion() {
		super();
	}

	public Integer getLongitudCaracteres() {
		return longitudCaracteres;
	}

	public void setLongitudCaracteres(Integer longitudCaracteres) {
		this.longitudCaracteres = longitudCaracteres;
	}
}
