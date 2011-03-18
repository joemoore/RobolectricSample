package com.pivotallabs.tracker;

import android.app.Activity;
import android.os.Bundle;
import com.pivotallabs.api.Http;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MostRecentTweetActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HttpClient client = new DefaultHttpClient();
        try {
            HttpGet request = new HttpGet(new URI("http://search.twitter.com/search.atom"));
            BasicHttpParams params = new BasicHttpParams();
            params.setParameter("q", "robolectric");
            params.setParameter("rpp", "1");
            request.setParams(params);
            client.execute(request);
        } catch (URISyntaxException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
