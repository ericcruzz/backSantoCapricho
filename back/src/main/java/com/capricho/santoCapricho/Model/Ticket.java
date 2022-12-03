package com.capricho.santoCapricho.Model;

import java.time.*;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ticketId;
	private LocalDateTime fecha;
	private String formaPago;
	private float subtotal;
	private float total;
	private boolean factura;
	private LocalDate fechaFactura;
	private String RFC;
	private Long comandaId;
	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public LocalDate getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public Long getComandaId() {
		return comandaId;
	}
	public void setComandaId(Long comandaId) {
		this.comandaId = comandaId;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public boolean isFactura() {
		return factura;
	}
	public void setFactura(boolean factura) {
		this.factura = factura;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", fecha=" + fecha + ", formaPago=" + formaPago + ", subtotal="
				+ subtotal + ", total=" + total + ", factura=" + factura + ", fechaFactura=" + fechaFactura + ", RFC="
				+ RFC + ", comandaId=" + comandaId + "]";
	}
	public Ticket(Long ticketId, LocalDateTime fecha, String formaPago, float subtotal, float total,
			boolean factura, LocalDate fechaFactura, String rFC, Long comandaId) {
		super();
		this.ticketId = ticketId;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.subtotal = subtotal;
		this.total = total;
		this.factura = factura;
		this.fechaFactura = fechaFactura;
		RFC = rFC;
		this.comandaId = comandaId;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
