package com.ericandpau.pokeshop;

import static android.app.PendingIntent.getActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.callback);
        EditText mail = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mail.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    Toast.makeText(Login.this, "Introdueix tots els camps", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent( Login.this, MainActivity.class);
                    intent.putExtra("Loged", true);
                    startActivity(intent);
                }

            }
        });

    }
}