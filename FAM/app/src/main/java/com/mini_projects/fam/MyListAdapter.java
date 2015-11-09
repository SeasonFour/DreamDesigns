package com.mini_projects.fam;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mini_projects.fam.R;

class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] values;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] values, Integer[] imgid) {
        super(context, R.layout.listview_layout, values);

        this.context = context;
        this.values = values;
        this.imgid = imgid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater listInflater = LayoutInflater.from(getContext());
        View theView = listInflater.inflate(R.layout.listview_layout, null, true);

        //getting the text and icons for the list
        TextView theTextView = (TextView) theView.findViewById(R.id.text_template);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.image_template);


        theTextView.setText(values[position]);
        theImageView.setImageResource(imgid[position]);

        return theView;
    }

}
