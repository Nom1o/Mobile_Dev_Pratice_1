package ru.mirea.koldin.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textViewStudent);
        TextView myTextView = (TextView) findViewById(R.id.textViewStudent);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.newButton);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.newCheckBox);
        checkBox.setChecked(true);
    }
}