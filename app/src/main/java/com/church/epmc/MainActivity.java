package com.church.epmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText number;
    ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        number = findViewById(R.id.num);
        progressBar= findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);
        mAuth=FirebaseAuth.getInstance();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if(currentUser!=null) {
            Intent i = new Intent(this,Directory.class);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(mAuth.getCurrentUser()!=null)
        {
            Intent intent = new Intent(this,Home.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }

    public void btnhome(View v)
    {
        String numb = number.getText().toString();
        if(numb.isEmpty() || numb.length()<10)
        {
            number.setError("Please Enter Valid Number...");
            number.requestFocus();
            return;
        }
        String phnumber = "+91"+numb;
        Intent i = new Intent(this,Signup.class);
        i.putExtra("phonenumber",phnumber);
        startActivity(i);
        progressBar.setVisibility(View.VISIBLE);
    }
}