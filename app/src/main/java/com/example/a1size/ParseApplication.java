package com.example.a1size;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the Heroku fragment_settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("size01") // should correspond to APP_ID env variable
                .clientKey("CodepathSize01")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://size01.herokuapp.com/parse").build());
    }
}
