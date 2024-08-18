package com.example.recyclewithapiexample;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


//custom viewholder
public class myViewHolder extends RecyclerView.ViewHolder {
    TextView txtId,txtName,txtPhone;
    Button btnEdit,btnDelete;
    public myViewHolder(@NonNull View v) {
        super(v);
        txtId = v.findViewById(R.id.txtId);
        txtName = v.findViewById(R.id.txtName);
        txtPhone = v.findViewById(R.id.txtPhone);

    }
}
