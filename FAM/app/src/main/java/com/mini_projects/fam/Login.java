package com.mini_projects.fam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by iWanjugu on 09/11/2015.
 */
public class Login extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Creating on click change activities for a button
        Button googleButton = (Button) findViewById(R.id.googleButton);
        googleButton.setOnClickListener(this);

        Button twitterButton = (Button) findViewById(R.id.twitterButton);
        twitterButton.setOnClickListener(this);

        Button facebookButton = (Button) findViewById(R.id.facebookButton);
        facebookButton.setOnClickListener(this);

        TextView registerTextView = (TextView) findViewById(R.id.registerTextView);
        registerTextView.setOnClickListener(this);
    }
    private void toMainActivityClick() {
    Intent a = new Intent(this, MainActivity2.class);
    startActivity(a);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.googleButton:
                toMainActivityClick();
                break;

            case R.id.twitterButton:
                toMainActivityClick();
                break;

            case R.id.facebookButton:
                toMainActivityClick();
                break;

            case R.id.registerTextView:
                toMainActivityClick();
                break;
        }
    }
}
