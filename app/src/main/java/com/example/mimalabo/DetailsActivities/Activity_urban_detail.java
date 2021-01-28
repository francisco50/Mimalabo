package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.example.mimalabo.Datas.UrbanData;
import com.example.mimalabo.R;
import com.example.mimalabo.Fragment_classes.Urban;

public class Activity_urban_detail extends AppCompatActivity
{

    public static final String EXTRA_URBAN_ID = "urbanId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urban_detail);

        Toolbar toolbar = findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        int urbanId = (Integer)getIntent().getExtras().get(EXTRA_URBAN_ID);

        String urbannames = UrbanData.urbanList.get(urbanId).getName();
        TextView textView = findViewById(R.id.beachtext);
        textView.setText(urbannames);

        int urbanimages = UrbanData.urbanList.get(urbanId).getImageId();
        ImageView imageView = findViewById(R.id.beachimage);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,urbanimages));
        imageView.setContentDescription(urbannames);

        String urbandescription = UrbanData.urbanList.get(urbanId).getDescription();
        TextView textView1 = findViewById(R.id.beachtextdescription);
        textView1.setText(urbandescription);


    }
}
