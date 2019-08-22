package com.example.epmc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {
    Button mn;
    EditText emailWidget,passwordWidget,confirmpasswordWidget,nameWidget;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mn = (Button) findViewById(R.id.button28);
    }

    public void btmn(View view)
    {
        String email=emailWidget.getText().toString();
        String password=passwordWidget.getText().toString();
        String name=nameWidget.getText().toString();
        String confirmpassword=confirmpasswordWidget.getText().toString();

        if(TextUtils.isEmpty(name)) {
            Toast.makeText(getApplicationContext(),"Please enter Your Name!",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(confirmpassword)) {
            Toast.makeText(getApplicationContext(),"Please Confirm Password!",Toast.LENGTH_LONG).show();
            return;
        }

        if(confirmpassword!=password) {
            Toast.makeText(getApplicationContext(),"Passowrds do not match :(",Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Registration successful!", Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                            Intent intent = new Intent(Signup.this, Home.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Registration failed! Please try again later", Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }
}
