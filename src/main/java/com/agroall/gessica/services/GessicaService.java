package com.agroall.gessica.services;

import java.util.Collection;

import com.agroall.gessica.repositories.GessicaRepository;
import com.agroall.gessica.repositories.Repository;

public abstract class GessicaService<DATAOBJECT> implements Service<DATAOBJECT> {
	
	private Repository repository;
	
	protected Repository getRepository() {
		if(this.repository == null) this.repository = factoryRepository();
		return this.repository;
	}
	
	protected Repository factoryRepository() {
		return new GessicaRepository();
	}
	
	public abstract DATAOBJECT factoryNewDataObject();
	
	public DATAOBJECT insert(DATAOBJECT dataObject) {
		return getRepository().insert(dataObject);
	}
	
	public DATAOBJECT update(DATAOBJECT dataObject) {
		return getRepository().update(dataObject);
	}
	
	public void delete(DATAOBJECT dataObject) {
		getRepository().delete(dataObject);
	}
	
	public DATAOBJECT findById(Integer id) {
		return getRepository().findById(id);
	}
	
	public Collection<DATAOBJECT> listAll() {
		return getRepository().listAll();
	}
	
	
}
