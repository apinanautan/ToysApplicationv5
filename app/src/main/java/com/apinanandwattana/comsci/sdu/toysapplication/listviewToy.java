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

    public void imv2(View view) {
        Intent intent = new Intent(listviewToy.this, vt2Activity.class);
        startActivity(intent);
    }

    public void imv3(View view) {
        Intent intent = new Intent(listviewToy.this, vt3.class);
        startActivity(intent);
    }

    public void imv4(View view) {
        Intent intent = new Intent(listviewToy.this, Vt4.class);
        startActivity(intent);
    }

    public void imv5(View view) {
        Intent intent = new Intent(listviewToy.this, vt5.class);
        startActivity(intent);
    }

    public void imv6(View view) {
        Intent intent = new Intent(listviewToy.this, vt6.class);
        startActivity(intent);
    }

    public void imv7(View view) {
        Intent intent = new Intent(listviewToy.this, vt7.class);
        startActivity(intent);
    }

    public void imv8(View view) {
        Intent intent = new Intent(listviewToy.this, vt8.class);
        startActivity(intent);
    }

    public void imv9(View view) {
        Intent intent = new Intent(listviewToy.this, vt9.class);
        startActivity(intent);
    }
    public void imv10(View view) {
        Intent intent = new Intent(listviewToy.this, vt10.class);
        startActivity(intent);
    }
    public void imv11(View view) {
        Intent intent = new Intent(listviewToy.this, vt11.class);
        startActivity(intent);
    }
    public void imv12(View view) {
        Intent intent = new Intent(listviewToy.this, vt12.class);
        startActivity(intent);
    }
    public void imv13(View view) {
        Intent intent = new Intent(listviewToy.this, vt13.class);
        startActivity(intent);
    }
    public void imv14(View view) {
        Intent intent = new Intent(listviewToy.this, vt14.class);
        startActivity(intent);
    }
    public void imv15(View view) {
        Intent intent = new Intent(listviewToy.this, vt15.class);
        startActivity(intent);
    }
    public void clickBack(View view) {
        finish();
    }

}
