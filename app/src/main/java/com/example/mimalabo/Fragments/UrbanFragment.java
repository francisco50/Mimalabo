package com.example.mimalabo.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimalabo.DetailsActivities.Activity_urban_detail;
import com.example.mimalabo.Fragment_classes.Urban;
import com.example.mimalabo.Fragments.CaptionedImagesAdapter;
import com.example.mimalabo.R;


public class UrbanFragment extends Fragment
{

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RecyclerView eventrecycler = (RecyclerView)inflater.inflate(R.layout.fragment_urban,container,false);

        String[] resname = new String[Urban.urbans.length];
        for(int i =0; i<resname.length;i++)
        {
            resname[i] = Urban.urbans[i].getName();
        }

        int[] resimage = new int[Urban.urbans.length];
        for(int i =0; i<resimage.length;i++)
        {
            resimage[i] = Urban.urbans[i].getImageId();
        }

        String[] resdescription = new String[Urban.urbans.length];
        for(int i =0; i<resdescription.length;i++)
        {
            //resdescription[i] = Urban.urbans[i].getDescription();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(resname,resimage,resdescription,null);
        eventrecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        eventrecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position)
            {
                Intent intent = new Intent(getActivity(), Activity_urban_detail.class);
                intent.putExtra(Activity_urban_detail.EXTRA_URBAN_ID,position);
                getActivity().startActivity(intent);
            }
        });

        return eventrecycler;
    }

}
