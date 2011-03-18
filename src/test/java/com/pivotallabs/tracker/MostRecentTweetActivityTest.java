package com.pivotallabs.tracker;

import com.sun.deploy.net.HttpResponse;
import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.net.URI;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MostRecentTweetActivityTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldFetchLatestRobolectricTweetWhenStarted() {
        MostRecentTweetActivity mostRecentTweetActivity = new MostRecentTweetActivity();
        Robolectric.addPendingHttpResponse(200, "monkey!");
        mostRecentTweetActivity.onCreate(null);

        HttpUriRequest sentHttpRequest = (HttpUriRequest) Robolectric.getSentHttpRequest(0);
        assertEquals(URI.create("http://search.twitter.com/search.atom"), sentHttpRequest.getURI());
        assertEquals("robolectric", sentHttpRequest.getParams().getParameter("q"));
        assertEquals("1", sentHttpRequest.getParams().getParameter("rpp"));
    }
}
