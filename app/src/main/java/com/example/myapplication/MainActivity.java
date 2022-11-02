package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    MotionLayout motionLayout;
    ConstraintSet setStart, setEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        motionLayout = findViewById(R.id.motion_layout);
        button.setOnClickListener(view -> {
            int randomTopMargin = new Random().nextInt(motionLayout.getMeasuredHeight()-button.getMeasuredHeight());
            int randomLeftMargin = new Random().nextInt(motionLayout.getMeasuredWidth()-button.getMeasuredWidth());
            Log.d("random: ", randomTopMargin + ", " + randomLeftMargin);
            button.setX(Float.valueOf(randomLeftMargin));
            button.setY(Float.valueOf(randomTopMargin));
        });
    }
}