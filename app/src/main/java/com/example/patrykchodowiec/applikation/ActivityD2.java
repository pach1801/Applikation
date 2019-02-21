package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityD2 extends AppCompatActivity {
    private static final String TAG = "ActivityD2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise IncBench = new Excercise("Incline Bench Press", "3", "10");
        Excercise Deadlift = new Excercise("Deadlift", "3", "'10");
        Excercise Dips = new Excercise("Dips", "3", "10");
        Excercise Curl = new Excercise("Barbell Curls", "4", "12");
        Excercise Shoulderpress = new Excercise(" Standing Dumbbell Shoulder Press", "3", "10");
        Excercise Romanian = new Excercise("Romanian Deadlift", "3", "10");
        Excercise Calfraise = new Excercise("Standing Calf Raise", "3", "10");
        Excercise LegLift = new Excercise("Leg Lift", "3", "20");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(IncBench);
        workoutList.add(Deadlift);
        workoutList.add(Dips);
        workoutList.add(Curl);
        workoutList.add(Shoulderpress);
        workoutList.add(Romanian);
        workoutList.add(Calfraise);
        workoutList.add(LegLift);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);


    }
}
