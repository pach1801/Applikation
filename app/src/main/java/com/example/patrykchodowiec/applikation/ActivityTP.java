package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityTP extends AppCompatActivity {

    private static final String TAG = "ActivityTP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise Lunges = new Excercise("Walking Dumbbell Lunges", "3", "10");
        Excercise Weighted = new Excercise("Weighted Burpees", "3", "10");
        Excercise Rows = new Excercise("Bent-over Dumbell Rows", "3", "10");
        Excercise Pushups = new Excercise("Pushups", "3", "12");
        Excercise Burpees = new Excercise("Burpees", "4", "12");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(Lunges);
        workoutList.add(Weighted);
        workoutList.add(Rows);
        workoutList.add(Pushups);
        workoutList.add(Burpees);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);
    }
}
