package com.example.ALC4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aboutalc = (Button) findViewById(R.id.btn_aboutalc);
        Button myprofile = (Button) findViewById(R.id.btn_myprofile);
        aboutalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaboutalc();
            }
        });

        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmyprofile();
            }
        });


    }

    private void openaboutalc() {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

    private void openmyprofile() {
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }
}
