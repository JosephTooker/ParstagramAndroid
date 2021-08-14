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
                .applicationId("joqjvNyaf9zQzBinLTIiB8lZHuKVe6EUukWUBd0p")
                .clientKey("Ezp5E1J2nfiIDyyhGGUDMrfN2ZuSGKaHKiiw88Dc")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
