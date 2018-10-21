package com.apinanandwattana.comsci.sdu.toysapplication;

import android.app.Application;

import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;


public class font extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ViewPump.init(ViewPump.builder()
         .addInterceptor(new CalligraphyInterceptor(
                 new CalligraphyConfig.Builder()
                         .setDefaultFontPath("font/Lamoon.ttf")
                         .setFontAttrId(R.attr.fontPath)
                         .build()))
                .build());
        //....
    }

}
