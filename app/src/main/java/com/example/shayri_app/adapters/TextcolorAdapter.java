package com.example.shayri_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shayri_app.Fourth_page;
import com.example.shayri_app.R;

public class TextcolorAdapter extends BaseAdapter {

    Fourth_page fourth_page;
    int[] colorarr2;

    public TextcolorAdapter(Fourth_page fourth_page, int[] colorarr2) {
        this.fourth_page = fourth_page;
        this.colorarr2 = colorarr2;
    }

    @Override
    public int getCount() {
        return colorarr2.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(fourth_page).inflate(R.layout.text_color_item,parent,false);

        TextView textView = convertView.findViewById(R.id.textcolor);
        textView.setBackgroundResource(colorarr2[position]);

        return convertView;
    }
}
