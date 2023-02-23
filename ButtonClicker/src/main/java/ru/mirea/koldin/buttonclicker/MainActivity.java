package ru.mirea.koldin.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox chkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnItIsNotMe = findViewById(R.id.NotMeButton);
        btnWhoAmI = findViewById(R.id.WhoButton);
        textViewStudent = findViewById(R.id.textView);
        chkBox = findViewById(R.id.checkBox);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 12");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void onMyButtonClick(View view)
    {
        Toast.makeText(this,"Ещё один способ!", Toast.LENGTH_SHORT).show();
        textViewStudent.setText("Это не я сделал");
        chkBox.setChecked(true);
        chkBox.setText("На кнопку нажали");
    }
}