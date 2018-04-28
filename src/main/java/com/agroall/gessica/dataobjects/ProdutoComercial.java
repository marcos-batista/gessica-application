package com.agroall.gessica.dataobjects;

public class ProdutoComercial extends Produto {
	
	private Double margemLucroUnitario;
	private Double descontoUnitario;
	private Double precoUnitario;
	
	public Double getMargemLucroUnitario() {
		return margemLucroUnitario;
	}
	
	public void setMargemLucroUnitario(Double margemLucroUnitario) {
		this.margemLucroUnitario = margemLucroUnitario;
	}
	
	public Double getDescontoUnitario() {
		return descontoUnitario;
	}
	
	public void setDescontoUnitario(Double descontoUnitario) {
		this.descontoUnitario = descontoUnitario;
	}
	
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
}
