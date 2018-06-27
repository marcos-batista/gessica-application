package com.agroall.gessica.integration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class HttpClientImpl implements HttpClient {
	
	private String protocol;
	private String host;
	private String port;
	private String path;
	private Object requestContent;
	
	private Object responseContent;
	
	private Map<String, String> header = new HashMap<String, String>();
	
	@Override
	public HttpClient setHost(String host) {
		this.host = host;
		return this;
	}

	@Override
	public HttpClient setPort(String port) {
		this.port = port;
		return this;
	}

	@Override
	public HttpClient setPath(String path) {
		this.path = path;
		return this;
	}

	@Override
	public HttpClient setContent(Object content) {
		this.requestContent = content;
		return this;
	}

	@Override
	public HttpClient addHeader(String key, String value) {
		header.put(key, value);
		return this;
	}

	@Override
	public HttpClient send() {
		String endpoint = getEndpoint();
		try
		{
			URL url = new URL(endpoint);
			URLConnection urlConnection = url.openConnection();
			this.responseContent = urlConnection.getInputStream();
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return this;
	}
	
	protected String getEndpoint() {
		StringBuilder endpoint = new StringBuilder();
		if(isEmpty(this.protocol)) { return endpoint.toString(); }
		if(isEmpty(this.host)) { return endpoint.toString(); }
		endpoint.append(this.protocol).append("://").append(this.host);
		if(isNotEmpty(this.port)) {
			endpoint.append(":").append(this.port);
		}
		if(isNotEmpty(this.path)) {
			endpoint.append(this.path);
		}
		return endpoint.toString();
	}
	
	private boolean isEmpty(String value) {
		return !isNotEmpty(value);
	}
	
	private boolean isNotEmpty(String value) {
		return value != null && !value.trim().isEmpty();
	}
	
	protected Object getResponseContent() {
		return this.responseContent;
	}
	
}
