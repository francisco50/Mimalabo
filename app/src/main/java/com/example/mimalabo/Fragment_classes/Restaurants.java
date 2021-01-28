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

//@Entity
public class Restaurants implements Parcelable
{



    public Restaurants()
    {

    }

    @Override
    public String toString()
    {
        return "Restaurants{" +
                "itemId='" + itemId + '\'' +
                ", names='" + names + '\'' +
                ", ImagesId=" + ImagesId +
                ", description='" + description + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }

    //@PrimaryKey
    //@NonNull
    private String itemId;
    //@ColumnInfo
    private String names;
    //@ColumnInfo
    private int ImagesId;
    //@ColumnInfo
    private String description;
    //@ColumnInfo
    private String coordinates;

    protected Restaurants(Parcel in) {
        itemId = in.readString();
        names = in.readString();
        ImagesId = in.readInt();
        description = in.readString();
        coordinates = in.readString();
    }

    public static final Creator<Restaurants> CREATOR = new Creator<Restaurants>() {
        @Override
        public Restaurants createFromParcel(Parcel in) {
            return new Restaurants(in);
        }

        @Override
        public Restaurants[] newArray(int size) {
            return new Restaurants[size];
        }
    };

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getImagesId() {
        return ImagesId;
    }

    public void setImagesId(int imagesId) {
        ImagesId = imagesId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }




    public Restaurants(String itemId, String names, int ImagesId, String description, String coordinates)
    {
        this.itemId = itemId;
        this.names = names;
        this.ImagesId = ImagesId;
        this.description = description;
        this.coordinates = coordinates;
    }

    public ContentValues toValues()
    {

        //Use this to pass into the methods, this will create a good insert statement
        ContentValues values = new ContentValues(5);

        values.put(MalaboContract.COLUMN_COORDINATE2,coordinates);
        values.put(MalaboContract.COLUMN_ID,itemId);
        values.put(MalaboContract.COLUMN_DESCRIPTION2,description);
        values.put(MalaboContract.COLUMN_IMAGE2,ImagesId);
        values.put(MalaboContract.COLUMN_NAME2,names);
        return values;

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemId);
        dest.writeString(names);
        dest.writeInt(ImagesId);
        dest.writeString(description);
        dest.writeString(coordinates);
    }
}
