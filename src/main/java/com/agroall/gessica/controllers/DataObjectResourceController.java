package com.agroall.gessica.controllers;

public interface DataObjectResourceController<DATAOBJECT> extends ResourceController {
	
	public DATAOBJECT doGet();

	public DATAOBJECT doGet(Object id);
	
	public DATAOBJECT doPost(DATAOBJECT dataObject);
	
	public DATAOBJECT doPut(DATAOBJECT dataObject);
	
	public DATAOBJECT doDelete(DATAOBJECT dataObject);
	
}
