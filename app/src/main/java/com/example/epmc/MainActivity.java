package com.example.epmc;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button submit;
    Button newsignup;
    EditText emailWidget,passwordWidget;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.button);
        emailWidget=(EditText)findViewById(R.id.email) ;
        passwordWidget=(EditText)findViewById(R.id.password);
        newsignup = (Button) findViewById(R.id.button27);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);
        mAuth=FirebaseAuth.getInstance();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if(currentUser!=null) {
            Intent i = new Intent(this,Home.class);
            startActivity(i);
            finish();
        }
    }
    public void btnhome(View v)
    {
        email=emailWidget.getText().toString();
        password=passwordWidget.getText().toString();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if(!task.isSuccessful()) {
                                Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Intent i = new Intent(MainActivity.this,Home.class);
                            startActivity(i);
                            finish();
                        }
                    }
                });
    }

    public void btsignup(View v)
    {
        Intent i = new Intent(this,Signup.class);
        startActivity(i);
    }
}