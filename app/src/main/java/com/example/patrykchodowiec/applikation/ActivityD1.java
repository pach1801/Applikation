package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityD1 extends AppCompatActivity {
    private static final String TAG = "ActivityD1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise BenchWU = new Excercise("Barbell Bench Press Warm Up", "1", "12");
        Excercise Bench = new Excercise("Barbell Bench Press", "3", "10");
        Excercise Pullups = new Excercise("Pullups", "3", "'till failure");
        Excercise Squat = new Excercise("Squat", "3", "10");
        Excercise LegCurls = new Excercise("Leg Curls", "4", "12");
        Excercise Shoulderpress = new Excercise(" Standing Dumbbell Shoulder Press", "3", "10");
        Excercise Crunch = new Excercise("Crunch", "3", "20");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(BenchWU);
        workoutList.add(Bench);
        workoutList.add(Pullups);
        workoutList.add(Squat);
        workoutList.add(LegCurls);
        workoutList.add(Shoulderpress);
        workoutList.add(Crunch);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);

    }
}
