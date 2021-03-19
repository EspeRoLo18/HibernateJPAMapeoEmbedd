package mx.edu.uacm.dominio;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Direccion {
	
	@Column(nullable = false)
	private String calle;
	
	@Column(nullable = false, length = 5)
	private String codigoPostal;
	
	@Column(nullable = false)
	private String poblacion;
	
	@Column(nullable = false)
	private String provincia;
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}
	
	public Direccion(String calle, String codigoPostal, String poblacion, String provincia) {
		this.calle = calle;
		this.codigoPostal=codigoPostal;
		this.poblacion=poblacion;
		this.provincia=provincia;
	}

}
