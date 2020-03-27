package com.example.mysubmission.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mysubmission.Act_details;
import com.example.mysubmission.R;
import com.example.mysubmission.model.KomponenDasar;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class AdapterKomponen extends RecyclerView.Adapter<AdapterKomponen.ViewHolder> {
    Context context;
    LayoutInflater mInflater;
    private List<KomponenDasar> komponenList;

    public AdapterKomponen(Context context, List<KomponenDasar> komponenList) {
        this.context = context;
        this.komponenList = komponenList;
        mInflater = LayoutInflater.from(context);
    }


    //tampilan 1 list
    //tampilan looping
    //memanggil tampilan xml
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.all_list, viewGroup, false);
        AdapterKomponen.ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    //memanggil data untuk looping
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        final String title = komponenList.get(i).getNamaKomponen();
        final int gambar = komponenList.get(i).getGambarKomponen();


        holder.tv_nama.setText(title);
        Picasso.get().load(gambar).into(holder.iv_komponen);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context, Act_details.class);
                it.putExtra("NAMA", title);
                context.startActivity(it);
            }
        });

    }

    // penjelasan xml
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_nama;
        CircleImageView iv_komponen;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_nama = (TextView) itemView.findViewById(R.id.tv_nama);
            iv_komponen = (CircleImageView) itemView.findViewById(R.id.iv_foto);

        }
    }

    //total data ditampilan
    @Override
    public int getItemCount() {
        return komponenList.size();
    }
}
