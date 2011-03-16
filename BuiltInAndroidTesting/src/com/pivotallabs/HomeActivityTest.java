package com.pivotallabs;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.Button;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.pivotallabs.HomeActivityTest \
 * com.pivotallabs.tests/android.test.InstrumentationTestRunner
 */
public class HomeActivityTest extends ActivityInstrumentationTestCase2<HomeActivity> {

    private HomeActivity homeActivity;

    public HomeActivityTest() {
        super("com.pivotallabs", HomeActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        homeActivity = getActivity();
    }

    public void testAboutUsButton() {
        Button button = (Button) (homeActivity.findViewById(R.id.about_us_button));
        assertEquals(homeActivity.getString(R.string.about_us), button.getText());
    }

//    public void testPressingTheButtonShouldStartTheAboutUsActivity() throws Throwable {
//        final Button aboutUsButton = (Button) (homeActivity.findViewById(R.id.about_us_button));
//
//        runTestOnUiThread(new Runnable() {
//            public void run() {
//                aboutUsButton.performClick();
//                assertEquals("monkey", homeActivity.getIntent().getAction());
//            }
//        });


//        Intent aboutUsActivity = shadowOf(homeActivity).getNextStartedActivity();
//        ShadowIntent shadowIntent = shadowOf(aboutUsActivity);
//        assertThat(shadowIntent.getComponent().getClassName(), equalTo(AboutUsActivity.class.getName()));
//    }


}
