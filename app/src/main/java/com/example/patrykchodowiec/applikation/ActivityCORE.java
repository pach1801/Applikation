package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityCORE extends AppCompatActivity {

    private static final String TAG = "ActivityCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise AbCrunch = new Excercise("Ab Crunch", " S:3", "R:20");
        Excercise BicycleCrunch = new Excercise("Bicycle Crunch", "S:3", "R:20");
        Excercise LegRaise = new Excercise("Leg Raise", "S:3", "R:10");
        Excercise Oblique = new Excercise("Oblique Crunch", "S:3", "R:15 each side");
        Excercise Plank = new Excercise("Plank", "S:3", "30sec");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(AbCrunch);
        workoutList.add(BicycleCrunch);
        workoutList.add(LegRaise);
        workoutList.add(Oblique);
        workoutList.add(Plank);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);

    }
}
