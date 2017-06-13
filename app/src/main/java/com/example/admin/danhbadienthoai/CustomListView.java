package com.example.admin.danhbadienthoai;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 6/13/2017.
 */

public class CustomListView extends ArrayAdapter<ItemContacts> {
    Activity context = null;
    ArrayList<ItemContacts> arrayList = null;
    int layout;

    public CustomListView(Activity context, int resource, ArrayList<ItemContacts> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        convertView = layoutInflater.inflate(layout, null);
        TextView t = (TextView) convertView.findViewById(R.id.textname);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.immm);
        t.setText(arrayList.get(position).getName());
        if (arrayList.get(position).isGender())
            imageView.setImageResource(R.drawable.men);
        else imageView.setImageResource(R.drawable.women);
        return convertView;
    }
}
