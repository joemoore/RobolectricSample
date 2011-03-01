package com.pivotallabs;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import com.xtremelabs.robolectric.shadows.ShadowIntent;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.xtremelabs.robolectric.Robolectric.shadowOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


@RunWith(RobolectricTestRunner.class)
public class AboutUsActivityTest {
    private AboutUsActivity aboutUsActivity;

    @Before public void setUp() throws Exception {
        aboutUsActivity = new AboutUsActivity();
        aboutUsActivity.onCreate(null);
    }

    @Test
    public void shouldHaveAboutUsText() throws Exception {
        TextView textView = (TextView) aboutUsActivity.findViewById(R.id.about_us_text);
        assertThat(textView.getText().toString(),
                   equalTo(aboutUsActivity.getResources().getString(R.string.about_us_text)));
    }

    @Test
    public void shouldHaveLearnMoreButton() throws Exception{
        Button learnMoreButton = (Button) aboutUsActivity.findViewById(R.id.learn_more_button);
        learnMoreButton.performClick();

        Intent webViewActivity = shadowOf(aboutUsActivity).getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(webViewActivity);
        assertThat(shadowIntent.getAction(), CoreMatchers.equalTo(Intent.ACTION_VIEW));
        assertThat(shadowIntent.getData().toString(), CoreMatchers.equalTo("http://pivotal.github.com/robolectric/"));
    }
}
