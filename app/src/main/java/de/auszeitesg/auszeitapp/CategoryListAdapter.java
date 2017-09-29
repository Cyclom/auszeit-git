package de.auszeitesg.auszeitapp;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Copyright Cyclom (created on 18.09.2017).
 */

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder>{

    private Context context;
    private List<CategoryList> my_data;
    private static int position;

    public CategoryListAdapter(Context context, List<CategoryList> my_data) {
        this.context = context;
        this.my_data = my_data;
    }


    @Override
    public CategoryListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_card, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final CategoryListAdapter.ViewHolder holder, final int position) {
        holder.desc.setText(my_data.get(position).getDesc());
        holder.name.setText(my_data.get(position).getName());

        this.position = holder.getAdapterPosition();

        holder.cardView.setOnClickListener(onClick);
        holder.cardView.setTag(position);

        Glide.with(context).load(my_data.get(position).getImage()).into(holder.imageView);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Integer position = (Integer) view.getTag();

            Snackbar.make(view, "Lade...", Snackbar.LENGTH_SHORT)
                    .show();


        }
    };

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView desc;
        public ImageView imageView;
        public CardView cardView;
        public RecyclerView recyclerView;

        public ViewHolder(View itemView){
            super(itemView);

            desc = itemView.findViewById(R.id.desc);
            cardView = itemView.findViewById(R.id.card_view);
            name = itemView.findViewById(R.id.name);
            recyclerView = itemView.findViewById(R.id.recycler_view);
            imageView = itemView.findViewById(R.id.image);

        }
    }
}
