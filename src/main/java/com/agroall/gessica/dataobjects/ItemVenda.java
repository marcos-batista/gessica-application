package com.agroall.gessica.dataobjects;

public class ItemVenda {
	
	private int quantidadeProdutos;
	private Double precoItem;
	private Double precoCalculado;
	
	public ItemVenda() {
		this.quantidadeProdutos = 0;
		this.precoItem = 0d;
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}
	
	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public Double getPrecoItem() {
		return precoItem;
	}
	
	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	protected Double resolvePrecoCalculado() {
		if(this.precoItem == null) { this.precoCalculado = null; return null;}
		this.precoCalculado = (this.precoItem * this.quantidadeProdutos);
		return this.precoCalculado;
	}
	
}
