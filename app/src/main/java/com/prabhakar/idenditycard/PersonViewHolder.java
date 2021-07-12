package com.prabhakar.idenditycard;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView profession;
    private TextView age;
    private TextView companyName;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }


    private void initView(View itemView) {
        img = itemView.findViewById(R.id.userPhoto);
        age = itemView.findViewById(R.id.age);
        companyName = itemView.findViewById(R.id.companyName);
        profession = itemView.findViewById(R.id.profession);
    }

    public void setData(PersonModel model) {
        img.setImageResource(model.getImg());
        age.setText(model.getAge());
        companyName.setText(model.getCompanyName());
        profession.setText(model.getProfession());

    }
}
