package com.pivotallabs;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.pivotallabs.injected.InjectedActivity;
import com.pivotallabs.tracker.RecentActivityActivity;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import com.xtremelabs.robolectric.shadows.ShadowActivity;
import com.xtremelabs.robolectric.shadows.ShadowIntent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.xtremelabs.robolectric.Robolectric.clickOn;
import static com.xtremelabs.robolectric.Robolectric.shadowOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {
    private HomeActivity homeActivity;
    private Button pressMeButton;
    private Button trackerRecentActivityButton;
    private Button injectedActivityButton;
    private ImageView pivotalLogo;
    private Button aboutUsButton;

    @Before
    public void setUp() throws Exception {
        homeActivity = new HomeActivity();
        homeActivity.onCreate(null);
        pressMeButton = (Button) homeActivity.findViewById(R.id.press_me_button);
        trackerRecentActivityButton = (Button) homeActivity.findViewById(R.id.tracker_recent_activity);
        injectedActivityButton = (Button) homeActivity.findViewById(R.id.injected_activity_button);
        pivotalLogo = (ImageView) homeActivity.findViewById(R.id.pivotal_logo);
        aboutUsButton = (Button) homeActivity.findViewById(R.id.about_us_button);
    }

    @Test
    public void shouldHaveAButtonThatSaysAboutUs() throws Exception {
        assertThat(((String) aboutUsButton.getText()), equalTo("About Us"));
    }


    @Test
    public void pressingTheButtonShouldStartTheAboutUsActivity() throws Exception {
        aboutUsButton.performClick();

        Intent aboutUsActivity = shadowOf(homeActivity).getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(aboutUsActivity);
        assertThat(shadowIntent.getComponent().getClassName(), equalTo(AboutUsActivity.class.getName()));
    }

    @Test
    public void shouldHaveAButtonThatSaysPressMe() throws Exception {
        assertThat((String) pressMeButton.getText(), equalTo("Tests Rock!"));
    }

    @Test
    public void pressingTheButtonShouldStartTheListActivity() throws Exception {
        pressMeButton.performClick();

        ShadowActivity shadowActivity = shadowOf(homeActivity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(startedIntent);
        assertThat(shadowIntent.getComponent().getClassName(), equalTo(NamesActivity.class.getName()));
    }

    @Test
    public void pressingTheButtonShouldStartTheSignInActivity() throws Exception {
        trackerRecentActivityButton.performClick();

        ShadowActivity shadowActivity = shadowOf(homeActivity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(startedIntent);

        assertThat(shadowIntent.getComponent().getClassName(), equalTo(RecentActivityActivity.class.getName()));
    }

    @Test
    public void shouldHaveALogo() throws Exception {
        assertThat(pivotalLogo.getVisibility(), equalTo(View.VISIBLE));
        assertThat(shadowOf(pivotalLogo).getResourceId(), equalTo(R.drawable.pivotallabs_logo));
    }

    @Test
    public void shouldLaunchInjectedActivity() throws Exception {
        clickOn(injectedActivityButton);

        ShadowActivity shadowActivity = shadowOf(homeActivity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        assertNotNull(startedIntent);
        ShadowIntent shadowIntent = shadowOf(startedIntent);
        assertThat(shadowIntent.getComponent().getClassName(), equalTo(InjectedActivity.class.getName()));
    }
}
