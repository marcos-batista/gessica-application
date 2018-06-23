package com.agroall.gessica.dataobjects;

public class ItemVenda {
	
	private int quantidadeProdutos;
	private Double precoItem;
	private Double precoCalculado;
	
	public ItemVenda() {
		this.quantidadeProdutos = 0;
		this.precoItem = 0d;
	}
	
	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}
	
	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
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
		this.precoCalculado = (this.precoCalculado * this.quantidadeProdutos);
	}
	
}
