package com.example.mimalabo.Fragment_classes;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.mimalabo.R;
import com.example.mimalabo.sqlite.MalaboContract;

import java.util.UUID;

//@Entity
public class Hotel implements Parcelable
{

    //@PrimaryKey
   // @NonNull
    private String itemId;
   // @ColumnInfo
    private String name;
   // @ColumnInfo
    private int ImageResourceId;
    //@ColumnInfo
    private String descrip;
    //@ColumnInfo
    private String coordinate;



    public Hotel() {

    }


//    public static final Hotel[] hotels = {
//            new Hotel(null,"Sofitel Malabo Sipopo Le Golf", R.drawable.sofitel_malabo_sipopo,"Spend the day relaxing at Sofitel Malabo Sipopo Le Golf's private white sand beach," +
//                    " practicing your swing on the golf course, or pampering yourself at the full-service spa. Then enjoy a meal at one of the hotel's 4 restaurants. All 200 rooms offer" +
//                    " thoughtful touches like pillow menus and slippers, as well as comforts such as Egyptian cotton sheets and down comforters. Free WiFi and balconies are standard," +
//                    " as are flat-screen TVs with satellite channels.","3.734893,8.7572579"),
//            new Hotel(null,"Magno Hotel",R.drawable.magno_hotel,"A restaurant, a bar/lounge, and a coffee shop/café are available at this smoke-free hotel. Free WiFi in public" +
//                    " areas is provided, as well as a free airport shuttle, a free casino shuttle, and a free manager's reception. Additionally, 24-hour room service, a meeting room, and" +
//                    " concierge services are onsite. All 15 soundproofed rooms provide free WiFi, free wired Internet, and memory foam beds. For a bit of entertainment, guests will find" +
//                    " LED TVs with cable channels and first-run movies, and other amenities include 24-hour room service and refrigerators.","3.734893,8.7572579"),
//            new Hotel(null,"Ibis Malabo", R.drawable.ibis_malabo,"This smoke-free hotel features a restaurant, an outdoor pool, and a bar/lounge. Free WiFi in public areas and" +
//                    " free self parking are also provided. Additionally, dry cleaning, laundry facilities, and a 24-hour front desk are onsite. All 130 rooms offer free WiFi, minibars," +
//                    " and TVs with cable channels. Hair dryers, safes, and showers are among the other amenities that guests will find.","3.734893,8.7572579"),
//            new Hotel(null,"Anda China",R.drawable.newchina,"See why so many travelers make Hotel Anda China Malabo their hotel of choice when visiting Malabo. " +
//                    "Providing an ideal mix of value, comfort and convenience, it offers an array of amenities designed for travelers like you. The rooms offer air conditioning, and getting online is possible," +
//                    " as free wifi is available, allowing you to rest and refresh with ease. Hotel Anda China Malabo features a 24 hour front desk, room service, and a concierge. In addition, as a valued Hotel Anda" +
//                    " China Malabo guest, you can enjoy a pool and an on-site restaurant that are available on-site. Guests arriving by vehicle have access to street parking. While staying at Hotel Anda China Malabo," +
//                    " visitors can check out Catedral de Santa Isabel (2.0 mi), which is a popular Malabo attraction. While you’re here, be sure to check out Delice De France, one of the Mediterranean restaurants that " +
//                    "can be found in Malabo, which is a short distance from Hotel Anda China Malabo. We’re sure you’ll enjoy your stay at Hotel Anda China Malabo as you experience all of the things Malabo has to offer.","3.734893,8.7572579"),
//            new Hotel(null,"Sofitel Malabo President Palace",R.drawable.sofitel_palace,"A restaurant, an outdoor pool, and a fitness center are available at this hotel"+
//                     "Free WiFi in public areas, free valet parking, and a free airport shuttle are also provided. Other amenities include a bar/lounge, a 24-hour business center," +
//                    "and massage/treatment rooms. All 100 rooms offer free WiFi, 24-hour room service, and TVs with satellite channels. Guests will also find minibars, premium bedding," +
//                    "and coffee makers.","3.734893,8.7572579"),
//            new Hotel(null,"Hotel 3 de Agosto",R.drawable.tresdeagosto,"Featuring a bar, garden and views of pool, Hotel 3 de Agosto is located in Ciudad de Malabo, 1.4 km from Martinez Hermanos Supermarket. " +
//                    "Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi throughout the property. The hotel features family rooms. A continental breakfast is " +
//                    "available daily at the hotel. Hotel 3 de Agosto offers a terrace. Popular points of interest near the accommodation include South African Embassy, Clinica Guadalupe and Casa Verde.","3.734893,8.7572579"),
//            new Hotel(null,"Hilton Malabo", R.drawable.hilton,"4-star hotel with free valet parking and free airport shuttle\n" +
//                    "A restaurant, an outdoor pool, and 2 bars/lounges are available at this smoke-free hotel. Free WiFi in public areas, free valet parking, and a free airport shuttle are also provided. Additionally, a health club," +
//                    " a poolside bar, and an outdoor tennis court are onsite. All 187 rooms offer free WiFi and free wired Internet, plus 24-hour room service and LCD TVs with DVD players. Guests will also find minibars, separate bathtubs and showers, and coffee makers.\n" +
//                    "Hilton Malabo offers 187 air-conditioned accommodations with DVD players and minibars. LCD televisions are featured in guestrooms. Bathrooms include separate bathtubs and showers, bathrobes, bidets, and hair dryers.\n" +
//                    "Guests can surf the web using the complimentary wired and wireless Internet access. Business-friendly amenities include desks, safes, and phones. Additionally, rooms include coffee/tea makers and irons/ironing boards. Housekeeping is provided daily.\n" +
//                    "Recreational amenities at the hotel include an outdoor tennis court, an outdoor pool, and a health club.\n" +
//                    "The recreational activities listed below are available either on site or nearby; fees may apply.","3.734893,8.7572579")
//    };

    public Hotel(String itemId, String name, int ImageResourceId, String descrip, String coordinate)
    {

        if(itemId == null)
        {
            itemId = UUID.randomUUID().toString();
        }

        this.ImageResourceId = ImageResourceId;
        this.name = name;
        this.descrip = descrip;
        this.coordinate = coordinate;
        this.itemId = itemId;


    }


    protected Hotel(Parcel in) {
        itemId = in.readString();
        name = in.readString();
        ImageResourceId = in.readInt();
        descrip = in.readString();
        coordinate = in.readString();
    }

    public static final Creator<Hotel> CREATOR = new Creator<Hotel>()
    {
        @Override
        public Hotel createFromParcel(Parcel in) {
            return new Hotel(in);
        }

        @Override
        public Hotel[] newArray(int size) {
            return new Hotel[size];
        }
    };

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        ImageResourceId = imageResourceId;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public ContentValues toValues()
    {

        //Use this to pass into the methods, this will create a good insert statement
        ContentValues values = new ContentValues(5);

        values.put(MalaboContract.COLUMN_ID,itemId);
        values.put(MalaboContract.COLUMN_DESCRIPTION,descrip);
        values.put(MalaboContract.COLUMN_COORDINATE,coordinate);
        values.put(MalaboContract.COLUMN_IMAGE,ImageResourceId);
        values.put(MalaboContract.COLUMN_NAME,name);
        return values;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", ImageResourceId=" + ImageResourceId +
                ", descrip='" + descrip + '\'' +
                ", coordinate='" + coordinate + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemId);
        dest.writeString(name);
        dest.writeInt(ImageResourceId);
        dest.writeString(descrip);
        dest.writeString(coordinate);
    }
}
