package com.agroall.gessica.controllers;

public interface DataObjectResourceController<DATAOBJECT> extends ResourceController {
	
	public DATAOBJECT doGet();
	
	public DATAOBJECT doGet(String id);
	
	public DATAOBJECT doPost(DATAOBJECT dataObject);
	
	public DATAOBJECT doPut(String id, DATAOBJECT dataObject);
	
	public DATAOBJECT doDelete(DATAOBJECT dataObject);
	
}
