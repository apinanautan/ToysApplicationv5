package com.apinanandwattana.comsci.sdu.toysapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    public void clickAboutme (View view) {
        Intent historyIntent = new Intent(MainActivity.this,AboutMe.class);
        startActivity(historyIntent);
    }//end
    public  void cliclistToy (View view){
        Intent MeatIntent = new Intent(MainActivity.this, listviewToy.class);
        startActivity(MeatIntent);





        //Button next = (Button)findViewById(R.id.btn2);
        //next.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
               // Intent i =new Intent(MainActivity.this,listviewToy.class);
               // startActivity(i);


            //}











    }



}
