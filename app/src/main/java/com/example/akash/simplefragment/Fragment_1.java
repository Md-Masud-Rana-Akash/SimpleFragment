package com.example.akash.simplefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by akash on 5/1/2017.
 */

public class Fragment_1 extends Fragment{
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

      v = inflater.inflate( R.layout.frag_1_layout, container, false );
        return v;
    }
}
