package com.example.mimalabo.DetailsActivities;

import
        androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.R;


public class Activity_places_detail extends AppCompatActivity {

    public static final String EXTRA_HOTEL_ID1 = "placesId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_detail);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);


        //Set the textview and use the hotelId to set the text on the TextView

        int placesId = (Integer)getIntent().getExtras().get(EXTRA_HOTEL_ID1);
        String placesName = Places.places[placesId].getNames1();
        TextView textView = (TextView)findViewById(R.id.places_textname);
        textView.setText(placesName);

        int placesImage = Places.places[placesId].getImagesId();
        ImageView imageView = (ImageView)findViewById(R.id.places_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,placesImage));
        imageView.setContentDescription(placesName);

        String placesDescrip = Places.places[placesId].getDescription1();
        TextView textView1 = (TextView)findViewById(R.id.places_textdescrip);
        textView1.setText(placesDescrip);
    }
}
