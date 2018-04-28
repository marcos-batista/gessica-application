package com.agroall.gessica.controllers;

import java.util.Collection;

public interface DataCollectionResourceController<DATAOBJECT> extends ResourceController {
	
	public Collection<DATAOBJECT> doList();

}
