package com.ericandpau.pokeshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BottomNav extends Fragment {

    public BottomNav() {

    }

    Button exit;
    Button pokes;
    Button help;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottom_nav, container, false);

        exit = view.findViewById(R.id.exit);
        pokes = view.findViewById(R.id.pokes);
        help = view.findViewById(R.id.help);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() != null) {
                    getActivity().finishAffinity();
                }
            }
        });

        pokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), ProductsActivity.class);
                    startActivity(intent);
                }
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), HelpActivity.class);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}