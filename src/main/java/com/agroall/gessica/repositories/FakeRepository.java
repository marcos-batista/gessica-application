package com.agroall.gessica.repositories;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class FakeRepository implements Repository {
	
	private Persistent<Integer> dataObjectScope;
	
	private Collection<? extends Persistent<?>> dataObjectCollection;
	
	protected final Persistent<Integer> getDataObjectScope() {
		return this.dataObjectScope;
	}
	
	protected final <DATAOBJECT> void setDataObjectScope(Persistent<Integer> dataObject) {
		this.dataObjectScope = dataObject;
	}
	
	protected final void resetDataObjectScope() {
		this.dataObjectScope = null;
	}
	
	@SuppressWarnings("unchecked")
	public <DATAOBJECT> DATAOBJECT insert_(DATAOBJECT dataObject) {
		setDataObjectScope((Persistent<Integer>) dataObject);
		setNewId(getDataObjectScope());
		getDataObjectCollection().add(dataObject);
		resetDataObjectScope();
		return dataObject;
	}
	
	protected final void setNewId(Persistent<Integer> dataObject) {
		Integer newId = (getDataObjectCollection().size() + 1);
		dataObject.setId(newId);
	}
	
	@SuppressWarnings("unchecked")
	protected final <DATAOBJECT> Collection<DATAOBJECT> getDataObjectCollection() {
		if(this.dataObjectCollection == null) this.dataObjectCollection = factoryDataObjectCollection();
		return (Collection<DATAOBJECT>) this.dataObjectCollection;
	}
	
	protected <DATAOBJECT> Collection<DATAOBJECT> factoryDataObjectCollection() {
		return new HashSet<DATAOBJECT>();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <DATAOBJECT> DATAOBJECT findById_(Object id) {
		//if(getDataObjectCollection().isEmpty()) return null;
		Collection<? extends Persistent<?>> dataObjectCollection = getDataObjectCollection();
		Persistent<?> dataObject = dataObjectCollection.stream().filter(o -> o.getId().equals(id)).findFirst().get();
		return (DATAOBJECT) dataObject;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <DATAOBJECT> DATAOBJECT update_(DATAOBJECT dataObject) {
		
		setDataObjectScope((Persistent<Integer>) dataObject);
		
		Persistent<?> oldDataObjectPersistent = findById_(getDataObjectScope().getId());
		Persistent<?> newDataObjectPersistent = getDataObjectScope();
		
		try
		{
			update(oldDataObjectPersistent, newDataObjectPersistent);
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		catch (SecurityException e) {
			e.printStackTrace();
		}
		catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		resetDataObjectScope();
		return (DATAOBJECT) oldDataObjectPersistent;
		
	}
	
	protected <DATAOBJECT extends Persistent<?>> void update(DATAOBJECT oldDataObject, DATAOBJECT newDataObject) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException
	{
		Class<? extends Object> oldDataObjectClass = oldDataObject.getClass();
		Class<? extends Object> newDataObjectClass = newDataObject.getClass();
		
		Method[] methods = newDataObjectClass.getMethods();
		for (Method method : methods) {
			
			String methodName = method.getName();
			
			boolean isGetterMethod = methodName.startsWith("get");
			if(!isGetterMethod) continue;
			
			if
			(
				"getClass".equals(methodName) ||
				"getId".equals(methodName)
			)
			{ continue; }
			
			Method getterMethod = method;
			Object newValue = getterMethod.invoke(newDataObject);
			
			Method setterMethod = oldDataObjectClass.getMethod((methodName.replace("get", "set")), newValue.getClass());
			setterMethod.invoke(oldDataObject, newValue);
			
		}
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <DATAOBJECT> void delete_(DATAOBJECT dataObject) {
		setDataObjectScope((Persistent<Integer>) dataObject);
		delete(getDataObjectScope());
		resetDataObjectScope();
	}
	
	protected void delete(Persistent<?> dataObject) {
		Collection<? extends Persistent<?>> dataObjectCollection = getDataObjectCollection();
		for (Iterator<? extends Persistent<?>> iterator = dataObjectCollection.iterator(); iterator.hasNext();) {
			Persistent<?> persistedObject = iterator.next();
			if(persistedObject.getId().equals(dataObject.getId())) {
				iterator.remove(); return;
			}
		}
	}
	
	@Override
	public <DATAOBJECT> Collection<DATAOBJECT> listAll_() {
		return getDataObjectCollection();
	}
	
}
