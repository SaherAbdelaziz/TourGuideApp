package com.tourguide.mytourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SaherOs on 1/25/2018.
 */

public class itemAdapter extends ArrayAdapter<myItem> {
    Context context;
    ArrayList<myItem> items;


    public itemAdapter(Activity context, ArrayList<myItem> items) {

        super(context, 0, items);
        this.context = context;
        this.items = items;
        //mcolorResourceId = colorResourceId ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.my_item, null);
        }
        myItem item=getItem(position);
        TextView txtTitle = (TextView) v.findViewById(R.id.head_line_text);
        ImageView imageView = (ImageView) v.findViewById(R.id.image);
        TextView extratxt = (TextView) v.findViewById(R.id.information_text);
        txtTitle.setText(item.getmHeadLine());
        imageView.setImageResource(item.getmImageID());
        extratxt.setText(item.getmInformation());
        return v;
    }
}
