package com.example.patrykchodowiec.applikation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityBEGINNER extends AppCompatActivity {
    private Button buttonD1;
    private Button buttonD2;
    private Button buttonD3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        buttonD1 = findViewById(R.id.buttonD1);
        buttonD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityD1();
            }
        });

        buttonD2 = findViewById(R.id.buttonD2);
        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityD2();
            }
        });

        buttonD3 = findViewById(R.id.buttonD3);
        buttonD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityD3();
            }
        });
    }

    private void openActivityD3() {
        Intent intent3 = new Intent(this, ActivityD3.class);
        startActivity(intent3);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityD2() {

        Intent intent2 = new Intent(this, ActivityD2.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    private void openActivityD1() {
        Intent intent1 = new Intent(this, ActivityD1.class);
        startActivity(intent1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }
}
