package com.agroall.gessica.dataobjects;

public class Venda {
	
	private String codigo;
	private Long data;
	private Double desconto;
	
	private Cliente cliente;
	
	public Venda() {
		this.desconto = 0d;
	}
	
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
	
	public Double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
