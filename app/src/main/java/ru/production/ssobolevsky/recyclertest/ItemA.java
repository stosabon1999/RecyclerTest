package ru.production.ssobolevsky.recyclertest;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by pro on 23.06.2018.
 */

public class ItemA implements BaseItem, Parcelable{

    private String mText = "def";

    public ItemA() {
    }

    @Override
    public int getType() {
        return ItemTypes.ONE_TEXT_ITEM.getType();
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mText);
    }

    public static final Parcelable.Creator<ItemA> CREATOR = new Creator<ItemA>() {
        @Override
        public ItemA createFromParcel(Parcel parcel) {
            return new ItemA(parcel);
        }

        @Override
        public ItemA[] newArray(int i) {
            return new ItemA[0];
        }
    };

    private ItemA(Parcel parcel) {
        mText = parcel.readString();
    }
}
