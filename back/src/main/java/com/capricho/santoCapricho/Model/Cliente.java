package com.capricho.santoCapricho.Model;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteId;
	private String nombre;
	private String direccion;
	private String celular;
	private String email;
	/////////////////////////
	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "clienteId")
	private List<Comanda> Comandas;
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return direccion;
	}
	public void setDirección(String dirección) {
		this.direccion = dirección;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Comanda> getComandas() {
		return Comandas;
	}
	public void setComandas(List<Comanda> comandas) {
		Comandas = comandas;
	}
	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", dirección=" + direccion + ", celular="
				+ celular + ", email=" + email + ", Comandas=" + Comandas + "]";
	}
	public Cliente(Long clienteId, String nombre, String dirección, String celular, String email,
			List<Comanda> comandas) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.direccion = dirección;
		this.celular = celular;
		this.email = email;
		Comandas = comandas;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
