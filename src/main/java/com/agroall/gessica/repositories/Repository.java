package com.agroall.gessica.repositories;

import java.util.Collection;

public interface Repository {
	
	public <DATAOBJECT> DATAOBJECT insert_(DATAOBJECT dataObject);
	
	public <DATAOBJECT> DATAOBJECT update_(DATAOBJECT dataObject);
	
	public <DATAOBJECT> void delete_(DATAOBJECT dataObject);
	
	public <DATAOBJECT> DATAOBJECT findById_(Object id);
	
	public <DATAOBJECT> Collection<DATAOBJECT> listAll_();
	
}
