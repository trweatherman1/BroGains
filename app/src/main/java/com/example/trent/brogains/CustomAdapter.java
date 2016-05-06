package com.example.trent.brogains;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Trent on 5/14/2015.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    private ArrayList<String> workouts;

    private Context context;

    int viewSource;


    public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> dataItems) {
        super(context, textViewResourceId, dataItems);
        this.context = context;
        this.workouts= dataItems;
        //this.hands = hands;
        viewSource = textViewResourceId;

    }

    public View getView(int position, View listItemView, ViewGroup parent) {
        View view = listItemView;

        if (view == null)//Only create if null - recycling a good idea
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(viewSource, parent, false);
        }

        //String valueText = this.values.get(position);
        String workoutText = this.workouts.get(position);

        //Get the views from the list item XML
        TextView songPosition = (TextView) view.findViewById(R.id.textView);
        //TextView valuePosition = (TextView) view.findViewById(R.id.textView4);

        //valuePosition.setText(valueText);
        songPosition.setText(workoutText);

        return(view);
    }
}
