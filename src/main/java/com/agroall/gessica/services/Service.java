package com.agroall.gessica.services;

import java.util.Collection;

public interface Service<DATAOBJECT> {
	
	public abstract DATAOBJECT factoryNewDataObject();
	
	public DATAOBJECT insert(DATAOBJECT dataObject);
	
	public DATAOBJECT update(DATAOBJECT dataObject);
	
	public void delete(DATAOBJECT dataObject);
	
	public DATAOBJECT findById(Integer id);
	
	public Collection<DATAOBJECT> listAll();
	
}
