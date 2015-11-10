package com.mini_projects.fam;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends Activity {

    public final String NEW_IN_NAME = "NEW IN";
    public final String WOMEN_NAME = "WOMEN";
    public final String MEN_NAME = "MEN";
    public final String KIDS_NAME = "KIDS";

    //List View stuff
    // Titles
    String[] names = {
            NEW_IN_NAME,
            WOMEN_NAME,
            MEN_NAME,
            KIDS_NAME,
    };

    // Icons
    Integer[] imgid = {
            R.drawable.new_in,
            R.drawable.top_image,
            R.drawable.men,
            R.drawable.kids,
    };
    ListView list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent a = new Intent(MainActivity.this, ActivityOne.class);
                startActivity(a);
            }
        });
        buttonIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(a);
            }
        });
        buttonIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, ActivityThree.class);
                startActivity(a);
            }
        });
        buttonIcon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, ActivityFour.class);
                startActivity(a);
            }
        });

        //---------------------------------------------------------------//
        //List View//
        ListAdapter theAdapter = new MyListAdapter(
                this,
                names,
                imgid
        );

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(theAdapter);

        //OnClick on the whole list
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                new SweetAlertDialog(MainActivity.this)
                        .setTitleText("Here's a message!")
                        .show();
            }
        });

//        Ian's attempts
//        list.setOnItemClickListener(listItem);
//
//        private AdapterView.OnItemClickListener listItem = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String info = ((TextView) view).getText().toString();
//                Toast.makeText(getBaseContext(),"Item "+info, Toast.LENGTH_LONG).show();
//            }
//        }

//        //OnClick on the images - attempt
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                for(imgid[i] = 0; i <= imgid.length; i++){
//                    if(i == R.drawable.new_in){
//                        new SweetAlertDialog(MainActivity.this)
//                                .setTitleText("Here's a message!")
//                                .show();
//                    }
//                }
//            }
//        });


    }
}

