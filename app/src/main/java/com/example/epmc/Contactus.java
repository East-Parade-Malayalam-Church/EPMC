package com.example.epmc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Contactus extends AppCompatActivity {
    public ImageButton imageCall;
    ImageButton ib23;
    ImageButton ib24;
    ImageButton ib25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        imageCall = findViewById(R.id.imageButton);
        ib23 = findViewById(R.id.imageButton23);
        ib24 = findViewById(R.id.imageButton24);
        ib25 = findViewById(R.id.imageButton25);
    }
    public void btemailns(View view)
    {
        Intent ie1 = new Intent(Intent.ACTION_SEND);
        ie1.setType("message/rfc822");
        ie1.putExtra(Intent.EXTRA_EMAIL  , new String[]{"nebukulathunkal@gmail.com"});
        ie1.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");
        ie1.putExtra(Intent.EXTRA_TEXT   , "Respected Nebu Achen, ");
        try {
            startActivity(Intent.createChooser(ie1, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Contactus.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
    public void btemaildv(View view)
    {
        Intent ie2 = new Intent(Intent.ACTION_SEND);
        ie2.setType("message/rfc822");
        ie2.putExtra(Intent.EXTRA_EMAIL  , new String[]{"darwinvv@gmail.com"});
        ie2.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");
        ie2.putExtra(Intent.EXTRA_TEXT   , "Respected Darwin Achen, ");
        try {
            startActivity(Intent.createChooser(ie2, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Contactus.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
    public void btemailco(View view)
    {
        Intent ie3 = new Intent(Intent.ACTION_SEND);
        ie3.setType("message/rfc822");
        ie3.putExtra(Intent.EXTRA_EMAIL  , new String[]{"epmalayalam@gmail.com"});
        ie3.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");
        ie3.putExtra(Intent.EXTRA_TEXT   , "To whomsover it may concern at East Parade Church, ");
        try {
            startActivity(Intent.createChooser(ie3, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Contactus.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
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
