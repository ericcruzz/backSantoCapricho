package com.capricho.santoCapricho.Model;

import java.time.*;
import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Comanda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comandaId;
	private int noMesa;
	private LocalDate fecha;
	//////////////
	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "comandaId")
	private List<ComandaPlatillo> ComandaPlatillos;
	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "comandaId")
	private List<Ticket> Tickets;
	
	//////////////
	private Long clienteId;//Foranea
	public String tipoServicio;
	/////////////////////////////////////////////////////////////
	public Long getComandaId() {
		return comandaId;
	}
	public void setComandaId(Long comandaId) {
		this.comandaId = comandaId;
	}
	public int getNoMesa() {
		return noMesa;
	}
	public void setNoMesa(int noMesa) {
		this.noMesa = noMesa;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public List<ComandaPlatillo> getComandaPlatillos() {
		return ComandaPlatillos;
	}
	public void setComandaPlatillos(List<ComandaPlatillo> comandaPlatillos) {
		ComandaPlatillos = comandaPlatillos;
	}
	public List<Ticket> getTickets() {
		return Tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		Tickets = tickets;
	}
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	@Override
	public String toString() {
		return "Comanda [comandaId=" + comandaId + ", noMesa=" + noMesa + ", fecha=" + fecha + ", ComandaPlatillos="
				+ ComandaPlatillos + ", Tickets=" + Tickets + ", clienteId=" + clienteId + ", tipoServicio="
				+ tipoServicio + "]";
	}
	public Comanda(Long comandaId, int noMesa, LocalDate fecha, List<ComandaPlatillo> comandaPlatillos,
			List<Ticket> tickets, Long clienteId, String tipoServicio) {
		super();
		this.comandaId = comandaId;
		this.noMesa = noMesa;
		this.fecha = fecha;
		ComandaPlatillos = comandaPlatillos;
		Tickets = tickets;
		this.clienteId = clienteId;
		this.tipoServicio = tipoServicio;
	}
	public Comanda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
