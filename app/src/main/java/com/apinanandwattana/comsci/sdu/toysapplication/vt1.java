package com.apinanandwattana.comsci.sdu.toysapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class vt1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt1);

        //VideoView videoView = findViewById(R.id.videoView);
        //String videoPath = "android.resource;//" + getPackageName() +"/"+ R.raw.cat;
       // Uri uri = Uri.parse(videoPath);
       // videoView.setVideoURI(uri);

       // MediaController mediaController = new MediaController(this);
       // videoView.setMediaController(mediaController);
       // mediaController.setAnchorView(videoView);

        VideoView myVideoV = (VideoView)findViewById(R.id.videoView);
        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.cat));
        myVideoV.setMediaController(new MediaController(this));
        myVideoV.requestFocus();
        myVideoV.start();


    }
}
