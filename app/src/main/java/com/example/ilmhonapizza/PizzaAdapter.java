package com.example.ilmhonapizza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.ViewHolder> {

     ArrayList<Integer> pImages = new ArrayList<>();
     ArrayList<String> pNames = new ArrayList<>();
     Context pContext;

    public PizzaAdapter(Context pContext, ArrayList<Integer> pImages, ArrayList<String> pNames) {
        this.pImages = pImages;
        this.pNames = pNames;
        this.pContext = pContext;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_layout,parent, false );
        ViewHolder pHolder = new ViewHolder(view);

        return pHolder;
    }

    @Override
    public void onBindViewHolder(PizzaAdapter.ViewHolder holder, int position) {

        Glide.with(pContext)
                .asBitmap()
                .load(pImages.get(position))
                .into(holder.lImage);
        holder.lText.setText(pNames.get(position));

    }

    @Override
    public int getItemCount() {
        return pImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView lImage;
        TextView lText;
        RelativeLayout parent_layout;

        public ViewHolder(View itemView) {
            super(itemView);
            lImage = itemView.findViewById(R.id.image);
            lText = itemView.findViewById(R.id.imageName);
            parent_layout = itemView.findViewById(R.id.parent_Relative);
        }
    }
}
