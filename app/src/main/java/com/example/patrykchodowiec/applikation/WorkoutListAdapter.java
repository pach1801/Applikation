package com.example.patrykchodowiec.applikation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WorkoutListAdapter extends ArrayAdapter<Excercise> {

    private static final String TAG = "WorkoutListAdapter";
    private Context mContext;
    int mResource;

    /**
     * @param context
     * @param resource
     * @param objects
     */

    public WorkoutListAdapter(Context context, int resource, ArrayList<Excercise> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the information
        String name = getItem(position).getName();
        String set = getItem(position).getSet();
        String rep = getItem(position).getRep();

        //create object with info

        Excercise excercise = new Excercise(name,set,rep);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvSet = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvRep = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvSet.setText(set);
        tvRep.setText(rep);

        return convertView;


    }
}
