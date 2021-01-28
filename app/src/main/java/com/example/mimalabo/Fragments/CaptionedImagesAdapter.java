package com.example.mimalabo.Fragments;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import com.example.mimalabo.DataSources.CultureDataSource;
import com.example.mimalabo.DataSources.HotelDataSource;
import com.example.mimalabo.DataSources.PlacesDataSource;
import com.example.mimalabo.DataSources.RestaurantDataSource;
import com.example.mimalabo.DataSources.UrbanDataSource;
import com.example.mimalabo.Fragment_classes.Culture;
import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.Fragment_classes.Restaurants;
import com.example.mimalabo.Fragment_classes.Urban;
import com.example.mimalabo.R;

import java.util.ArrayList;
import java.util.List;

class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>
{


    String[] captions;
    int[] imagesId;
    String[] descrip;
    String[] coordinates;
    private Listener listener;
    SQLiteDatabase database;

    //List<Objects> object = new Object();

    interface Listener
    {
        void onClick(int position);
    }


    public  CaptionedImagesAdapter()
    {



    }
    public CaptionedImagesAdapter(String[] captions, int[] imagesId, String[] descrip, String[] coordinates)
    {
        this.captions = captions;
        this.imagesId = imagesId;
        this.descrip = descrip;
        this.coordinates = coordinates;
    }

    @Override
    public int getItemCount()
    {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final CardView cardView;
        public ViewHolder(CardView v)
        {
            super(v);
            cardView = v;
        }
    }

    public void setListener(Listener listener)
    {
        this.listener = listener;
    }

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType)
    {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image,parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
        CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imagesId[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);

        TextView textView1 = cardView.findViewById(R.id.info_text);
        textView1.setText(captions[position]);

       TextView textView = cardView.findViewById(R.id.info_textdescrip);
        textView.setText(descrip[position]);





        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(listener!=null)
                {
                    listener.onClick(position);
                }
            }
        });
    }
}
