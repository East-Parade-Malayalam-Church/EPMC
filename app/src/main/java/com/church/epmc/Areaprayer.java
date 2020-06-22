package com.church.epmc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Areaprayer extends AppCompatActivity {
    TextView ctp1,ctp2,ctp3,ctp4,ctp5,ctp6,ctp7,ctp8,ctp9,ctp10;
    ImageButton ibh1,ibh2,ibh3,ibh4,ibh5,ibh6,ibh7,ibh8,ibh9,ibh10;
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    DatabaseReference reff1=database.getReference().child("users").child("news").child("prayer").child("1");
    DatabaseReference reff2=database.getReference().child("users").child("news").child("prayer").child("2");
    DatabaseReference reff3=database.getReference().child("users").child("news").child("prayer").child("3");
    DatabaseReference reff4=database.getReference().child("users").child("news").child("prayer").child("4");
    DatabaseReference reff5=database.getReference().child("users").child("news").child("prayer").child("5");
    DatabaseReference reff6=database.getReference().child("users").child("news").child("prayer").child("6");
    DatabaseReference reff7=database.getReference().child("users").child("news").child("prayer").child("7");
    DatabaseReference reff8=database.getReference().child("users").child("news").child("prayer").child("8");
    DatabaseReference reff9=database.getReference().child("users").child("news").child("prayer").child("9");
    DatabaseReference reff10=database.getReference().child("users").child("news").child("prayer").child("10");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaprayer);
        ctp10 = findViewById(R.id.ctp);
        ctp1 = findViewById(R.id.ctp1);
        ctp2 = findViewById(R.id.ctp2);
        ctp3 = findViewById(R.id.ctp3);
        ctp4 = findViewById(R.id.ctp4);
        ctp5 = findViewById(R.id.ctp5);
        ctp6 = findViewById(R.id.ctp6);
        ctp7 = findViewById(R.id.ctp7);
        ctp8 = findViewById(R.id.ctp8);
        ctp9 = findViewById(R.id.ctp9);
        ibh10 = findViewById(R.id.h);
        ibh1 = findViewById(R.id.h1);
        ibh2 = findViewById(R.id.h2);
        ibh3 = findViewById(R.id.h3);
        ibh4 = findViewById(R.id.h4);
        ibh5 = findViewById(R.id.h5);
        ibh6 = findViewById(R.id.h6);
        ibh7 = findViewById(R.id.h7);
        ibh8 = findViewById(R.id.h8);
        ibh9 = findViewById(R.id.h9);

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String link = dataSnapshot.child("house").getValue().toString();
                ctp1.setText(details);
                ibh1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(link));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link.... Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp2.setText(details);
                ibh2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link.... Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp3.setText(details);
                ibh3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link.... Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp4.setText(details);
                ibh4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link.... Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp5.setText(details);
                ibh5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp6.setText(details);
                ibh6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp7.setText(details);
                ibh7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String house = dataSnapshot.child("house").getValue().toString();
                ctp8.setText(details);
                ibh8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(house));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(house));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        reff9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String link = dataSnapshot.child("house").getValue().toString();
                ctp9.setText(details);
                ibh9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(link));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                final String link = dataSnapshot.child("house").getValue().toString();
                ctp10.setText(details);
                ibh10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(link));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}