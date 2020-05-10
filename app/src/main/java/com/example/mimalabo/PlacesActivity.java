package com.example.mimalabo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.mimalabo.Fragments.MuseumFragment;
import com.example.mimalabo.Fragments.PeopleFragment;
import com.example.mimalabo.Fragments.RestaurantsFragment;
import com.example.mimalabo.Fragments.TopFragment;
import com.example.mimalabo.Fragments.UrbanFragment;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class PlacesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
       // assert actionBar != null;
        //actionBar.setDisplayHomeAsUpEnabled(true);

        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
        pager.setAdapter(pagerAdapter);

        //Attach the viewpager to the tablayout
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);


        //We are adding the Drawer Layout to out PlacesActivity and creating a toggle(burger)
        //Attaching the toggle to the drawer, and to the PlacesActivity toolbar with the open and close navigation string.
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open_navigation,R.string.close_navigation);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        //Navigation View
        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*Fragment fragment = new GalleryFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.content_frame,fragment);
        ft.commit();*/



    }

    @Override
    public boolean onNavigationItemSelected(MenuItem Item)
    {
        int id = Item.getItemId();
        Fragment fragment = null;
        Intent intent = null;

        switch (id)
        {

            case R.id.nav_tours:
               // fragment = new ToursFragment();
                intent = new Intent(this,CityToursActivity.class);
                break;

            case R.id.nav_recommendation:
                intent = new Intent(this,RecommendationActivity.class);
                //fragment = new RecommendedFragment();
                break;

            case R.id.nav_moreapps:
                intent = new Intent(this,MoreAppsActivity.class);
               // fragment = new AppsFragment();
                break;

            case R.id.nav_help:
                intent = new Intent(this,HelpActivity.class);
                break;

            case R.id.nav_feedback:
                intent = new Intent(this,FeedbackActivity.class);
                break;

            default:
                intent = new Intent(this,PictureGalleryActivity.class);
                //fragment = new GalleryFragment();
        }

        startActivity(intent);

        //close the drawer when the user selects one of the options
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);

        if(drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }

        else
        {
            super.onBackPressed();
        }
    }



    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TopFragment();
                case 1:
                    return new RestaurantsFragment();
                case 2:
                    return new UrbanFragment();
                case 3:
                    return new MuseumFragment();
                case 4:
                    return new PeopleFragment();
            }

            return null;
        }


        @Override
        public CharSequence getPageTitle(int position)
        {

            switch (position)
            {
                case 0:
                    return getResources().getText(R.string.hotel_tab);
                case 1:
                    return getResources().getText(R.string.restaurants_tab);
                case 2:
                    return getResources().getText(R.string.urban_tab);
                case 3:
                    return getResources().getText(R.string.places_tab);
                case 4:
                    return getResources().getText(R.string.people_tab);

            }
            return null;
        }
    }
}
