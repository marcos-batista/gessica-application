package com.agroall.gessica.dataobjects;

public class ItemVenda {
	
	private int quantidadeProdutos;
	private Double precoItem;
	private Double margemLucroItem;
	private Double descontoItem;
	
	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}
	
	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}
	
	public Double getPrecoItem() {
		return precoItem;
	}
	
	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}
	
	public Double getMargemLucroItem() {
		return margemLucroItem;
	}
	
	public void setMargemLucroItem(Double margemLucroItem) {
		this.margemLucroItem = margemLucroItem;
	}
	
	public Double getDescontoItem() {
		return descontoItem;
	}
	
	public void setDescontoItem(Double descontoItem) {
		this.descontoItem = descontoItem;
	}
	
}
