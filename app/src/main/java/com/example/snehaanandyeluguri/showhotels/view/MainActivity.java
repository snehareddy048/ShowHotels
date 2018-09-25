package com.example.snehaanandyeluguri.showhotels.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.snehaanandyeluguri.showhotels.R;
import com.example.snehaanandyeluguri.showhotels.models.CityListData;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{

    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        renderView();
        init();
    }

    public void init(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void renderView(){
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progress);
        recyclerView=findViewById(R.id.list);
    }

    @Override
    public void removeProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showError(String errorMessage) {
        Toast.makeText(MainActivity.this,errorMessage,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInformation(List<CityListData> cityListDataList) {

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }
}
