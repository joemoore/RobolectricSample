package com.pivotallabs;

public class TestResponses {
    public static final String RECENT_ACTIVITY = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
    "<activities type=\"array\">\n" +
    "    <activity>\n" +
    "        <id type=\"integer\">31457152</id>\n" +
    "        <version type=\"integer\">4887</version>\n" +
    "        <event_type>note_create</event_type>\n" +
    "        <occurred_at type=\"datetime\">2010/10/14 20:08:41 UTC</occurred_at>\n" +
    "        <author>Patrick</author>\n" +
    "        <project_id type=\"integer\">123</project_id>\n" +
    "        <description>I changed the 'request' for squidward. &quot;Add 'Buyout'&quot;</description>\n" +
    "        <stories>\n" +
    "            <story>\n" +
    "                <id type=\"integer\">4270226</id>\n" +
    "                <url>http://www.pivotaltracker.com/services/v3/projects/123/stories/4270226</url>\n" +
    "                <notes>\n" +
    "                    <note>\n" +
    "                        <id type=\"integer\">2719505</id>\n" +
    "                        <text>I changed the 'request' for squidward. </text>\n" +
    "                    </note>\n" +
    "                </notes>\n" +
    "            </story>\n" +
    "        </stories>\n" +
    "    </activity>\n" +
    "    <activity>\n" +
    "        <id type=\"integer\">31457156</id>\n" +
    "        <version type=\"integer\">4888</version>\n" +
    "        <event_type>story_update</event_type>\n" +
    "        <occurred_at type=\"datetime\">2010/10/14 20:08:41 UTC</occurred_at>\n" +
    "        <author>Spongebob Squarepants</author>\n" +
    "        <project_id type=\"integer\">123</project_id>\n" +
    "        <description>Spongebob Square edited &quot;Application tracks listing clicks&quot;</description>\n" +
    "        <stories>\n" +
    "            <story>\n" +
    "                <id type=\"integer\">4270226</id>\n" +
    "                <url>http://www.pivotaltracker.com/services/v3/projects/123/stories/4270226</url>\n" +
    "                <description>fire req to analytics server addr</description>\n" +
    "            </story>\n" +
    "        </stories>\n" +
    "    </activity>\n" +
    "</activities>";

    public static final String AUTH_SUCCESS = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<token>\n" +
            "  <guid>c93f12c</guid>\n" +
            "  <id type=\"integer\">1</id>\n" +
            "</token>";

    public static final String LATEST_TWEET = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<feed xmlns:google=\"http://base.google.com/ns/1.0\" xml:lang=\"en-US\" xmlns:openSearch=\"http://a9.com/-/spec/opensearch/1.1/\" xmlns=\"http://www.w3.org/2005/Atom\" xmlns:twitter=\"http://api.twitter.com/\">\n" +
            "  <id>tag:search.twitter.com,2005:search/robolectric</id>\n" +
            "  <link type=\"text/html\" href=\"http://search.twitter.com/search?q=robolectric\" rel=\"alternate\"/>\n" +
            "  <link type=\"application/atom+xml\" href=\"http://search.twitter.com/search.atom?q=robolectric&amp;rpp=1\" rel=\"self\"/>\n" +
            "  <title>robolectric - Twitter Search</title>\n" +
            "  <link type=\"application/opensearchdescription+xml\" href=\"http://search.twitter.com/opensearch.xml\" rel=\"search\"/>\n" +
            "  <link type=\"application/atom+xml\" href=\"http://search.twitter.com/search.atom?q=robolectric&amp;rpp=1&amp;since_id=48745468523585536\" rel=\"refresh\"/>\n" +
            "  <twitter:warning>since_id removed for pagination.</twitter:warning>\n" +
            "  <updated>2011-03-18T05:17:56Z</updated>\n" +
            "  <openSearch:itemsPerPage>1</openSearch:itemsPerPage>\n" +
            "  <link type=\"application/atom+xml\" href=\"http://search.twitter.com/search.atom?max_id=48745468523585536&amp;page=2&amp;q=robolectric&amp;rpp=1\" rel=\"next\"/>\n" +
            "  <entry>\n" +
            "    <id>tag:search.twitter.com,2005:48614087202054144</id>\n" +
            "    <published>2011-03-18T05:17:56Z</published>\n" +
            "    <link type=\"text/html\" href=\"http://twitter.com/ahsteele/statuses/48614087202054144\" rel=\"alternate\"/>\n" +
            "    <title>Robolectric is Great!</title>\n" +
            "    <content type=\"html\">Guinness &amp;amp; code, not a bad way to spend St. Patrick&amp;apos;s Day. Configured &lt;b&gt;Robolectric&lt;/b&gt; &amp;amp; Roboguice for use with geocamMemoAndroid. &lt;a href=&quot;http://search.twitter.com/search?q=%23tdd&quot; onclick=&quot;pageTracker._setCustomVar(2, 'result_type', 'recent', 3);pageTracker._trackPageview('/intra/hashtag/#tdd');&quot;&gt;#tdd&lt;/a&gt; &lt;a href=&quot;http://search.twitter.com/search?q=%23geocamsu&quot; onclick=&quot;pageTracker._setCustomVar(2, 'result_type', 'recent', 3);pageTracker._trackPageview('/intra/hashtag/#geocamsu');&quot;&gt;#geocamsu&lt;/a&gt;</content>\n" +
            "    <updated>2011-03-18T05:17:56Z</updated>\n" +
            "    <link type=\"image/png\" href=\"http://a3.twimg.com/profile_images/181235286/profilePic_normal.jpeg\" rel=\"image\"/>\n" +
            "    <twitter:geo>\n" +
            "    </twitter:geo>\n" +
            "    <twitter:metadata>\n" +
            "      <twitter:result_type>recent</twitter:result_type>\n" +
            "    </twitter:metadata>\n" +
            "    <twitter:source>&lt;a href=&quot;http://twitter.com/&quot;&gt;web&lt;/a&gt;</twitter:source>\n" +
            "    <twitter:lang>en</twitter:lang>\n" +
            "    <author>\n" +
            "      <name>ahsteele (Andrew Steele)</name>\n" +
            "      <uri>http://twitter.com/ahsteele</uri>\n" +
            "    </author>\n" +
            "  </entry>\n" +
            "</feed>";
}
