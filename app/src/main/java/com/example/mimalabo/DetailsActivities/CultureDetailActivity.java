package com.example.mimalabo.DetailsActivities;

import androidx.annotation.NonNull;
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

import com.example.mimalabo.Fragment_classes.Culture;
import com.example.mimalabo.R;


public class CultureDetailActivity extends AppCompatActivity
{

    public static final String EXTRA_CULTURE_ID = "cultureId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_detail);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        int cultureId = (Integer)getIntent().getExtras().get(EXTRA_CULTURE_ID);
        String culturename = Culture.culture[cultureId].getName();
        TextView textView = (TextView)findViewById(R.id.detailculture_textname);
        textView.setText(culturename);

        int cultureimage = Culture.culture[cultureId].getImageId();
        ImageView imageView = (ImageView)findViewById(R.id.detailcultureimage);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,cultureimage));
        imageView.setContentDescription(culturename);

        String culturedescrip = Culture.culture[cultureId].getDescription();
        TextView textView1 = (TextView)findViewById(R.id.detail_culturedescrip);
        textView1.setText(culturedescrip);

    }

    /*
    //We need to create this to work with the Appbar and add our map as an icon in the toolbar instead of a button
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

     */

    /*
    //here we are making the item respond to clicks and if clicked we call the displayMap1() method.
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.action_map)
        {
            displayMap1(null);
        }
        return super.onOptionsItemSelected(item);
    }

    this is the code to display the map
    public void displayMap1(View view) {
        for(int i=0;i< Culture.culture.length;i++)
        {
            Uri uri = Uri.parse("geo:" + Culture.culture[i].getCoordinates());
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

    }*/

}
