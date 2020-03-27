package com.example.mysubmission;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.mysubmission.adapter.AdapterKomponen;
import com.example.mysubmission.model.KomponenDasar;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Act_details extends AppCompatActivity {

    Context context;
    //LIST
    String nama;

    TextView tv_nama, tv_details;
    CircleImageView iv_circle;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_details);

        context = this;
        tv_nama = findViewById(R.id.tvNama);
        tv_details = findViewById(R.id.tvDetails);
        iv_circle = findViewById(R.id.iv_gambar);

        //diambil dari adapter aktiviti sebelumnya
        nama = getIntent().getStringExtra("NAMA");

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbarTop);

        title = (TextView) findViewById(R.id.toolbar_title);
        title.setText(nama);
        //set display home menampilkan menu back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //support tombol
        getSupportActionBar().setHomeButtonEnabled(true);
        //title
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        context = this;

        dataDetails();
    }

    private void dataDetails() {

        List<KomponenDasar> komponenDasarList = All_data.allKomponen();
        for (int i = 0; i < komponenDasarList.size(); i++) {
            if (komponenDasarList.get(i).getNamaKomponen().equals(nama)) {
                tv_details.setText(komponenDasarList.get(i).getDetailKomponen());
                tv_nama.setText(komponenDasarList.get(i).getNamaKomponen());
                Picasso.get().load(komponenDasarList.get(i).getGambarKomponen()).into(iv_circle);
            }

        }
    }

    //tombol back
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
