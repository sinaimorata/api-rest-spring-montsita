package com.montsita.morata.hernandez.api.app.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//campo me aparecia cm nulo, con esta anotacion lo quito
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	private String email;
	private int telefono;
	//hace referencia a una fecha
	//con la anotacion @Column hemos cambiado el nombre de la columna
	//con la anotacion @Temporal hemos dejado formato fecha q interesa. Solo fecha sin hora
	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	//METODO PARA GENERAL FECHAS
	public void prePersist() {
		createAt = new Date();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCcreateAt(Date ccreateAt) {
		createAt = ccreateAt;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
