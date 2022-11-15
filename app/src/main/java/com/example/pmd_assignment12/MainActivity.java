package com.example.pmd_assignment12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView welcome_message;
    private Button begin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //initialising button and text
            welcome_message = findViewById(R.id.welcome_message);
            begin_btn = findViewById(R.id.welcome_button);

            //adding animation to the text
            Animation fade_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
            welcome_message.setAnimation(fade_in);

            //adding animation to button, so it appears after the text
            Animation fade_in_button = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_with_delay);
            begin_btn.setAnimation(fade_in_button);
    }
}