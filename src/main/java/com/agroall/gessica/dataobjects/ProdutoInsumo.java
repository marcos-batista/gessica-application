package com.agroall.gessica.dataobjects;

import java.util.Calendar;

import com.agroall.gessica.dataobjects.Produto;

public class ProdutoInsumo extends Produto {
	
	private Calendar dataValidade;
	private boolean agrotoxico;
	
	public Calendar getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public boolean isAgrotoxico() {
		return agrotoxico;
	}
	
	public void setAgrotoxico(boolean agrotoxico) {
		this.agrotoxico = agrotoxico;
	}
	
}
