package com.pivotallabs.tracker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.pivotallabs.R;
import com.pivotallabs.api.Http;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;

public class MostRecentTweetActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.most_recent_tweet_layout);

        HttpClient client = new DefaultHttpClient(); 
        try {
            HttpGet request = new HttpGet(new URI("http://search.twitter.com/search.atom?q=robolectric&rpp=1"));
            BasicHttpParams params = new BasicHttpParams();
//            params.setParameter("q", "robolectric");
//            params.setParameter("rpp", "1");
//            request.setParams(params);
            HttpResponse httpResponse = client.execute(request);

            TextView view = (TextView) findViewById(R.id.tweet_text);

            Http.Response response = new Http.Response(httpResponse);
            String responseBody = response.getResponseBody();

            try {
                InputSource inputStream = new InputSource();
                inputStream.setCharacterStream(new StringReader(responseBody));
                
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
                NodeList titleNode = document.getElementsByTagName("title");
                System.out.println("titleNode = " + titleNode);
                view.setText(titleNode.item(1).getTextContent());
            } catch (SAXException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (ParserConfigurationException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }


        } catch (URISyntaxException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
