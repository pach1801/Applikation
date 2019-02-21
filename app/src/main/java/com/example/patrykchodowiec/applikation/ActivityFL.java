package com.example.patrykchodowiec.applikation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityFL extends AppCompatActivity {
    private Button buttonCore;
    private Button buttonUpper;
    private Button buttonLower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fl);

        buttonCore = findViewById(R.id.buttonCore);
        buttonCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityCORE();
            }
        });

        buttonLower = findViewById(R.id.buttonLower);
        buttonLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLOWER();
            }
        });

        buttonUpper = findViewById(R.id.buttonUpper);
        buttonUpper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityUPPER();
            }
        });
    }

    private void openActivityUPPER() {
        Intent intent1 = new Intent(this, ActivityUPPER.class);
        startActivity(intent1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityLOWER() {
        Intent intent2 = new Intent(this, ActivityLOWER.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityCORE() {
        Intent intent3 = new Intent(this, ActivityCORE.class);
        startActivity(intent3);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
