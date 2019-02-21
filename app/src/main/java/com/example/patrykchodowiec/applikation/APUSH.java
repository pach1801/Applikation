package com.example.patrykchodowiec.applikation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class APUSH extends AppCompatActivity {

    private static final String TAG = "APUSH";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apush);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview1);

        Excercise Bench = new Excercise("Bench Press", "4", "12");
        Excercise Dumbbell = new Excercise("Incl. Dumbbell Press", "4", "12");
        Excercise Military = new Excercise("Military Press", "4", "12");
        Excercise ArnoldPress = new Excercise("Arnold Press", "4", "8");
        Excercise Flyes = new Excercise("Shoulder Flyes", "4", "12");
        Excercise Pullover = new Excercise("Dumbbell Pullover", "4", "12");
        Excercise Skullcrushers = new Excercise("Skullcrushers", "4", "10");
        Excercise TricepExt = new Excercise("Tricep Extension", "4", "12");
        Excercise Cable = new Excercise("Cable Flyes", "4", "12");

        ArrayList<Excercise> workoutList = new ArrayList<>();
        workoutList.add(Bench);
        workoutList.add(Dumbbell);
        workoutList.add(Military);
        workoutList.add(ArnoldPress);
        workoutList.add(Flyes);
        workoutList.add(Pullover);
        workoutList.add(Skullcrushers);
        workoutList.add(TricepExt);
        workoutList.add(Cable);

        WorkoutListAdapter adapter = new WorkoutListAdapter(this, R.layout.adapter_view_layout, workoutList);
        mListView.setAdapter(adapter);




    }
}
