package com.apinanandwattana.comsci.sdu.toysapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    public void clickFacebook(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/apinan.autan"));
        startActivity(fbIntent);
    }

    public void clickFacebook2(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/wattana.taoha"));
        startActivity(fbIntent);

    }

    public void clickBack(View view) {
        finish();
    }

}
