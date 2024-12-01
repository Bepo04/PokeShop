package com.ericandpau.pokeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CartProduct extends Fragment {

    int q = 1;

    public CartProduct() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cart_product, container, false);

        Button addButton = view.findViewById(R.id.afegeix);
        Button quitButton = view.findViewById(R.id.treu);

        TextView quantity = view.findViewById(R.id.quantity);
        quantity.setText(String.valueOf(q));

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q++;
                quantity.setText(String.valueOf(q));
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q>1) {
                    q--;
                }

                quantity.setText(String.valueOf(q));
            }
        });

        return view;
    }
}