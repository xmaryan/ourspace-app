package com.example.ourspace;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // layout bind

        Button btnClick = findViewById(R.id.btnClickMe);
        btnClick.setOnClickListener(v -> {
            String message = getString(R.string.button_clicked);
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
EditText input = findViewById(R.id.inputText);

    String userInput = input.getText().toString();
    if (userInput.isEmpty()) {
        Toast.makeText(MainActivity.this, "Please type something!", Toast.LENGTH_SHORT).show();
    } else {
        Toast.makeText(MainActivity.this, "You typed: " + userInput, Toast.LENGTH_SHORT).show();
    }
}
);
    }}