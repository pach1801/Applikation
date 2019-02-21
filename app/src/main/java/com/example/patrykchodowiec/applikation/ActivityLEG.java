package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityLEG extends AppCompatActivity {

    private static final String TAG = "ActivityLEG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise LegPress = new Excercise("Leg Press (Warmup)", "4", "8");
        Excercise Squat = new Excercise("Squat", "5", "10");
        Excercise Calf = new Excercise("Calf Raises", "3", "10");
        Excercise Hamstring = new Excercise("Hamstring Curls", "4", "12");
        Excercise LegCurls = new Excercise("Leg Curls", "4", "12");
        Excercise Lunges = new Excercise("Dumbbell Lunges", "4", "15");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(LegPress);
        workoutList.add(Squat);
        workoutList.add(Calf);
        workoutList.add(Hamstring);
        workoutList.add(LegCurls);
        workoutList.add(Lunges);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);

    }
}
