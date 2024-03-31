package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class geography extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_geography, container, false);

        ImageButton buttonToQuizEntertainment = view.findViewById(R.id.buttonToQuizGeography);
        buttonToQuizEntertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), quizGeography.class);
                startActivity(intent);
            }
        });

        return view;
    }
}