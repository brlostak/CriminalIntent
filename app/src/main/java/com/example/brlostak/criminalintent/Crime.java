package com.example.brlostak.criminalintent;

import java.util.UUID;

/**
 * Created by rschildge on 3/16/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        //UUID creates a unique identifier number?
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }
}
