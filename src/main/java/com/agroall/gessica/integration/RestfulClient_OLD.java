package com.agroall.gessica.integration;

public interface RestfulClient_OLD extends HttpClient {

	public RestfulClient_OLD get(String path);
	
	public RestfulClient_OLD post(String path);
	
	public RestfulClient_OLD put(String path);
	
	public RestfulClient_OLD delete(String path);
	
}
