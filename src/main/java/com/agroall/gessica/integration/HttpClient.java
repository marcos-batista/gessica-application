package com.agroall.gessica.integration;

public interface HttpClient {
	
	public HttpClient setHost(String host);
	
	public HttpClient setPort(String port);

	public HttpClient setPath(String path);
	
	public HttpClient setContent(Object content);
	
	public HttpClient addHeader(String key, String value);
	
	public HttpClient send();
	
}
