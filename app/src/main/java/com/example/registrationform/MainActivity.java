package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button Register;

    @SuppressLint("WrongViewCast")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Register = (Button) findViewById(R.id.Register);
        editText = (EditText) findViewById(R.id.editText);
        editText = (EditText) findViewById(R.id.editText2);
        editText = (EditText) findViewById(R.id.editText3);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Fields Are Empty!", Toast.LENGTH_SHORT).show();

                }else if (editText.getText().toString().equals("0") || editText.getText().toString().startsWith("-")){
                    Toast.makeText(MainActivity.this, "This Age Is Not Allowed", Toast.LENGTH_SHORT).show();

                } else{
                    Toast.makeText(MainActivity.this, "You Registered Successfully!", Toast.LENGTH_SHORT).show();
                }




            }


        });
    }


}