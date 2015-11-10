package com.mini_projects.fam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by iWanjugu on 10/11/2015.
 */


public class MainActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
                Intent a = new Intent(MainActivity2.this, ActivityOne.class);
                startActivity(a);
            }
        });
        buttonIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity2.this, ActivityTwo.class);
                startActivity(a);
            }
        });
        buttonIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity2.this, ActivityThree.class);
                startActivity(a);
            }
        });
        buttonIcon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity2.this, ActivityFour.class);
                startActivity(a);
            }
        });


        // clicking the titles to show dialogue

        // Creating on click change activities for a button
        TextView womenTextView = (TextView) findViewById(R.id.women_title1);

        womenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity2.this)
                        .setTitleText("Here's a message!")
                        .show();
            }
        });

    }
}
