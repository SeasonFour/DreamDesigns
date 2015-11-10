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


public class ActivityTwo extends Activity {

    ImageView imageView1;
    Button button;
    int tophone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
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










