package com.agroall.gessica.dataobjects;

public class ProdutoEstoque extends Produto {
	
	private int quantidadeAtual;
	private long quantidadeTotalizada;
	
	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}
	
	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}
	
	public long getQuantidadeTotalizada() {
		return quantidadeTotalizada;
	}
	
	public void setQuantidadeTotalizada(long quantidadeTotalizada) {
		this.quantidadeTotalizada = quantidadeTotalizada;
	}
	
}
