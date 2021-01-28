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

import com.example.mimalabo.DataSources.CultureDataSource;
import com.example.mimalabo.DataSources.HotelDataSource;
import com.example.mimalabo.DataSources.PlacesDataSource;
import com.example.mimalabo.DataSources.RestaurantDataSource;
import com.example.mimalabo.DataSources.UrbanDataSource;
import com.example.mimalabo.Datas.CultureData;
import com.example.mimalabo.Datas.HotelData;
import com.example.mimalabo.Datas.PlacesData;
import com.example.mimalabo.Datas.RestaurantData;
import com.example.mimalabo.Datas.UrbanData;
import com.example.mimalabo.DetailsActivities.Activity_places_detail;
import com.example.mimalabo.Fragment_classes.Culture;
import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.Fragment_classes.Restaurants;
import com.example.mimalabo.Fragment_classes.Urban;
import com.example.mimalabo.R;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toolbar;

import java.util.Collections;
import java.util.List;


public class MuseumFragment extends Fragment {


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView placesrecycler = (RecyclerView)inflater.inflate(R.layout.fragment_places,container,false);


        String[] placesname = new String[PlacesData.placesList.size()];
        for(int i=0;i<placesname.length;i++)
        {
            placesname[i]= PlacesData.placesList.get(i).getNames1();
        }

        int[] placesImages = new int[PlacesData.placesList.size()];
        for(int i=0; i<placesImages.length; i++)
        {
            placesImages[i] = PlacesData.placesList.get(i).getImagesId1();
        }

        String[] placesdescription = new String[PlacesData.placesList.size()];
        for(int i=0; i<placesdescription.length; i++)
        {
           // placesdescription[i] = Places.places[i].getDescription1();
        }



        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(placesname,placesImages,placesdescription,null);
        placesrecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        placesrecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), Activity_places_detail.class);
                intent.putExtra(Activity_places_detail.EXTRA_PLACES_ID1,position);
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
