package com.prabhakar.idenditycard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<PersonModel> personList;

    public PersonAdapter(ArrayList<PersonModel> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        PersonModel person = personList.get(position);
        holder.setData(person);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}

