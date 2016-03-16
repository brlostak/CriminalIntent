package com.example.brlostak.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by rschildge on 3/16/2016.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
