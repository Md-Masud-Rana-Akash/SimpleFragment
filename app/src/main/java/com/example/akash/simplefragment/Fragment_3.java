package com.example.akash.simplefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by akash on 5/1/2017.
 */

public class Fragment_3 extends Fragment {
    View v3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v3 = inflater.inflate( R.layout.frag_3_layout, container, false );
        return v3;
    }
}

