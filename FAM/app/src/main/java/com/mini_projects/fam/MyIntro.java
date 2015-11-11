package com.mini_projects.fam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by iWanjugu on 09/11/2015.
 */
public class MyIntro extends AppIntro {

    String title;
    String description;
    int image;
    int background_colour;


    @Override
    public void init(Bundle savedInstanceState) {

//        // Add your slide's fragments here
//        // AppIntro will automatically generate the dots indicator and buttons.
//        addSlide(first_fragment);
//        addSlide(second_fragment);
//        addSlide(third_fragment);
//        addSlide(fourth_fragment);

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest

//        //Method 1
//        addSlide(AppIntroFragment.newInstance(
//                title = String.valueOf(intro_title1),
//                description = String.valueOf(R.string.intro_description1),
//                image = R.drawable.top_image_min,
//                background_colour = R.color.color_intro1
//        ));
//        addSlide(AppIntroFragment.newInstance(
//                title = String.valueOf(intro_title2),
//                description = String.valueOf(R.string.intro_description1),
//                image = R.drawable.top_image_min,
//                background_colour = R.color.color_intro2
//        ));

        //Method 2
        addSlide(AppIntroFragment.newInstance(
                title = "",
                description = "",
                image = R.drawable.woman3,
                background_colour = Color.parseColor("#FFFFFF")));

        addSlide(AppIntroFragment.newInstance(
                title = "",
                description = "",
                image = R.drawable.man4,
                background_colour = Color.parseColor("#FFFFFF")));

        addSlide(AppIntroFragment.newInstance(
                title = "",
                description = "",
                image = R.drawable.woman4,
                background_colour = Color.parseColor("#FFFFFF")));

        addSlide(AppIntroFragment.newInstance(
                title = "",
                description = "",
                image = R.drawable.man6,
                background_colour = Color.parseColor("#FFFFFF")));


                // OPTIONAL METHODS
                // Override bar/separator color
//        setBarColor(Color.parseColor("#3F51B5"));
//        setSeparatorColor(Color.parseColor("#2196F3"));

                // Hide Skip/Done button
                showSkipButton(true);
                showDoneButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
//        setVibrate(false);
//        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        Intent a = new Intent(MyIntro.this, Login.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onDonePressed() {
        Intent a = new Intent(MyIntro.this, Login.class);
        startActivity(a);
        finish();

    }
}
