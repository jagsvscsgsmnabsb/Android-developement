package com.example.practice_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleContactAdapter extends RecyclerView.Adapter<RecycleContactAdapter.ViewHolder>


{
    private RecycleContactAdapter.ViewHolder ViewHolder;

    public RecycleContactAdapter(ArrayList<Contactmodel> arraycontact) {
    }

    public RecycleContactAdapter(MainActivity mainActivity, ArrayList<Contactmodel> arraycontact) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view =  LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        RecyclerContactAdapter.ViewHolder viewHolder = new RecyclerContactAdapter.ViewHolder(view) ;
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

