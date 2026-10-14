package com.example.gitconflictdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button primaryButton = findViewById(R.id.primaryButton);
        Button secondaryButton = findViewById(R.id.secondaryButton);

        primaryButton.setOnClickListener(view ->
                Toast.makeText(this, R.string.primary_clicked, Toast.LENGTH_SHORT).show());
        secondaryButton.setOnClickListener(view ->
                Toast.makeText(this, R.string.secondary_clicked, Toast.LENGTH_SHORT).show());
    }
}
