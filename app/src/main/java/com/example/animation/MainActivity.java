package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView jerry = findViewById(R.id.jerry);
        final ImageView tom = findViewById(R.id.tom);
        final ImageView circle = findViewById(R.id.circle);

        findViewById(R.id.btn_run_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tom.animate().rotationY(180);
                        jerry.animate().rotationY(180);
                    }
                }, 2000);

                tom.animate().translationXBy(-2000f).setDuration(3000);
                jerry.animate().translationXBy(-2000f).setDuration(3000);
            }
        });

        findViewById(R.id.btn_run_rigth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tom.animate().rotationY(180);
                        jerry.animate().rotationY(180);
                    }
                }, 2000);

                tom.animate().translationXBy(2000f).setDuration(3000);
                jerry.animate().translationXBy(2000f).setDuration(3000);
            }
        });

        findViewById(R.id.animation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
                //Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
                //Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotation);
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.multiple_animation);
                circle.startAnimation(animation);
            }
        });
    }
}