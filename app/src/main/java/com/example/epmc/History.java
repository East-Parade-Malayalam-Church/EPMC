package com.example.epmc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class History extends AppCompatActivity {
    TextView oj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        oj = (TextView) findViewById(R.id.textView140);
        oj.setMovementMethod(new ScrollingMovementMethod());
        }
}
