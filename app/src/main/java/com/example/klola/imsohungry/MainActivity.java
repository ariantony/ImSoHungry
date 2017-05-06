package com.example.klola.imsohungry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie (View view) {
        ImageView beforeCookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        beforeCookie.setImageResource(R.drawable.cookie);
        beforeCookie.set

        TextView status = (TextView) findViewById(R.id.test);
        status.setText("I am soooo full...");
    }
}
