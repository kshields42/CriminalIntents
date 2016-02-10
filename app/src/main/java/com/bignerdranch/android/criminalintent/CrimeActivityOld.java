package com.bignerdranch.android.criminalintent;
/*
Activity no longer of use as of Chapter 11(page 210)
CrimePagerActivity replaces it

 */

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;


public class CrimeActivityOld extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "com.bignerdranch.android.criminalintent.crime.id";

    public static Intent newIntent(Context packageContext, UUID crimeId){
        Intent intent = new Intent(packageContext,CrimeActivityOld.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment(){
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

}

