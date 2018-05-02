package com.agroall.gessica.dataobjects.aspects;

public interface Persistent<IDTYPE> {
	
	public IDTYPE getId();
	
	public void setId(IDTYPE id);
	
}
