package com.apinanandwattana.comsci.sdu.toysapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;

;

public class MainActivity extends AppCompatActivity {


    Button btn2,btn3;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        //imb8 = findViewById(R.id.imb8);
        //imb9 = findViewById(R.id.imb9);



    }//end
    public void clickgoAboutme (View view) {
        Intent historyIntent = new Intent(MainActivity.this,AboutMe.class);
        startActivity(historyIntent);
    }//end
    public  void clicklistToy (View view) {
        Intent MeatIntent = new Intent(MainActivity.this, listviewToy.class);
        startActivity(MeatIntent);
    }

    public  void clickdatadekActivity (View view) {
        Intent MeatIntent = new Intent(MainActivity.this, datadekActivity.class);
        startActivity(MeatIntent);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }



























}
