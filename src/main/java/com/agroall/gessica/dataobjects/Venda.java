package com.agroall.gessica.dataobjects;

public class Venda {
	
	private String codigo;
	private Long data;
	
	private Cliente cliente;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Long getData() {
		return data;
	}
	
	public void setData(Long data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
