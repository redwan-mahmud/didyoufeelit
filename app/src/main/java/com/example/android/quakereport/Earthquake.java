package com.example.android.quakereport;

/**
 * Created by Redwan Mahmud on 7/25/2018.
 */
public class Earthquake {
    //Magnitude of the earthquake
    private double mMagnitude;

    //Location of the earthquake
    private String mLocation;

    //Date of the earthquake
    private long mTimeinMilliseoncs;

    private String mUrl_quake;




public Earthquake(double magnitude,String location, long timeinMilliSeconds, String url_quake){
    mMagnitude = magnitude;
    mLocation = location;
    mTimeinMilliseoncs = timeinMilliSeconds;
    mUrl_quake = url_quake;
}

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeinMilliseoncs() {
        return mTimeinMilliseoncs;
    }

    public String getmUrl_quake(){return mUrl_quake;}
}


