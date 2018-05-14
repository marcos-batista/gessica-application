package com.agroall.gessica.controllers;

import java.util.Collection;

import com.agroall.gessica.services.Service;

public abstract class DataCollectionResourceControllerImpl<DATAOBJECT> implements DataCollectionResourceController<DATAOBJECT> {
	
	protected abstract Service<DATAOBJECT> getService();
	
	@Override
	public Collection<DATAOBJECT> doList() {
		return listAll();
	}
	
	protected Collection<DATAOBJECT> listAll() {
		return getService().listAll();
	}
	
}
