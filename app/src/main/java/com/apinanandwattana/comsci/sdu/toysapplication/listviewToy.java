package com.apinanandwattana.comsci.sdu.toysapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class listviewToy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_toy);
    }

    public void imv1(View view) {
        Intent intent = new Intent(listviewToy.this, vt1.class);
        startActivity(intent);
    }

    public void clickBack(View view) {
        finish();
    }

}
