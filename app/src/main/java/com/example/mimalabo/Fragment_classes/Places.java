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
public class Places implements Parcelable
{

    public Places()
    {

    }

    //@PrimaryKey
    //@NonNull
    private String itemId;
    //@ColumnInfo
    private String names1;
    //@ColumnInfo
    private int ImagesId1;
    //@ColumnInfo
    private String description1;
    //@ColumnInfo
    private String coordinates;


    public String getNames1() {
        return names1;
    }

    public void setNames1(String names1) {
        this.names1 = names1;
    }

    public int getImagesId1() {
        return ImagesId1;
    }

    public void setImagesId1(int imagesId1) {
        ImagesId1 = imagesId1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
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

    public static Creator<Places> getCREATOR() {
        return CREATOR;
    }




    public Places(String itemId, String names1, int ImagesId1, String description1, String coordinates)
    {


        if(itemId == null)
        {
            itemId = UUID.randomUUID().toString();
        }

        this.names1 = names1;
        this.ImagesId1 = ImagesId1;
        this.description1 = description1;
        this.coordinates = coordinates;
        this.itemId = itemId;
    }

    protected Places(Parcel in) {
        names1 = in.readString();
        ImagesId1 = in.readInt();
        description1 = in.readString();
        coordinates = in.readString();
        itemId = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(names1);
        dest.writeInt(ImagesId1);
        dest.writeString(description1);
        dest.writeString(coordinates);
        dest.writeString(itemId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Places> CREATOR = new Creator<Places>() {
        @Override
        public Places createFromParcel(Parcel in) {
            return new Places(in);
        }

        @Override
        public Places[] newArray(int size) {
            return new Places[size];
        }
    };



    public ContentValues toValues()
    {

        //Use this to pass into the methods, this will create a good insert statement
        ContentValues values = new ContentValues(5);

        values.put(MalaboContract.COLUMN_ID,itemId);
        values.put(MalaboContract.COLUMN_DESCRIPTION4,description1);
        values.put(MalaboContract.COLUMN_COORDINATE4,coordinates);
        values.put(MalaboContract.COLUMN_IMAGE4,ImagesId1);
        values.put(MalaboContract.COLUMN_NAME4,names1);
        return values;

    }

    @Override
    public String toString() {
        return "Places{" +
                "names1='" + names1 + '\'' +
                ", ImagesId1=" + ImagesId1 +
                ", description1='" + description1 + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", itemId='" + itemId + '\'' +
                '}';
    }


}
