package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityD3 extends AppCompatActivity {
    private static final String TAG = "ActivityD3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d3);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise DBench = new Excercise("Dumbbell Bench Press", "3", "12");
        Excercise Row = new Excercise("Bent-over Barbell Row", "3", "10");
        Excercise Press = new Excercise("Standing Barbell Press", "3", "12");
        Excercise Squat = new Excercise("Front Squat", "3", "10");
        Excercise Lunge = new Excercise("Lunges w/ Dumbbell", "4", "12");
        Excercise Seat = new Excercise(" Seated Calf Raise", "3", "10");
        Excercise Crunch = new Excercise("Bicycle Crunch", "3", "20");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(DBench);
        workoutList.add(Row);
        workoutList.add(Press);
        workoutList.add(Squat);
        workoutList.add(Lunge);
        workoutList.add(Seat);
        workoutList.add(Crunch);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);
    }
}
