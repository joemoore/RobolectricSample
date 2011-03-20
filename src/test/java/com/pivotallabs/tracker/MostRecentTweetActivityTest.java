package com.pivotallabs.tracker;

import android.widget.TextView;
import com.pivotallabs.R;
import com.pivotallabs.TestResponses;
import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.net.URI;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MostRecentTweetActivityTest {
    private MostRecentTweetActivity mostRecentTweetActivity;
    private HttpUriRequest sentHttpRequest;

    @Before
    public void setUp() throws Exception {
        Robolectric.addPendingHttpResponse(200, TestResponses.LATEST_TWEET);
        mostRecentTweetActivity = new MostRecentTweetActivity();
        mostRecentTweetActivity.onCreate(null);
    }

    @Test
    public void shouldFetchLatestRobolectricTweetWhenStarted() {
        sentHttpRequest = (HttpUriRequest) Robolectric.getSentHttpRequest(0);
        assertEquals(URI.create("http://search.twitter.com/search.atom?q=robolectric&rpp=1"), sentHttpRequest.getURI());
    }

    @Test
    public void shouldDisplayLastTweetText() {
        TextView tweetTest = (TextView) mostRecentTweetActivity.findViewById(R.id.tweet_text);
        assertEquals("Robolectric is Great!", tweetTest.getText());
    }
}
