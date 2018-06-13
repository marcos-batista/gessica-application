package com.agroall.gessica.services;

import java.util.Collection;

import com.agroall.gessica.repositories.FakeRepository;
import com.agroall.gessica.repositories.Repository;

public abstract class ServiceImpl<DATAOBJECT> implements Service<DATAOBJECT> {
	
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
	
	protected void validateBeforeInsert(DATAOBJECT dataObject) {
		validateBeforeInsertOrUpdate(dataObject);
	}
	
	public DATAOBJECT update(DATAOBJECT dataObject) {
		return getRepository().update_(dataObject);
	}
	
	protected void validateBeforeUpdate(DATAOBJECT dataObject) {
		validateBeforeInsertOrUpdate(dataObject);
	}
	
	protected void validateBeforeInsertOrUpdate(DATAOBJECT dataObject) {
		if(dataObject == null) throw new RuntimeException("Data object is null");
	}
	
	public void delete(DATAOBJECT dataObject) {
		validateBeforeDelete(dataObject);
		getRepository().delete_(dataObject);
	}
	
	protected void validateBeforeDelete(DATAOBJECT dataObject) {
		if(dataObject == null) throw new RuntimeException("Data object is null");
	}
	
	public DATAOBJECT findById(Object id) {
		return getRepository().findById_(id);
	}
	
	public Collection<DATAOBJECT> listAll() {
		return getRepository().listAll_();
	}
	
	protected final void disableOperation(DATAOBJECT dataObject) {
		if(dataObject == null) {
			dataObject = factoryNewDataObject();
		}
		throw new RuntimeException(
			"This operation is not enabled for objects of type " +
			dataObject.getClass().getSimpleName()
		);
	}
	
	
}
