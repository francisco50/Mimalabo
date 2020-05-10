package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.R;

public class HotelDetailActivity extends AppCompatActivity
{

    //USE this constant to pass the ID of the hotel as extra information the user chose.
    public static final String EXTRA_HOTEL_ID = "hotelId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);


        //Set the textview and use the hotelId to set the text on the TextView

        int hotelId = (Integer)getIntent().getExtras().get(EXTRA_HOTEL_ID);
        String hotelName = Hotel.hotels[hotelId].getName();
        TextView textView = (TextView)findViewById(R.id.detail_textname);
        textView.setText(hotelName);

        int hotelImage = Hotel.hotels[hotelId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.detail_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,hotelImage));
        imageView.setContentDescription(hotelName);

        String hotelDescrip = Hotel.hotels[hotelId].getDescrip();
        TextView textView1 = (TextView)findViewById(R.id.detail_textdescrip);
        textView1.setText(hotelDescrip);


    }
}
