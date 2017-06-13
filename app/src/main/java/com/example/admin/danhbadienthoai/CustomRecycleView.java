package com.example.admin.danhbadienthoai;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by admin on 6/11/2017.
 */

public class CustomRecycleView extends RecyclerView.Adapter<CustomRecycleView.ViewHolder> {

    ArrayList<ItemContacts> arrayList;
    Context context;

    public CustomRecycleView(ArrayList<ItemContacts> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_item_contacts, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.t1.setText(arrayList.get(position).getName());
        if(arrayList.get(position).isGender())
            holder.image.setImageResource(R.drawable.men);
        else holder.image.setImageResource(R.drawable.women);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t1;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.textname);
            image = (ImageView) itemView.findViewById(R.id.immm);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,getLayoutPosition()+ "", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
