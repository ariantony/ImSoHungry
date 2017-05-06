package com.example.klola.imsohungry;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button intentBtn = (Button) findViewById(R.id.btnIntent);
        intentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test","haloooooowwww");
                Intent i= new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("Value1", "Contoh data 1");
                i.putExtra("var1", "var1Oke");
                startActivity(i);
            }
        });
     Button intentUrlBtn = (Button) findViewById(R.id.intentUrlBtn);
        intentUrlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.google.com";
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
