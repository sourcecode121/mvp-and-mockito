package com.example.mockito.view;

import android.util.Log;

import com.example.mockito.view.Display;

/**
 * Created by Anand on 04/10/2016.
 */
public class DisplayImpl implements Display {
    @Override
    public void showId(int id) {
        Log.d("Display", String.format("Id : %d", id));
    }

    @Override
    public void showFirstName(String firstName) {
        Log.d("Display", firstName);
    }

    @Override
    public void showLastName(String lastName) {
        Log.d("Display", lastName);
    }
}
