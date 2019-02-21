package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityUPPER extends AppCompatActivity {

    private static final String TAG = "ActivityUPPER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise Dumbbellpress = new Excercise("Dumbbell Bench Press", " S:4", "R:8");
        Excercise Dumbbellrow = new Excercise("Dumbbell Row", "S:4", "R:8");
        Excercise Overhead = new Excercise("Overhead", "S:4", "R:10");
        Excercise ChinUp = new Excercise("Chin Up", "S:3", "12-15");
        Excercise CableCurl = new Excercise("Cable Curl", "S:2", "12");
        Excercise CablePress = new Excercise("Cable Pressdown", "S:2", "12");
        Excercise Pushups = new Excercise("Pushups", "S:3", "15");
        Excercise InclineBP = new Excercise("Incline Bench Press", "S:4", "8");
        Excercise Pulldowns = new Excercise("Lat Pull Down", "S:3", "R:8");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(Dumbbellpress);
        workoutList.add(Dumbbellrow);
        workoutList.add(Overhead);
        workoutList.add(ChinUp);
        workoutList.add(CableCurl);
        workoutList.add(CablePress);
        workoutList.add(Pushups);
        workoutList.add(InclineBP);
        workoutList.add(Pulldowns);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);

    }
}
