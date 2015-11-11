package com.mini_projects.fam;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class ActivityTwo extends Activity {

    ImageView imageView1;
    Button button;
    int tophone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        //---------------------------------------------------------------//
        //Floating Action Menu//


        // 1. Create a button to attach the menu:
        // in Activity Context
        ImageView imageView1 = new ImageView(this); // Create an icon
//        imageView1.setImageResource(R.drawable.red_selected);

        com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton actionButton =
                new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(this)
                        .setContentView(imageView1)
                        .build();

        // 2. Creating Menu Items
        // Icons for the 'appearing' objects - repeat many times:
        ImageView itemIcon1 = new ImageView(this);
        itemIcon1.setImageResource(R.drawable.arena_50);

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.coins_50);

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.drawable.phone_50);

        ImageView itemIcon4 = new ImageView(this);
        itemIcon4.setImageResource(R.drawable.wifi_50);

        //Creating Menu Items - buttons for the 4 icons
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        SubActionButton buttonIcon1 = itemBuilder.setContentView(itemIcon1).build();
        SubActionButton buttonIcon2 = itemBuilder.setContentView(itemIcon2).build();
        SubActionButton buttonIcon3 = itemBuilder.setContentView(itemIcon3).build();
        SubActionButton buttonIcon4 = itemBuilder.setContentView(itemIcon4).build();

        // 3. Create the menu with the items:
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(buttonIcon1)
                .addSubActionView(buttonIcon2)
                .addSubActionView(buttonIcon3)
                .addSubActionView(buttonIcon4)
                .attachTo(actionButton)
                .build();

        buttonIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ActivityTwo.this, ActivityOne.class);
                startActivity(a);
            }
        });
        buttonIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ActivityTwo.this, ActivityTwo.class);
                startActivity(a);
            }
        });
        buttonIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(a);
            }
        });
        buttonIcon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ActivityTwo.this, ActivityFour.class);
                startActivity(a);
            }
        });

        //---------------------------------------------------------------//
    }
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.imageView2:
                        imageView1.setImageResource(R.drawable.lady1);
                        tophone=R.drawable.ic_launcher;
                        break;

                    case R.id.imageView3:
                        imageView1.setImageResource(R.drawable.lady2);
                        tophone=R.drawable.ic_launcher;
                        break;

                    case R.id.imageView4:
                        imageView1.setImageResource(R.drawable.lady3);
                        tophone=R.drawable.ic_launcher;
                        break;

                    case R.id.imageView5:
                        imageView1.setImageResource(R.drawable.kids1);
                        tophone=R.drawable.ic_launcher;
                        break;

                    case R.id.imageView6:
                        imageView1.setImageResource(R.drawable.kids2);
                        tophone=R.drawable.ic_launcher;
                        break;

                    case R.id.imageView7:
                        imageView1.setImageResource(R.drawable.kids3);
                        tophone=R.drawable.ic_launcher;
                        break;

                    case R.id.button:
                        InputStream a=getResources().openRawResource(tophone);
                        Bitmap whatever= BitmapFactory.decodeStream(a);
                        try{

                            getApplicationContext().setWallpaper(whatever);
                        }
                        catch(IOException e){

                            e.printStackTrace();
                        }
                        break;

                }
            }
        }










