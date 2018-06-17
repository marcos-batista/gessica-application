package com.agroall.gessica.dataobjects;

public class ProdutoComercial extends Produto {
	
	private Double margemLucroUnitario;
	private Double descontoUnitario;
	private Double precoUnitario;
	
	private Double precoCalculado;
	
	public ProdutoComercial() {
		this.margemLucroUnitario = 0d;
		this.descontoUnitario = 0d;
		this.precoUnitario = 0d;
	}
	
	public Double getMargemLucroUnitario() {
		return margemLucroUnitario;
	}
	
	public void setMargemLucroUnitario(Double margemLucroUnitario) {
		this.margemLucroUnitario = margemLucroUnitario;
		calculatePreco();
	}
	
	public Double getDescontoUnitario() {
		return descontoUnitario;
	}
	
	public void setDescontoUnitario(Double descontoUnitario) {
		this.descontoUnitario = descontoUnitario;
		calculatePreco();
	}
	
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public void setPrecoFinal(Double precoFinal) {}
	
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
		calculatePreco();
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {}
	
	protected void calculatePreco() {
		if(this.precoUnitario == null || this.descontoUnitario == null || this.margemLucroUnitario  == null) this.precoCalculado = null;
		this.precoCalculado = (this.precoUnitario - this.descontoUnitario) + this.margemLucroUnitario;
	}
	
}
