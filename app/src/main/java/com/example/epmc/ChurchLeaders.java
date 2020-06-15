package com.example.epmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChurchLeaders extends AppCompatActivity {

    TextView csimod,kcdbish,revnebu,revdarwin;
    ImageView iv23,iv30,iv2,iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church_leaders);
        csimod = findViewById(R.id.textView28);
        kcdbish = findViewById(R.id.textView30);
        revnebu = findViewById(R.id.textView36);
        revdarwin = findViewById(R.id.textView39);
        iv23 = findViewById(R.id.imageView23);
        iv30 = findViewById(R.id.imageView30);
        iv2 = findViewById(R.id.imageView2);
        iv3 = findViewById(R.id.imageView3);
    }
    public void csimodclickimage(View view)
    {
        iv23.setVisibility(View.GONE);
        csimod.setVisibility(View.VISIBLE);
    }
    public void csimodclicktext(View view)
    {
        iv23.setVisibility(View.VISIBLE);
        csimod.setVisibility(View.GONE);
    }
    public void kcdbishclickimage(View view)
    {
        iv30.setVisibility(View.GONE);
        kcdbish.setVisibility(View.VISIBLE);
    }
    public void kcdbishclicktext(View view)
    {
        iv30.setVisibility(View.VISIBLE);
        kcdbish.setVisibility(View.GONE);
    }
    public void revnebuclickimage(View view)
    {
        iv2.setVisibility(View.GONE);
        revnebu.setVisibility(View.VISIBLE);
    }
    public void revnebuclicktext(View view)
    {
        iv2.setVisibility(View.VISIBLE);
        revnebu.setVisibility(View.GONE);
    }
    public void revdarwinclickimage(View view)
    {
        iv3.setVisibility(View.GONE);
        revdarwin.setVisibility(View.VISIBLE);
    }
    public void revdarwinclicktext(View view)
    {
        iv3.setVisibility(View.VISIBLE);
        revdarwin.setVisibility(View.GONE);
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
