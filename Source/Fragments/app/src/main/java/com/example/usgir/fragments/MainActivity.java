package com.example.usgir.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ChatRoom{
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void report() {
        count++;
        FragmentB fragment = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.update("You Clicked '"+Integer.toString(count)+"' times");
    }
}
