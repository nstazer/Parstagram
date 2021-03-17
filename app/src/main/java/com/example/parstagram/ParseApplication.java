package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("shPsJ29w3BRXkMbRcDAs6CvXkS1Aw8H2XbOB14Nw")
                .clientKey("WCb20Z3wyTN2ReKxXg4xuLr88FNBZLsjRDU48hip")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
