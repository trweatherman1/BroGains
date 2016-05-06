package com.example.trent.brogains;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.trent.brogains.Abs.Abs;
import com.example.trent.brogains.Back.Back;
import com.example.trent.brogains.Biceps.Biceps;
import com.example.trent.brogains.Chest.Chest;
import com.example.trent.brogains.Legs.Legs;
import com.example.trent.brogains.Shoulders.Shoulders;
import com.example.trent.brogains.Triceps.Triceps;

import java.util.ArrayList;

public class ViewMuscleGroups extends Activity implements AdapterView.OnItemClickListener {

    private ArrayList<String> muscles;

    private TextView muscleGroup;

    private ListView lvMuscles;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        muscleGroup = (TextView) this.findViewById(R.id.textView);

        getListData();

        lvMuscles = (ListView) findViewById(R.id.listView);

        lvMuscles.setOnItemClickListener(this);

        adapter = new CustomAdapter(this, R.layout.list_view, muscleGroup);
        lvMuscles.setAdapter(adapter);
    }

    public void getListData(){
        muscles = new ArrayList<String>();
        muscles.add(AppConstraints.CHEST);
        muscles.add(AppConstraints.BACK);
        muscles.add(AppConstraints.LEGS);
        muscles.add(AppConstraints.BICEPS);
        muscles.add(AppConstraints.TRICEPS);
        muscles.add(AppConstraints.SHOULDERS);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        TextView text = (TextView) view.findViewById(R.id.textView);
        String muscleGroupName = text.getText().toString();
        switch(muscleGroupName){

            case AppConstraints.CHEST:
                intent = new Intent(this, Chest.class);
                intent.putExtra(AppConstraints.CHEST, muscleGroupName);
                this.startActivity(intent);
                break;

            case AppConstraints.BACK:
                intent = new Intent(this, Back.class);
                intent.putExtra(AppConstraints.BACK, muscleGroupName);
                this.startActivity(intent);
                break;

            case AppConstraints.LEGS:
                intent = new Intent(this, Legs.class);
                intent.putExtra(AppConstraints.LEGS, muscleGroupName);
                this.startActivity(intent);
                break;

            case AppConstraints.BICEPS:
                intent = new Intent(this, Biceps.class);
                intent.putExtra(AppConstraints.BICEPS, muscleGroupName);
                this.startActivity(intent);
                break;

            case AppConstraints.TRICEPS:
                intent = new Intent(this, Triceps.class);
                intent.putExtra(AppConstraints.TRICEPS, muscleGroupName);
                this.startActivity(intent);
                break;

            case AppConstraints.SHOULDERS:
                intent = new Intent(this, Shoulders.class);
                intent.putExtra(AppConstraints.SHOULDERS, muscleGroupName);
                this.startActivity(intent);
                break;

            case AppConstraints.ABS:
                intent = new Intent(this, Abs.class);
                intent.putExtra(AppConstraints.ABS, muscleGroupName);
                this.startActivity(intent);
                break;



        }
    }

}
