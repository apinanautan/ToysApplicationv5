package com.apinanandwattana.comsci.sdu.toysapplication;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;

;

public class MainActivity extends AppCompatActivity {


    Button btn2,btn3;
    MediaPlayer mediaPlayer;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);




    }//end




    public void clickgoAboutme (View view) {
        Intent historyIntent = new Intent(MainActivity.this,AboutMe.class);
        startActivity(historyIntent);
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cilck);
        mediaPlayer.start();

    }

    public  void clicklistToy (View view) {
        Intent MeatIntent = new Intent(MainActivity.this, listviewToy.class);
        startActivity(MeatIntent);
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cilck);
        mediaPlayer.start();

    }

    public  void clickdatadekActivity (View view) {
        Intent MeatIntent = new Intent(MainActivity.this, datadekActivity.class);
        startActivity(MeatIntent);
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cilck);
        mediaPlayer.start();

    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }





























}
