package org.hubotek.youtube.search;

import java.io.IOException;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;

/**
 * TODO: Finish class implementation.
 * 
 * @author JoseCanova
 *
 */
public class Search{

    private YouTube youtube;

    public final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

    public final JsonFactory JSON_FACTORY = new JacksonFactory();
    
	public Search() {
	}

	void prepare()
	{ 
		youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, new HttpRequestInitializer() {
            public void initialize(HttpRequest request) throws IOException {
            }
        }).setApplicationName("hubotek.youtube.bridge").build();
	}
	
	public <T extends SearchResult> T executeSearch()
	{ 
		return null;
	}
	
}
