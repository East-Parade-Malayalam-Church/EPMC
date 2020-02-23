package com.example.epmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Sundayschool extends AppCompatActivity {

    Button fragment1,fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sundayschool);

        fragment1 = findViewById(R.id.button33);
        fragment2 = findViewById(R.id.button34);
        listener();
    }
    public void listener()
    {
        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                BlankFragment ff1 = new BlankFragment();
                f1.replace(R.id.fragment_container,ff1);
                f1.commit();
            }
        });
        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                BlankFragment2 ff2 = new BlankFragment2();
                f2.replace(R.id.fragment_container,ff2);
                f2.commit();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem items) {
        switch (items.getItemId()) {
            case R.id.context_home:
                Intent i2 = new Intent(getApplicationContext(), Home.class);
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(items);

        }
    }
}
