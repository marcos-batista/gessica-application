package com.agroall.gessica.integration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class RestfulClientImpl_OLD extends HttpClientImpl implements RestfulClient_OLD {
	
	private String method;
	private String responseAsJson;
	
	@Override
	public RestfulClient_OLD get(String path) {
		this.method = "GET";
		super.setPath(path);
		return this;
	}

	@Override
	public RestfulClient_OLD post(String path) {
		this.method = "POST";
		super.setPath(path);
		return this;
	}

	@Override
	public RestfulClient_OLD put(String path) {
		this.method = "PUT";
		super.setPath(path);
		return this;
	}

	@Override
	public RestfulClient_OLD delete(String path) {
		this.method = "DELETE";
		super.setPath(path);
		return this;
	}
	
	@Override
	public RestfulClient_OLD send() {
		super.send();
		InputStream response = (InputStream) getResponseContent();
		this.responseAsJson = convertToJsonContent(response);
		return this;
	}
	
	protected String convertToJsonContent(InputStream content) {
		StringBuilder stringJson = new StringBuilder();
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(content, getCorrectCharset()));
			String line = reader.readLine();
			do
			{
				stringJson.append(line);
				line = reader.readLine();
			}
			while (line != null);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		return stringJson.toString();
	}
	
	protected Charset getCorrectCharset() {
		return Charset.availableCharsets().get("UTF-8");
	}
	
	public String getResponseAsJson() {
		return this.responseAsJson;
	}

}
