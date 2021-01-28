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
public class Culture implements Parcelable {

    public Culture() {
    }

    //@PrimaryKey
    //@NonNull
    private String itemId;
    //@ColumnInfo
    private String name;
    //@ColumnInfo
    private int ImageId;
    //@ColumnInfo
    private String description;
    //@ColumnInfo
    private String coordinates;




    public Culture(String itemId,String name, int ImagesId, String description, String coordinates)
    {

        if(itemId == null)
        {
            itemId = UUID.randomUUID().toString();
        }

        this.description = description;
        this.ImageId = ImagesId;
        this.name = name;
        this.coordinates = coordinates;
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
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

    public ContentValues toValues()
    {

        //Use this to pass into the methods, this will create a good insert statement
        ContentValues values = new ContentValues(5);

        values.put(MalaboContract.COLUMN_ID,itemId);
        values.put(MalaboContract.COLUMN_DESCRIPTION5,description);
        values.put(MalaboContract.COLUMN_COORDINATE5,coordinates);
        values.put(MalaboContract.COLUMN_IMAGE5,ImageId);
        values.put(MalaboContract.COLUMN_NAME5,name);
        return values;

    }


    @Override
    public String toString() {
        return "Culture{" +
                "name='" + name + '\'' +
                ", ImageId=" + ImageId +
                ", description='" + description + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", itemId='" + itemId + '\'' +
                '}';
    }

    protected Culture(Parcel in) {
        name = in.readString();
        ImageId = in.readInt();
        description = in.readString();
        coordinates = in.readString();
        itemId = in.readString();
    }

    public static final Creator<Culture> CREATOR = new Creator<Culture>() {
        @Override
        public Culture createFromParcel(Parcel in) {
            return new Culture(in);
        }

        @Override
        public Culture[] newArray(int size) {
            return new Culture[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(ImageId);
        dest.writeString(description);
        dest.writeString(coordinates);
        dest.writeString(itemId);
    }
}
