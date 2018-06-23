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
		if(this.precoItem == null) { this.precoCalculado = null; return; }
		this.precoCalculado = (this.precoItem * this.quantidadeProdutos);
	}
	
}
