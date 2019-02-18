package com.example.itdose.database

import android.os.Parcel
import android.os.Parcelable



class Model(val typeid:String,val Item:String) : Parcelable {



    constructor(parcel: Parcel) : this(parcel.readString(),parcel.readString()) {
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

             dest.writeString(typeid);
             dest.writeString(Item);

    }

    companion object CREATOR : Parcelable.Creator<Model> {
        override fun createFromParcel(parcel: Parcel): Model {
            return Model(parcel)
        }

        override fun newArray(size: Int): Array<Model?> {
            return arrayOfNulls(size)
        }
    }
}