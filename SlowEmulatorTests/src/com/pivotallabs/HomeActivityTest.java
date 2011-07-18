package com.pivotallabs;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import java.lang.Exception;

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


    public void testSlowButNotNull_1() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_2() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_3() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_4() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_5() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_6() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_7() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_8() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_9() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_10() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_11() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_12() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_13() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_14() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_15() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_16() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_17() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull18() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_19() throws Exception {
        assertNotNull(homeActivity);
    }

    public void testSlowButNotNull_20() throws Exception {
        assertNotNull(homeActivity);
    }
}
