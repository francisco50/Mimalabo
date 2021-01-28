package com.example.mimalabo.Fragments;


import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mimalabo.DataSources.CultureDataSource;
import com.example.mimalabo.Datas.CultureData;
import com.example.mimalabo.DetailsActivities.CultureDetailActivity;
import com.example.mimalabo.Fragment_classes.Culture;
import com.example.mimalabo.Fragments.CaptionedImagesAdapter;
import com.example.mimalabo.R;

import java.util.Collections;
import java.util.List;


public class PeopleFragment extends Fragment {




    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        RecyclerView peoplerecycler = (RecyclerView)inflater.inflate(R.layout.fragment_culture,container,false);

        String[] resname = new String[CultureData.cultureList.size()];

        for(int i=0; i<resname.length;i++)
        {
            resname[i] = CultureData.cultureList.get(i).getName();
        }

        int[] resimage = new int[CultureData.cultureList.size()];
        for(int i=0;i<resimage.length;i++)
        {
            resimage[i] = CultureData.cultureList.get(i).getImageId();
        }

        String[] resdescription = new String[CultureData.cultureList.size()];
        for(int i=0;i<resdescription.length;i++)
        {
            //resdescription[i] = Culture.culture[i].getDescription();
        }

        String[] coordinate = new String[CultureData.cultureList.size()];
        for(int i=0;i<coordinate.length;i++)
        {
            coordinate[i] = CultureData.cultureList.get(i).getCoordinates();
        }



        CaptionedImagesAdapter Adapter = new CaptionedImagesAdapter(resname,resimage,resdescription,null);
        peoplerecycler.setAdapter(Adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        peoplerecycler.setLayoutManager(layoutManager);

        Adapter.setListener(new CaptionedImagesAdapter.Listener()
        {
            @Override
            public void onClick(int position)
            {
                Intent intent = new Intent(getActivity(), CultureDetailActivity.class);
                intent.putExtra(CultureDetailActivity.EXTRA_CULTURE_ID,position);
                getActivity().startActivity(intent);
            }
        });

        return peoplerecycler;
    }

}
