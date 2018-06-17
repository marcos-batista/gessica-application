package com.agroall.gessica.dataobjects;

public class ItemVenda {
	
	private int quantidadeProdutos;
	private Double margemLucroItem;
	private Double descontoItem;
	private Double precoItem;
	
	private Double precoCalculado;
	
	public ItemVenda() {
		this.quantidadeProdutos = 0;
		this.margemLucroItem = 0d;
		this.descontoItem = 0d;
		this.precoItem = 0d;
	}
	
	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}
	
	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
		calculatePreco();
	}
	
	public Double getMargemLucroItem() {
		return margemLucroItem;
	}
	
	public void setMargemLucroItem(Double margemLucroItem) {
		this.margemLucroItem = margemLucroItem;
		calculatePreco();
	}
	
	public Double getDescontoItem() {
		return descontoItem;
	}
	
	public void setDescontoItem(Double descontoItem) {
		this.descontoItem = descontoItem;
		calculatePreco();
	}
	
	public Double getPrecoItem() {
		return precoItem;
	}
	
	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
		calculatePreco();
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {}
	
	protected void calculatePreco() {
		if(this.precoItem == null || this.descontoItem == null || this.margemLucroItem  == null) this.precoCalculado = null;
		this.precoCalculado = (this.precoItem - this.descontoItem) + this.margemLucroItem;
		this.precoCalculado = (this.precoCalculado * this.quantidadeProdutos);
	}
	
}
