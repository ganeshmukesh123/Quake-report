package com.example.android.quakereport;



/**
 * Created by ADMIN on 05-Mar-17.
 */

public class Earthquake {
    /*Magnitude of earthquake*/
    private Double mMagnitude;

    /*Location of earthquake*/
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */

    public Earthquake(Double magnitude,String location,long timeInMilliseconds,String url){

        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;

    }

    /*Return magnitude of earthquake*/
    public Double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl(){
        return mUrl;
    }


}
