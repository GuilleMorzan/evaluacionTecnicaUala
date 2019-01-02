package ar.com.uala.ualaMovies.modeloDeDominio;

public class Mail implements MedioComunicacion{

	private Boolean permiteAdjuntos;

	public Mail() {
		super();
	}

	public Boolean getPermiteAdjuntos() {
		return permiteAdjuntos;
	}

	public void setPermiteAdjuntos(Boolean permiteAdjuntos) {
		this.permiteAdjuntos = permiteAdjuntos;
	}
}
