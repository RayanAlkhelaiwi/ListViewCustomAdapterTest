package me.rayanalkhelaiwi.listviewcustomadaptertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rean on 8/23/2017.
 */

public class FooBarAdapter extends ArrayAdapter<FooBarList> {

    public FooBarAdapter(Context context, ArrayList<FooBarList> fooBarList) {
        super(context, 0, fooBarList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View fooBarItemList = convertView;

        if (fooBarItemList == null) {

            fooBarItemList = LayoutInflater.from(getContext()).inflate(R.layout.list_three_items, parent, false);
        }

        FooBarList currentFooBar = getItem(position);

        TextView fooText = (TextView) fooBarItemList.findViewById(R.id.foo_text);
        fooText.setText(currentFooBar.getFooWord());

        TextView barText = (TextView) fooBarItemList.findViewById(R.id.bar_text);
        barText.setText(currentFooBar.getBarWord());

        ImageView fooBarImg = (ImageView) fooBarItemList.findViewById(R.id.foobar_img);
        fooBarImg.setImageResource(currentFooBar.getFooBarImg());

        return fooBarItemList;
    }
}
