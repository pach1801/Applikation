package com.example.patrykchodowiec.applikation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityPPL extends AppCompatActivity {

    private Button buttonPULL;
    private Button buttonLEG;
    private Button buttonP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppl);

        buttonP = findViewById(R.id.buttonP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAPUSH();
            }
        });




        buttonPULL = findViewById(R.id.buttonPULL);
        buttonPULL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPULL();

            }
        });

        buttonLEG = findViewById(R.id.buttonLEG);
        buttonLEG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLEG();

            }
        });
    }

    private void openAPUSH() {
        Intent intent1 = new Intent(this, APUSH.class);
        startActivity(intent1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }




    private void openActivityPULL() {
        Intent intent2 = new Intent(this, ActivityPULL.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityLEG() {
        Intent intent3 = new Intent(this, ActivityLEG.class);
        startActivity(intent3);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


}
