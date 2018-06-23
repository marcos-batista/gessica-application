package com.agroall.gessica.dataobjects;

public class ProdutoComercial extends Produto {
	
	private Double precoUnitario;
	
	public ProdutoComercial() {
		this.precoUnitario = 0d;
	}
	
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
}
