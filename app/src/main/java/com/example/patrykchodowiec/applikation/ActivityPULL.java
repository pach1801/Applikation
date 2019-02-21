package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityPULL extends AppCompatActivity {

    private static final String TAG = "ActivityPULL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise Pullups = new Excercise("Pullups", "4", "8");
        Excercise Deadlift = new Excercise("Deadlift", "4", "10");
        Excercise BarbellRow = new Excercise("Barbell Row", "4", "12");
        Excercise PullDown = new Excercise("Lateral Pulldown", "4", "12");
        Excercise Pushdown = new Excercise("Standing Lat Pushdown", "4", "12");
        Excercise DumbbellRows = new Excercise("Dumbbell Rows", "4", "12");
        Excercise Facepulls = new Excercise("Facepulls", "4", "15");
        Excercise Rotator = new Excercise("Rotator Cuffs", "4", "15");
        Excercise Hammer = new Excercise("Hammer Curls", "4", "12");
        Excercise BiCurls = new Excercise("Bicep Curls", "4", "12");
        Excercise CableCurls = new Excercise("Cable Curls", "4", "12");
        Excercise Preacher = new Excercise("Preacher Curls", "4", "12");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(Pullups);
        workoutList.add(Deadlift);
        workoutList.add(BarbellRow);
        workoutList.add(PullDown);
        workoutList.add(Pushdown);
        workoutList.add(DumbbellRows);
        workoutList.add(Facepulls);
        workoutList.add(Rotator);
        workoutList.add(Hammer);
        workoutList.add(BiCurls);
        workoutList.add(CableCurls);
        workoutList.add(Preacher);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);
    }
}
