package com.example.mimalabo.DetailsActivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

}
