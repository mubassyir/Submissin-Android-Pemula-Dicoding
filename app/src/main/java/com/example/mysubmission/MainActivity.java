package com.example.mysubmission;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mysubmission.adapter.AdapterKomponen;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
    //LIST
    RecyclerView rv_komponen;
    //adapter list
    TextView title;
    RecyclerView.Adapter Adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbarTop);

        title = (TextView) findViewById(R.id.toolbar_title);
        title.setText("KOMPONEN DASAR");


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        context = this;

        //menampilkan list
        rv_komponen = findViewById(R.id.rv_komponen);
        rv_komponen.setEnabled(true);
        rv_komponen.setFocusable(false);
        rv_komponen.setLayoutManager(new LinearLayoutManager(context));

        dataKomponen();

    }

    //menu profile
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        final MenuItem item = menu.findItem(R.id.about);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            Intent it = new Intent(context, Act_about.class);
            context.startActivity(it);
        }
        return true;
    }

    //menampilkan semua data > untuk menampilkam list
    //as looping
    private void dataKomponen() {
        Adapter = new AdapterKomponen(context, All_data.allKomponen());
        rv_komponen.setAdapter(Adapter);

    }
}
