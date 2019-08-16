package com.example.epmc;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Contactus extends AppCompatActivity {
    private ImageButton imageCall;
    private TextView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        imageCall = findViewById(R.id.imageButton);
        pic = findViewById(R.id.textView36);
    }
    public void btcall(View view)
    {
        Uri uri = Uri.parse("tel:9901801555");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btcallass(View view)
    {
        Uri uri = Uri.parse("tel:8971357074");
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }
    public void btcalloff(View view)
    {
        Uri uri = Uri.parse("tel:8025582867");
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }
}
