package com.example.patrykchodowiec.applikation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {
    private Button button;
    private Button buttonFL;
    private Button buttonFB;
    private Button buttonBeg;
    private Button buttonAH;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Intent intent0 = new Intent(ActivityTwo.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.timer:
                        Intent intent1 = new Intent(ActivityTwo.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.workout:
                        break;

                    case R.id.profile:
                        Intent intent3 = new Intent(ActivityTwo.this, ActivityThree.class);
                        startActivity(intent3);
                        break;

                    case R.id.settings:
                        Intent intent4 = new Intent(ActivityTwo.this, ActivityFour.class);
                        startActivity(intent4);
                        break;

                }

                return false;


            }
        });

        buttonFL = findViewById(R.id.buttonFL);
        buttonFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityFL();
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMB();
            }
        });

        buttonFB = findViewById(R.id.buttonFB);
        buttonFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityFB();
            }
        });

        buttonBeg = findViewById(R.id.buttonBeg);
        buttonBeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBEGINNER();
            }
        });

        buttonAH = findViewById(R.id.buttonAH);
        buttonAH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAH();
            }
        });
    }

    private void openActivityAH() {
        Intent intent5 = new Intent(this, ActivityAH.class);
        startActivity(intent5);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityBEGINNER() {
        Intent intent4 = new Intent(this, ActivityBEGINNER.class);
        startActivity(intent4);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityFB() {
        Intent intent3 = new Intent(this, ActivityFB.class);
        startActivity(intent3);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openActivityFL() {
        Intent intent2 = new Intent(this, ActivityFL.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openActivityMB(){
        Intent intent = new Intent(this, ActivityMB.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
