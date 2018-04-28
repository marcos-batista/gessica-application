package com.agroall.gessica.dataobjects.classifiers;

public enum CategoriaCliente {
	
	COMUM, ESPECIAL;
	
	public static CategoriaCliente getByString(String categoriaClienteAsString) {
		if("COMUM".equals(categoriaClienteAsString)) return COMUM;
		if("ESPECIAL".equals(categoriaClienteAsString)) return ESPECIAL;
		throw new RuntimeException("Parameter 'categoriaClienteAsString' is invalid.");
	}
	
}
