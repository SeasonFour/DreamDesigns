package com.mini_projects.fam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class MainActivity extends Activity implements View.OnClickListener {

    //tags for the buttonIcons
    public static final String TAG_itemIcon1 = "icon1";
    public static final String TAG_itemIcon2 = "icon2";
    public static final String TAG_itemIcon3 = "icon3";
    public static final String TAG_itemIcon4 = "icon4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Create a button to attach the menu:
        // in Activity Context
        ImageView imageView1 = new ImageView(this); // Create an icon
        imageView1.setImageResource(R.drawable.ic_launcher);

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

        buttonIcon1.setTag(TAG_itemIcon1);
        buttonIcon2.setTag(TAG_itemIcon2);
        buttonIcon3.setTag(TAG_itemIcon3);
        buttonIcon4.setTag(TAG_itemIcon4);

        // 3. Create the menu with the items:

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(buttonIcon1)
                .addSubActionView(buttonIcon2)
                .addSubActionView(buttonIcon3)
                .addSubActionView(buttonIcon4)
                .attachTo(actionButton)
                .build();
    }


    private void buttonIcon1Click() {
        Intent intent1 = new Intent(this, ActivityOne.class);
        startActivity(intent1);
    }

    private void buttonIcon2Click() {
        Intent intent2 = new Intent(this, ActivityTwo.class);
        startActivity(intent2);
    }

    private void buttonIcon3Click() {
        Intent intent3 = new Intent(this, ActivityThree.class);
        startActivity(intent3);
    }

    private void buttonIcon4Click() {
        Intent intent4 = new Intent(this, ActivityFour.class);
        startActivity(intent4);
    }

    public void onClick(View v) {
        if (TAG_itemIcon1.equals(v.getTag())){
            buttonIcon1Click();
        }
        if (TAG_itemIcon2.equals(v.getTag())){
            buttonIcon2Click();
        }
        if (TAG_itemIcon3.equals(v.getTag())){
            buttonIcon3Click();
        }
        if (TAG_itemIcon4.equals(v.getTag())){
            buttonIcon4Click();
        }


//        switch (v.getTag()) {
//            case equals():
//                buttonIcon1Click();
//                break;
//
//            case buttonIcon2:
//                buttonIcon2Click();
//                break;
//
//            case buttonIcon3:
//                buttonIcon3Click();
//                break;
//
//            case buttonIcon4:
//                buttonIcon4Click();
//                break;

        }
    }

