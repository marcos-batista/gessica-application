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
		this.quantidadeTotalizada = quantidadeTotalizada < 0 ? 0 : quantidadeTotalizada;
	}
	
	public void creditar(int quantidade) {
		this.quantidadeAtual += quantidade;
		this.quantidadeTotalizada += quantidade;
	}
	
	public void debitar(int quantidade) {
		this.quantidadeAtual -= quantidade;
	}

}
