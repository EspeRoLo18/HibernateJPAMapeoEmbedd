package mx.edu.uacm.dominio;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOEMBEBIDO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre_usuario", length = 100)
	private String nombreUsuario;
	
	@Column(name = "mensaje_usuario")
	private String mensajeUsuario;
	
	
	@AttributeOverrides(value = {
	
			@AttributeOverride(column = @Column( name = "casa_calle",length=40), name = "calle"),
			@AttributeOverride(column = @Column( name = "casa_codigoPostal"), name = "codigoPostal"),
			@AttributeOverride(column = @Column( name = "casa_poblacion"), name = "poblacion"),
			@AttributeOverride(column = @Column( name = "casa_provincia"), name = "provincia"),
	})
	private Direccion direccionCasa;
	
	@AttributeOverrides(value = {
			
			@AttributeOverride(column = @Column( name = "trabao_calle",length=40), name = "calle"),
			@AttributeOverride(column = @Column( name = "trabajo_codigoPostal"), name = "codigoPostal"),
			@AttributeOverride(column = @Column( name = "trabajo_poblacion"), name = "poblacion"),
			@AttributeOverride(column = @Column( name = "trabajo_provincia"), name = "provincia"),
	})
	private Direccion direccionTrabajo;

	
	public Direccion getDireccionTrabajo() {
		return direccionTrabajo;
	}

	public void setDireccionTrabajo(Direccion direccionTrabajo) {
		this.direccionTrabajo = direccionTrabajo;
	}

	public Direccion getDireccionCasa() {
		return direccionCasa;
	}

	public void setDireccionCasa(Direccion direccionCasa) {
		this.direccionCasa = direccionCasa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}
	
	
	

}
