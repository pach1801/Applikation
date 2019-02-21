package com.example.patrykchodowiec.applikation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityAH extends AppCompatActivity {

    private Button buttonTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ah);

        buttonTP = findViewById(R.id.buttonTP);
        buttonTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityTP();
            }
        });


    }

    private void openActivityTP() {
        Intent intent1 = new Intent(this, ActivityTP.class);
        startActivity(intent1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
