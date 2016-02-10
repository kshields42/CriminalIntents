package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by BadKitty on 9/27/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        //generate unique identifier
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public Date getDate() {

        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }

}
