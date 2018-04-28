package com.agroall.gessica.repositories;

import java.util.Collection;

public interface Repository {
	
	public <DATAOBJECT> DATAOBJECT insert(DATAOBJECT dataObject);
	
	public <DATAOBJECT> DATAOBJECT update(DATAOBJECT dataObject);
	
	public <DATAOBJECT> void delete(DATAOBJECT dataObject);
	
	public <DATAOBJECT> DATAOBJECT findById(Object id);
	
	public <DATAOBJECT> Collection<DATAOBJECT> listAll();
	
}
