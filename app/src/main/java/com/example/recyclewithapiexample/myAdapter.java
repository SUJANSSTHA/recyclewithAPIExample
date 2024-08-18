package com.example.recyclewithapiexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    //creating Construction
    ArrayList<Contact>list;
    ContactApp activity;
    public myAdapter(ContactApp activity,ArrayList<Contact>list){
        this.activity = activity;
        this.list = list;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(activity);

        View v = inflater.inflate(R.layout.recycle_item,parent,false);
        myViewHolder vh = new myViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
    Contact c = list.get(position);
        holder.txtId.setText(String.valueOf(c.getId() ));
        holder.txtName.setText(c.getName());
        holder.txtPhone.setText(c.getPhone());


        holder.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override

    //list size of all item
    public int getItemCount() {

        return list.size();
    }
}
