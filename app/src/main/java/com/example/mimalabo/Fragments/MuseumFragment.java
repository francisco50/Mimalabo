package com.example.mimalabo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimalabo.DetailsActivities.Activity_places_detail;
import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.R;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toolbar;


public class MuseumFragment extends Fragment {


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView placesrecycler = (RecyclerView)inflater.inflate(R.layout.fragment_places,container,false);


        String[] placesname = new String[Places.places.length];
        for(int i=0;i<placesname.length;i++)
        {
            placesname[i]= Places.places[i].getNames1();
        }

        int[] placesImages = new int[Places.places.length];
        for(int i=0; i<placesImages.length; i++)
        {
            placesImages[i] = Places.places[i].getImagesId();
        }

        String[] placesdescription = new String[Places.places.length];
        for(int i=0; i<placesdescription.length; i++)
        {
           // placesdescription[i] = Places.places[i].getDescription1();
        }


        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(placesname, placesImages, placesdescription,null);
        placesrecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        placesrecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), Activity_places_detail.class);
                intent.putExtra(Activity_places_detail.EXTRA_HOTEL_ID1,position);
                getActivity().startActivity(intent);
            }
        });
        return placesrecycler;


    }

    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {

        inflater.inflate(R.menu.menu_main,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
