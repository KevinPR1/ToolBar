package com.example.mynavdrawer.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mynavdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParamsFragment extends Fragment {


    public static ParamsFragment newInstance() {
        return (new ParamsFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_params, container, false);
    }

}