package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mimalabo.Datas.RestaurantData;
import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.R;
import com.example.mimalabo.Fragment_classes.Restaurants;

public class Activity_restaurant_detail extends AppCompatActivity {

    public static final String EXTRA_RESTAURANT_ID = "restaurantId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);


        int restaurantId = (Integer) getIntent().getExtras().get(EXTRA_RESTAURANT_ID);

        String resName = RestaurantData.restaurantsList.get(restaurantId).getNames();
        TextView textView = findViewById(R.id.resdetail_textname);
        textView.setText(resName);


        int resImage = RestaurantData.restaurantsList.get(restaurantId).getImagesId();
        ImageView imageView = findViewById(R.id.resdetail_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, resImage));
        imageView.setContentDescription(resName);

        String resDescrip = RestaurantData.restaurantsList.get(restaurantId).getDescription();
        TextView textView1 = findViewById(R.id.resdetail_textdescrip);
        textView1.setText(resDescrip);
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
        for(int i = 0; i< RestaurantData.restaurantsList.size(); i++)
        {
            Uri uri = Uri.parse("geo:" + RestaurantData.restaurantsList.get(i));
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

    }
}
