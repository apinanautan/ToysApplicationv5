package com.apinanandwattana.comsci.sdu.toysapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class datadekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadek);
    }

    public void databn1(View view) {
        Intent intent = new Intent(datadekActivity.this, datadek2.class);
        startActivity(intent);
    }
    public void databn2(View view) {
        Intent intent = new Intent(datadekActivity.this, datadek02.class);
        startActivity(intent);
    }

    public void databn3(View view) {
        Intent intent = new Intent(datadekActivity.this, datadek03.class);
        startActivity(intent);
    }
    public void databn4(View view) {
        Intent intent = new Intent(datadekActivity.this, datadek04.class);
        startActivity(intent);
    }
    public void databn5(View view) {
        Intent intent = new Intent(datadekActivity.this, datadek05.class);
        startActivity(intent);
    }
    public void databn6(View view) {
        Intent intent = new Intent(datadekActivity.this, datadek6.class);
        startActivity(intent);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    public void clickBack(View view) {
        finish();
    }
}
