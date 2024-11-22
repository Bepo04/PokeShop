package com.ericandpau.pokeshop;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NavBar extends Fragment {

    Button loginButton;
    Button mainButton;

    public NavBar() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nav_bar, container, false);

        loginButton = view.findViewById(R.id.login);
        mainButton = view.findViewById(R.id.inici);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity() ,MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getActivity().getIntent();

        if (intent != null) {
            if(intent.getBooleanExtra("Loged", false)) {
                loginButton.setText("Perfil");
                loginButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), Login.class);
                        startActivity(intent);
                    }
                });
            } else {
                loginButton.setText("Login");
                loginButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), Login.class);
                        startActivity(intent);
                    }
                });
            }
        }

        return view;
    }
}