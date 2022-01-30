package com.example.lab2;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterClass extends  RecyclerView.Adapter<MyAdapterClass.Myadapterviewholder>{
    private Context context;
    List<ModelName>modelNameList;
    public MyAdapterClass(Context context, List<ModelName> modelNameList) {
        this.context = context;
        this.modelNameList = modelNameList;
    }


    @NonNull
    @Override
    public Myadapterviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cardlayouts,parent,false);
        return new Myadapterviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapterviewholder holder, int position) {
        holder.textView.setText(modelNameList.get(position).getName());
        holder.textView.setText(String.valueOf(modelNameList.get(position).getNumber()));


    }

    @Override
    public int getItemCount() {
        return modelNameList.size();
    }

    public class Myadapterviewholder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView textView;
        private  TextView textView1;
        private ImageView imageView;

        public Myadapterviewholder(@NonNull View itemView) {


            super(itemView);
            cardView = itemView.findViewById(R.id.card);
            textView = itemView.findViewById(R.id.textviewid);
            textView1 = itemView.findViewById(R.id.numberviewid);
            imageView = itemView.findViewById(R.id.img);

        }
    }
}
