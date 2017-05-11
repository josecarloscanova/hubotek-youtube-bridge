package org.hubotek.youtube.search;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public interface Constants {
	
	public static Integer YOUTUBE_SEARCH_MAX_RESULTS=25;
//	public static final String PROPERTIES_FILENAME = "youtube.properties";

    public static final String CREDENTIALS_DIRECTORY = ".oauth-credentials";

}
