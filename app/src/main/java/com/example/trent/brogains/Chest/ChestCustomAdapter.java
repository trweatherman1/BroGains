package com.example.trent.brogains.Chest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.trent.brogains.R;

import java.util.ArrayList;

/**
 * Created by Trent on 5/10/2016.
 */
public class ChestCustomAdapter extends ArrayAdapter<String> {
    private ArrayList<String> chestWorkouts;

    private Context context;

    int viewSource;


    public ChestCustomAdapter(Context context, int textViewResourceId, ArrayList<String> dataItems) {
        super(context, textViewResourceId, dataItems);
        this.context = context;
        this.chestWorkouts= dataItems;
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
        String chestText = this.chestWorkouts.get(position);

        //Get the views from the list item XML
        TextView chestWorkoutPosition = (TextView) view.findViewById(R.id.textView);
        //TextView valuePosition = (TextView) view.findViewById(R.id.textView4);

        //valuePosition.setText(valueText);
        chestWorkoutPosition.setText(chestText);

        return(view);
    }
    
}
