package com.example.pmd_assignment12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Menu_screen extends AppCompatActivity {

    private ArrayList<String> menuText;
    private ArrayList<Integer> menuImages;
    private MyRvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        //initialising recycler view
        RecyclerView rv = findViewById(R.id.recycler_view);

        //initialising text array and adding text for main menu
        menuText = new ArrayList<String>();
        menuText.add("Pubs");
        menuText.add("Restaurants");
        menuText.add("Parks");
        menuText.add("Hotels");
        menuText.add("B&B");

        //initialising image array and adding images to main menu
        menuImages = new ArrayList<Integer>();
        menuImages.add(R.drawable.pub);
        menuImages.add(R.drawable.restaurant);
        menuImages.add(R.drawable.park);
        menuImages.add(R.drawable.hotel);
        menuImages.add(R.drawable.bnb);

        //setting up layout manager
        rv.setLayoutManager(new LinearLayoutManager(this));

        //initialising adapter
        adapter = new MyRvAdapter(this,menuText,menuImages);

        //rv.setOnClickListener((View.OnClickListener) this);
        rv.setAdapter(adapter);



    }

}