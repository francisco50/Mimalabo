package com.example.mimalabo;

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
import androidx.viewpager.widget.ViewPager;

import com.example.mimalabo.DataSources.CultureDataSource;
import com.example.mimalabo.DataSources.PlacesDataSource;
import com.example.mimalabo.DataSources.RestaurantDataSource;
import com.example.mimalabo.DataSources.UrbanDataSource;
import com.example.mimalabo.Datas.CultureData;
import com.example.mimalabo.Datas.HotelData;
import com.example.mimalabo.Datas.PlacesData;
import com.example.mimalabo.Datas.RestaurantData;
import com.example.mimalabo.Datas.UrbanData;
import com.example.mimalabo.Fragment_classes.Culture;
import com.example.mimalabo.Fragment_classes.Hotel;
import com.example.mimalabo.Fragment_classes.Places;
import com.example.mimalabo.Fragment_classes.Restaurants;
import com.example.mimalabo.Fragment_classes.Urban;
import com.example.mimalabo.Fragments.MuseumFragment;
import com.example.mimalabo.Fragments.PeopleFragment;
import com.example.mimalabo.Fragments.RestaurantsFragment;
import com.example.mimalabo.Fragments.TopFragment;
import com.example.mimalabo.Fragments.UrbanFragment;
import com.example.mimalabo.DataSources.HotelDataSource;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class PlacesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    HotelDataSource hotelDataSourse;
    PlacesDataSource placesDataSource;
    UrbanDataSource urbanDataSource;
    RestaurantDataSource restaurantDataSource;
    CultureDataSource cultureDataSource;
    List<Hotel> hotelList = HotelData.hotelList;
    List<Places> placesList = PlacesData.placesList;
    List<Urban> urbanList = UrbanData.urbanList;
    List<Restaurants> restaurantList = RestaurantData.restaurantsList;
    List<Culture> cultureList = CultureData.cultureList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
       // assert actionBar != null;
        //actionBar.setDisplayHomeAsUpEnabled(true);

        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager pager = findViewById(R.id.viewpager);
        pager.setAdapter(pagerAdapter);

        //Attach the viewpager to the tablayout
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);


        //We are adding the Drawer Layout to out PlacesActivity and creating a toggle(burger)
        //Attaching the toggle to the drawer, and to the PlacesActivity toolbar with the open and close navigation string.
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open_navigation,R.string.close_navigation);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        //Navigation View
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*Fragment fragment = new HistoryFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.content_frame,fragment);
        ft.commit();*/


        //This calls the datasource class and creates the database and creates the Database Helper,
        //Also calling the classes that contain the data once the database is open
        //we are calling all the data source classes and they different databases
        hotelDataSourse = new HotelDataSource(this);
        hotelDataSourse.open();
        hotelDataSourse.seedDatabase(hotelList);
        List<Hotel> HotelListFromDb = hotelDataSourse.getAllItems();

        placesDataSource = new PlacesDataSource(this);
        placesDataSource.open();
        placesDataSource.seedDatabase(placesList);

        restaurantDataSource = new RestaurantDataSource(this);
        restaurantDataSource.open();
        restaurantDataSource.seedDatabase(restaurantList);
        List<Restaurants> RestaurantsListFromDb = restaurantDataSource.getAllItems();

        cultureDataSource = new CultureDataSource(this);
        cultureDataSource.open();
        cultureDataSource.seedDatabase(cultureList);
        List<Culture> CultureListFromDb = cultureDataSource.getAllItems();

        urbanDataSource = new UrbanDataSource(this);
        urbanDataSource.open();
        urbanDataSource.seedDatabase(urbanList);
        List<Urban> UrbanListFromDb = urbanDataSource.getAllItems();






        //Getting the data inside my data source to my database
        //check whether there is data in the Database already before adding


    }

    //When the activity goes away, we will close the database to prevent database leaks.
    @Override
    protected void onPause() {
        super.onPause();
        hotelDataSourse.close();
        placesDataSource.close();
        restaurantDataSource.close();
        cultureDataSource.close();
        urbanDataSource.close();

    }

    //whenever the activity is active we will have a valid data connection still even when the orientation closed
    @Override
    protected void onResume() {
        super.onResume();
        hotelDataSourse.open();
        placesDataSource.open();
        restaurantDataSource.close();
        cultureDataSource.close();
        urbanDataSource.close();
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem Item)
    {
        int id = Item.getItemId();
        Fragment fragment = null;
        Intent intent = null;



        switch (id)
        {

            //Comment out City Tours for now

            /*case R.id.nav_tours:
               // fragment = new ToursFragment();
                intent = new Intent(this,CityToursActivity.class);
                break;*/

            case R.id.countryHistory:
                intent = new Intent(this, EgHistoryActivity.class);
                //fragment = new RecommendedFragment();
                break;

            case R.id.topLocations:
                intent = new Intent(this, TopLocationActivity.class);
               // fragment = new AppsFragment();
                break;

            case R.id.nav_help:
                intent = new Intent(this,HelpActivity.class);
                break;

            case R.id.nav_feedback:
                intent = new Intent(this,FeedbackActivity.class);
                break;

            case R.id.nav_settings:
                intent = new Intent(this,SettingsActivity.class);
                break;

            default:
                intent = new Intent(this, HistoryActivity.class);
                //fragment = new HistoryFragment();
        }

        startActivity(intent);

        //close the drawer when the user selects one of the options
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        if(drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }

        else
        {
            super.onBackPressed();
        }
    }



    private class SectionsPagerAdapter extends FragmentPagerAdapter
    {

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


        //This getPageTitle is used to get and set the titles of the tabs from the strings
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
