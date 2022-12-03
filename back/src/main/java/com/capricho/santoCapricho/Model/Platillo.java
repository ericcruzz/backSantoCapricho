package com.capricho.santoCapricho.Model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Platillo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long platilloId;
	private String nombre;
	private float precio;
	private String tipoPlatillo;
	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "platilloId")
	private List<ComandaPlatillo> ComandaPlatillos;
	
	public Platillo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Platillo(Long platilloId, String nombre, float precio, String tipoPlatillo,
			List<ComandaPlatillo> comandaPlatillos) {
		super();
		this.platilloId = platilloId;
		this.nombre = nombre;
		this.precio = precio;
		this.tipoPlatillo = tipoPlatillo;
		ComandaPlatillos = comandaPlatillos;
	}
	public Long getPlatilloId() {
		return platilloId;
	}
	public void setPlatilloId(Long platilloId) {
		this.platilloId = platilloId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public List<ComandaPlatillo> getComandaPlatillos() {
		return ComandaPlatillos;
	}
	public void setComandaPlatillos(List<ComandaPlatillo> comandaPlatillos) {
		ComandaPlatillos = comandaPlatillos;
	}
	public String getTipoPlatillo() {
		return tipoPlatillo;
	}
	public void setTipoPlatillo(String tipoPlatillo) {
		this.tipoPlatillo = tipoPlatillo;
	}
	@Override
	public String toString() {
		return "Platillo [platilloId=" + platilloId + ", nombre=" + nombre + ", precio=" + precio + ", tipoPlatillo="
				+ tipoPlatillo + ", ComandaPlatillos=" + ComandaPlatillos + "]";
	}
	

	
	
}
