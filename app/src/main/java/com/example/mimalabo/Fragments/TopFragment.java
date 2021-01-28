package com.example.mimalabo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimalabo.DataSources.HotelDataSource;
import com.example.mimalabo.Datas.HotelData;
import com.example.mimalabo.DetailsActivities.HotelDetailActivity;
import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.Fragment_classes.Restaurants;
import com.example.mimalabo.Fragments.CaptionedImagesAdapter;
import com.example.mimalabo.R;

import java.util.Collections;
import java.util.List;


public class TopFragment extends Fragment
{
    HotelDataSource hotelDataSourse;
    List<Hotel> hotelList = HotelData.hotelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {


        // Inflate the layout for this fragment
        RecyclerView hotelRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_hotel,container,false);

        String[] hotelnames = new String[HotelData.hotelList.size()];
        for(int i =0;i<hotelnames.length;i++)
        {
            hotelnames[i] = HotelData.hotelList.get(i).getName();
        }

        int[] hotelImages = new int[HotelData.hotelList.size()];
        for(int i=0;i<hotelImages.length;i++)
        {
            hotelImages[i] = HotelData.hotelList.get(i).getImageResourceId();
        }


        String[] hotelDescription = new String[HotelData.hotelList.size()];
        for(int i=0;i<hotelDescription.length;i++)
        {
           // hotelDescription[i] = Hotel.hotels[i].getDescrip();
        }

        //hotelDataSourse.seedDatabase(hotelList);
        //List<Hotel> HotelsListFromDb = hotelDataSourse.getAllItems();

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
