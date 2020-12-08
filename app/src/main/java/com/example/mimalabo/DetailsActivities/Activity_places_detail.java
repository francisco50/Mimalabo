package com.example.mimalabo.DetailsActivities;

import
        androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.R;


public class Activity_places_detail extends AppCompatActivity {

    public static final String EXTRA_HOTEL_ID1 = "placesId";
    //private static final String COORDINATES = "3.734893,8.7572579";

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

    //this is the code to display the map
    public void displayMap(View view)
    {
        for(int i=0;i<Places.places.length;i++)
        {
            Uri uri = Uri.parse("geo:" + Places.places[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

    }
}
