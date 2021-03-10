package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WyP4FUUcM4cMWhEuBGm30ltSfxzEuitZVdeyIoLW")
                .clientKey("G06K0yvuBmGLHDbOA9TsKj7GgBJrrlGgZGUeRZHF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
