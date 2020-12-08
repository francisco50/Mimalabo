package com.example.mimalabo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimalabo.DetailsActivities.HotelDetailActivity;
import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.Fragments.CaptionedImagesAdapter;
import com.example.mimalabo.R;


public class TopFragment extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {


        // Inflate the layout for this fragment
        RecyclerView hotelRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_hotel,container,false);

        String[] hotelnames = new String[Hotel.hotels.length];
        for(int i =0;i<hotelnames.length;i++)
        {
            hotelnames[i] = Hotel.hotels[i].getName();
        }

        int[] hotelImages = new int[Hotel.hotels.length];
        for(int i=0;i<hotelImages.length;i++)
        {
            hotelImages[i] = Hotel.hotels[i].getImageResourceId();
        }


        String[] hotelDescription = new String[Hotel.hotels.length];
        for(int i=0;i<hotelDescription.length;i++)
        {
           // hotelDescription[i] = Hotel.hotels[i].getDescrip();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(hotelnames,hotelImages,hotelDescription,null);
        hotelRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        hotelRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener()
        {
            public void onClick(int position)
            {
                Intent intent = new Intent(getActivity(), HotelDetailActivity.class);
                intent.putExtra(HotelDetailActivity.EXTRA_HOTEL_ID,position);
                getActivity().startActivity(intent);
            }
        });

        return hotelRecycler;
    }

}
