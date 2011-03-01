package com.pivotallabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class AboutUsActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.about_us_layout);

        ((Button) findViewById(R.id.learn_more_button)).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Uri uri = Uri.parse("http://pivotal.github.com/robolectric/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
