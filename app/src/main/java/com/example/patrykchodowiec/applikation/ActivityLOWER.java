package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityLOWER extends AppCompatActivity {

    private static final String TAG = "ActivityLOWER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise Trapbar = new Excercise("Trapbar Deadlift", " S:4", "R:12,10,8,6");
        Excercise Romanian = new Excercise("Romanian Deadlift", "S:4", "R:8-10");
        Excercise Lateral = new Excercise("Lateral Lunges", "S:3", "R:15");
        Excercise NarrowLP = new Excercise("Narrow Leg Press", "S:3", "R:12");
        Excercise WideLP = new Excercise("Wide Leg Press", "S:3", "R:12");
        Excercise SeatedCalf = new Excercise("Seated Calf Raise", "S:3", "R:15");
        Excercise JumpRope = new Excercise("Jump Rope", "S:3", "3min");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(Trapbar);
        workoutList.add(Romanian);
        workoutList.add(Lateral);
        workoutList.add(NarrowLP);
        workoutList.add(WideLP);
        workoutList.add(SeatedCalf);
        workoutList.add(JumpRope);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);
    }
}
