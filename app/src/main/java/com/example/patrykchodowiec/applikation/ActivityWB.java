package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityWB extends AppCompatActivity {

    private static final String TAG = "ActivityWB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wb);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise LateralRaise = new Excercise("Lateral Raise", " S:3", "R:12");
        Excercise ArnoldPress = new Excercise("Arnold Press", " S:3", "R:12");
        Excercise NeutralPulldown = new Excercise("Neutral Pull Down", " S:3", "R:12");
        Excercise TBarRow = new Excercise("T-Bar Row", " S:3", "R:12");
        Excercise InclinePress = new Excercise("Incline Dumbbell Press", " S:3", "R:12");
        Excercise CableCrossover = new Excercise("Cable Crossover", " S:3", "R:12");
        Excercise BarbellCurl = new Excercise("Barbell Curl", " S:3", "R:12");
        Excercise HammerCurl = new Excercise("Hammer Curl", " S:3", "R:12");
        Excercise TwoArm = new Excercise("Two Arm Overhead Extension", " S:3", "R:12");
        Excercise RopePushdown = new Excercise("Rope Push Down", " S:3", "R:12");
        Excercise Crunches = new Excercise("Crunches", " S:3", "R:12");
        Excercise Hyperextensions = new Excercise("Hyperextensions", " S:3", "R:12");
        Excercise LegPress = new Excercise("Leg Press", " S:3", "R:12");
        Excercise LegExtension = new Excercise("Leg Extension", " S:3", "R:12");
        Excercise Stiffdeadlift = new Excercise("Stiff Legged Deadlift", " S:3", "R:12");
        Excercise LegCurl = new Excercise("Leg Curl", " S:3", "R:12");
        Excercise StandingCR = new Excercise("Standing Calf Raise", " S:3", "R:12");
        Excercise SeatedCR = new Excercise("Seated Calf Raise", " S:3", "R:12");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(LateralRaise);
        workoutList.add(ArnoldPress);
        workoutList.add(NeutralPulldown);
        workoutList.add(TBarRow);
        workoutList.add(InclinePress);
        workoutList.add(CableCrossover);
        workoutList.add(BarbellCurl);
        workoutList.add(HammerCurl);
        workoutList.add(TwoArm);
        workoutList.add(RopePushdown);
        workoutList.add(Crunches);
        workoutList.add(Hyperextensions);
        workoutList.add(LegPress);
        workoutList.add(LegExtension);
        workoutList.add(Stiffdeadlift);
        workoutList.add(LegCurl);
        workoutList.add(StandingCR);
        workoutList.add(SeatedCR);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);
    }
}
