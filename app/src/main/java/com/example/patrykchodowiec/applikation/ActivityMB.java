package com.example.patrykchodowiec.applikation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityMB extends AppCompatActivity {
    private Button buttonPPL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mb);

        buttonPPL = findViewById(R.id.buttonPPL);
        buttonPPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPPL();
            }
        });
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void openActivityPPL() {
        Intent intent = new Intent(this, ActivityPPL.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
