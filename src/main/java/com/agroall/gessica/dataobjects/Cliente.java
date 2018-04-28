package com.agroall.gessica.dataobjects;

import com.agroall.gessica.dataobjects.classifiers.CategoriaCliente;

public class Cliente {
	
	private String razaoSocial;
	private String nomeFantasia;
	private CategoriaCliente categoria;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public CategoriaCliente getCategoria() {
		return categoria;
	}
	
	public void setCategoria(CategoriaCliente categoria) {
		this.categoria = categoria;
	}
	
}
