package com.example.mimalabo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.widget.Toolbar;

import com.example.mimalabo.sqlite.malaboDbHelper;



public class MainActivity extends AppCompatActivity
{
    private static final int SPLASH_SCREEN_TIME_OUT = 2000;

    private Button know;
    private ImageView iconimage;
    private LinearLayout linearLayout;

    private Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =  new Intent(MainActivity.this,PlacesActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);

        //know = findViewById(R.id.know_malabo);
        iconimage = findViewById(R.id.icon_image);
        linearLayout = findViewById(R.id.linear_layout);


        linearLayout.animate().alpha(0f).setDuration(100000);
        TranslateAnimation animation = new TranslateAnimation(0,0,0,-1000);
        animation.setDuration(1000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new MyAnimationListener());

        iconimage.setAnimation(animation);






    }

    private class MyAnimationListener implements Animation.AnimationListener {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {

            iconimage.clearAnimation();
            iconimage.setVisibility(View.INVISIBLE);
            linearLayout.animate().alpha(1f).setDuration(1000);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }

    public void KnowMalabo(View v)
    {
        Intent intent = new Intent(this,PlacesActivity.class);
        startActivity(intent);

    }


}
