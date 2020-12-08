package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.Fragment_classes.Restaurants;
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


    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    //here we are making the item respond to clicks and if clicked we call the displayMap1() method.
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.action_map)
        {
            displayMap(null);
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayMap(View view)
    {
        for(int i = 0; i< Hotel.hotels.length; i++)
        {
            Uri uri = Uri.parse("geo:" + Hotel.hotels[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

    }
}
