package com.mini_projects.fam;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityOne extends FAM {

    FAM fam = new FAM();

    public FAM getFam() {
        return fam;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        fam.famMethod();
    }
}
