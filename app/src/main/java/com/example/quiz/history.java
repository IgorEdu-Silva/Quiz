package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class history extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        ImageButton buttonToQuizHistory = view.findViewById(R.id.buttonToQuizHistory);
        buttonToQuizHistory.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), quizHistory.class);
            startActivity(intent);
        });

        return view;
    }
}