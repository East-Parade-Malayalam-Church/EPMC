package com.example.epmc;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSIMalayalamChurches extends AppCompatActivity {
    Button ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ch = (Button) findViewById(R.id.button25);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csimalayalam_churches);
    }
    public void btch(View view)
    {
        Intent i = new Intent(this,Churches.class);
        startActivity(i);
    }
}
