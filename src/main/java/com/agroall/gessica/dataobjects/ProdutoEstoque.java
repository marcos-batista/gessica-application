package com.agroall.gessica.dataobjects;

public class ProdutoEstoque extends Produto {
	
	private int quantidadeEstoque;
	
	private ProdutoInsumo produto;
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public ProdutoInsumo getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoInsumo produto) {
		this.produto = produto;
	}
	
}
