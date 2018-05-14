package com.agroall.gessica.controllers;

import com.agroall.gessica.services.Service;

public abstract class DataObjectResourceControllerImpl<DATAOBJECT> implements DataObjectResourceController<DATAOBJECT> {
	
	protected abstract Service<DATAOBJECT> getService();
	
	@Override
	public DATAOBJECT doGet() {
		return factoryNewDataObject();
	}
	
	protected DATAOBJECT factoryNewDataObject() {
		return getService().factoryNewDataObject();
	}

	@Override
	public DATAOBJECT doGet(String id) {
		return findById(id);
	}
	
	protected DATAOBJECT findById(String id) {
		return getService().findById(id);
	}
	
	@Override
	public DATAOBJECT doPost(DATAOBJECT dataObject) {
		return insert(dataObject);
	}
	
	protected DATAOBJECT insert(DATAOBJECT dataObject) {
		return getService().insert(dataObject);
	}

	@Override
	public DATAOBJECT doPut(String id, DATAOBJECT dataObject) {
		return update(dataObject);
	}
	
	protected DATAOBJECT update(DATAOBJECT dataObject) {
		return getService().update(dataObject);
	}
	
	@Override
	public DATAOBJECT doDelete(DATAOBJECT dataObject) {
		delete(dataObject);
		return factoryNewDataObject();
	}
	
	protected void delete(DATAOBJECT dataObject) {
		getService().delete(dataObject);
	}
	
}
