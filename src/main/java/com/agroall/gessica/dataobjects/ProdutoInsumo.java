package com.agroall.gessica.dataobjects;

public class ProdutoInsumo extends Produto {
	
	private Long dataValidade;
	private boolean agrotoxico;
	
	public Long getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(Long dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public boolean isAgrotoxico() {
		return agrotoxico;
	}
	
	public void setAgrotoxico(boolean agrotoxico) {
		this.agrotoxico = agrotoxico;
	}
	
}
