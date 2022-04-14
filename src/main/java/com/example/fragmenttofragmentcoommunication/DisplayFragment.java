package com.example.fragmenttofragmentcoommunication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayFragment extends Fragment {



    public DisplayFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        TextView textViewKinza = view.findViewById(R.id.textViewKinza);

        Bundle bundleKinza = getArguments();

        String kinza = bundleKinza.getString("💕💕kinza💕💕");

        textViewKinza.setText(kinza);

        // 💕💕💕💕💕💕💕💕💕💕 Kinza Amjad is so so chocolaty 💕💕💕💕💕💕💕💕💕

        return view;
    }
}