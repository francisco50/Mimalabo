package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mimalabo.R;
import com.example.mimalabo.Fragment_classes.Restaurants;

public class Activity_restaurant_detail extends AppCompatActivity {

    public static final String EXTRA_RESTAURANT_ID = "restaurantId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);


        int restaurantId = (Integer) getIntent().getExtras().get(EXTRA_RESTAURANT_ID);

        String resName = Restaurants.restaurants[restaurantId].getNames2();
        TextView textView = (TextView) findViewById(R.id.resdetail_textname);
        textView.setText(resName);


        int resImage = Restaurants.restaurants[restaurantId].getImagesId2();
        ImageView imageView = (ImageView) findViewById(R.id.resdetail_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, resImage));
        imageView.setContentDescription(resName);

        String resDescrip = Restaurants.restaurants[restaurantId].getDescription2();
        TextView textView1 = (TextView) findViewById(R.id.resdetail_textdescrip);
        textView1.setText(resDescrip);
    }
}
