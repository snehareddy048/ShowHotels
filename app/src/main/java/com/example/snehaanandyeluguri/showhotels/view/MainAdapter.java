package com.example.snehaanandyeluguri.showhotels.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.snehaanandyeluguri.showhotels.R;
import com.example.snehaanandyeluguri.showhotels.models.CityListData;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<CityListData> data;
    private Context context;
//    private final OnItemClickListener listener;

    public MainAdapter(Context context, List<CityListData> data,/* OnItemClickListener listener*/) {
        this.data = data;
       // this.listener = listener;
        this.context = context;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
//        holder.click(data.get(position), listener);
        holder.tvCity.setText(data.get(position).getName());
        holder.tvDesc.setText(data.get(position).getDescription());

        String images = data.get(position).getBackground();

        Glide.with(context)
                .load(images)
                .into(holder.background);


    }


    @Override
    public int getItemCount() {
        return data.size();
    }

//    public interface OnItemClickListener{
//        void onClick(CityListData cityListData);
//    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCity, tvDesc;
        ImageView background;

        public ViewHolder(View itemView) {
            super(itemView);
            tvCity = itemView.findViewById(R.id.city);
            tvDesc = itemView.findViewById(R.id.hotel);
            background = itemView.findViewById(R.id.image);
        }

//        public void click(final CityListData cityListData,final OnItemClickListener listener){
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    listener.onClick(cityListData);
//                }
//            });
//        }


    }
}
