package com.agroall.gessica.services;

import java.util.Collection;

import com.agroall.gessica.repositories.FakeRepository;
import com.agroall.gessica.repositories.Repository;

public abstract class GessicaService<DATAOBJECT> implements Service<DATAOBJECT> {
	
	private Repository repository;
	
	protected Repository getRepository() {
		if(this.repository == null) this.repository = factoryRepository();
		return this.repository;
	}
	
	protected Repository factoryRepository() {
		return new FakeRepository();
	}
	
	public abstract DATAOBJECT factoryNewDataObject();
	
	public DATAOBJECT insert(DATAOBJECT dataObject) {
		return getRepository().insert_(dataObject);
	}
	
	public DATAOBJECT update(DATAOBJECT dataObject) {
		return getRepository().update_(dataObject);
	}
	
	public void delete(DATAOBJECT dataObject) {
		getRepository().delete_(dataObject);
	}
	
	public DATAOBJECT findById(Object id) {
		return getRepository().findById_(id);
	}
	
	public Collection<DATAOBJECT> listAll() {
		return getRepository().listAll_();
	}
	
	
}
