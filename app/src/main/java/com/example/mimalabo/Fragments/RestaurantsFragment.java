package com.example.mimalabo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimalabo.DetailsActivities.Activity_restaurant_detail;
import com.example.mimalabo.Fragment_classes.Restaurants;
import com.example.mimalabo.Fragments.CaptionedImagesAdapter;
import com.example.mimalabo.R;


public class RestaurantsFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        RecyclerView restaurantsrecycler = (RecyclerView)inflater.inflate(R.layout.fragment_recy_restaurants,container,false);

        String[] resname = new String[Restaurants.restaurants.length];
        for(int i=0;i<resname.length;i++)
        {
            resname[i]= Restaurants.restaurants[i].getNames2();
        }

        int[] resImages = new int[Restaurants.restaurants.length];
        for(int i=0; i<resImages.length; i++)
        {
            resImages[i] = Restaurants.restaurants[i].getImagesId2();
        }

        String[] resdescription = new String[Restaurants.restaurants.length];
        for(int i=0; i<resdescription.length; i++)
        {
            // placesdescription[i] = Places.places[i].getDescription1();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(resname, resImages, resdescription);
        restaurantsrecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        restaurantsrecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener()
        {
            @Override
            public void onClick(int position)
            {
                Intent intent = new Intent(getActivity(), Activity_restaurant_detail.class);
                intent.putExtra(Activity_restaurant_detail.EXTRA_RESTAURANT_ID,position);
                getActivity().startActivity(intent);
            }
        });
        return restaurantsrecycler;

    }

}
