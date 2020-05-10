package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.example.mimalabo.R;
import com.example.mimalabo.Fragment_classes.Urban;

public class Activity_urban_detail extends AppCompatActivity
{

    public static final String EXTRA_URBAN_ID = "urbanId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urban_detail);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        int urbanId = (Integer)getIntent().getExtras().get(EXTRA_URBAN_ID);

        String urbannames = Urban.urbans[urbanId].getName();
        TextView textView = (TextView)findViewById(R.id.beachtext);
        textView.setText(urbannames);

        int urbanimages = Urban.urbans[urbanId].getImageId();
        ImageView imageView = (ImageView)findViewById(R.id.beachimage);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,urbanimages));
        imageView.setContentDescription(urbannames);

        String urbandescription = Urban.urbans[urbanId].getDescription();
        TextView textView1 = (TextView)findViewById(R.id.beachtextdescription);
        textView1.setText(urbandescription);


    }
}
