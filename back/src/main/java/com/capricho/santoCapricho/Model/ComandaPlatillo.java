package com.capricho.santoCapricho.Model;

import javax.persistence.*;

@Entity
@Table
public class ComandaPlatillo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comandaPlatilloId;
	private int cantidad;
	private String condimentos;
	private Long comandaId; //Relacion con comanda
	private Long platilloId; //Relacion con platillo
	public Long getComandaPlatilloId() {
		return comandaPlatilloId;
	}
	public void setComandaPlatilloId(Long comandaPlatilloId) {
		this.comandaPlatilloId = comandaPlatilloId;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getCondimentos() {
		return condimentos;
	}
	public void setCondimentos(String condimentos) {
		this.condimentos = condimentos;
	}
	public Long getComandaId() {
		return comandaId;
	}
	public void setComandaId(Long comandaId) {
		this.comandaId = comandaId;
	}
	public Long getPlatilloId() {
		return platilloId;
	}
	public void setPlatilloId(Long platilloId) {
		this.platilloId = platilloId;
	}
	@Override
	public String toString() {
		return "ComandaPlatillo [comandaPlatilloId=" + comandaPlatilloId + ", cantidad=" + cantidad + ", condimentos="
				+ condimentos + ", comandaId=" + comandaId + ", platilloId=" + platilloId + "]";
	}
	public ComandaPlatillo(Long comandaPlatilloId, int cantidad, String condimentos, Long comandaId, Long platilloId) {
		super();
		this.comandaPlatilloId = comandaPlatilloId;
		this.cantidad = cantidad;
		this.condimentos = condimentos;
		this.comandaId = comandaId;
		this.platilloId = platilloId;
	}
	public ComandaPlatillo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
