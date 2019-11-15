package com.example.epmc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.FirebaseStorage;

import java.text.DateFormat;
import java.util.Date;

public class Sermon extends AppCompatActivity {

    TextView tvdate;
    String currentDateString = DateFormat.getDateInstance().format(new Date());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sermon);
        tvdate = findViewById(R.id.textView5);
        tvdate.setText(currentDateString);
        FirebaseStorage storage = FirebaseStorage.getInstance();

    }

}
