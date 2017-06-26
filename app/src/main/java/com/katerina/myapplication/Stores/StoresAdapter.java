package com.katerina.myapplication.Stores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.katerina.myapplication.R;

import java.util.ArrayList;

/*** Created by cathr on 26/6/2017. ***/

public class StoresAdapter extends ArrayAdapter<Store> {

    private ArrayList<Store> stores;
    private Context context;


    public StoresAdapter(Context context, ArrayList<Store> objects) {
        super(context, 0, objects);
        this.stores = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;
        Store s = stores.get(position);

        if(rowView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.store_item, null);
            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)rowView.getTag();
        }

        viewHolder.imageView.setImageResource(R.drawable.logo);
        viewHolder.legalNameView.setText(s.getLegalName());
        viewHolder.categoryView.setText(s.getCategory());
        viewHolder.addressView.setText(s.getAddress());
        viewHolder.ratingView.setText(Integer.toString(s.getReview()));

        return  rowView;
    }

    static class ViewHolder {
        public final ImageView imageView;
        public final TextView legalNameView;
        public final TextView categoryView;
        public final TextView addressView;
        public final TextView ratingView;

        public ViewHolder(View view){
            imageView = (ImageView)view.findViewById(R.id.store_image);
            legalNameView = (TextView)view.findViewById(R.id.store_name);
            categoryView = (TextView)view.findViewById(R.id.store_category);
            addressView = (TextView)view.findViewById(R.id.store_address);
            ratingView = (TextView)view.findViewById(R.id.store_review);
        }
    }
}
