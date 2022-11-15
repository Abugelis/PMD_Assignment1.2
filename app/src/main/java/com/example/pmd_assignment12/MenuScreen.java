package com.example.pmd_assignment12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MenuScreen extends AppCompatActivity implements MyRvAdapter.ItemClickListener {

    private ArrayList<String> menuText;
    private ArrayList<Integer> menuImages;
    private MyRvAdapter adapter;
    private Intent intent;


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
        adapter.setClickListener(this);
        rv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " +
             //   position, Toast.LENGTH_SHORT).show();
        switch (adapter.getImageItem(position)){
            case 0:
                Intent sendToPub = new Intent(MenuScreen.this, Pubs.class);
                startActivity(sendToPub);
        }
    }
}
