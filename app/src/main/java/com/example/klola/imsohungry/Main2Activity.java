package com.example.klola.imsohungry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnKembali = (Button) findViewById(R.id.kembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        Intent intent = getIntent();
        Log.d("test", intent.getStringExtra("Value1"));
        Log.d("wusssss", intent.getStringExtra("var1"));


    }
}
