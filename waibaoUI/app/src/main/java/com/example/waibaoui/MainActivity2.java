package com.example.waibaoui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SearchView;

public class MainActivity2 extends AppCompatActivity {
    private SearchView searchview;
    private RelativeLayout relativelayout_1;
    private RelativeLayout relativeLayout_2;
    private RelativeLayout relativeLayout_3;
    private RelativeLayout relativeLayout_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //隐藏标题栏dddd
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        searchview = (SearchView)findViewById(R.id.searchview);

        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        relativelayout_1 = (RelativeLayout)findViewById(R.id.relativelayout_1);
        relativeLayout_2 = (RelativeLayout)findViewById(R.id.relativelayout_2);
        relativeLayout_3 = (RelativeLayout)findViewById(R.id.relativelayout_3);
        relativeLayout_4 = (RelativeLayout)findViewById(R.id.relativelayout_4);

        relativelayout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,SettingActivity.class);
                startActivity(intent);
            }
        });

        relativeLayout_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,SettingActivity.class);
                startActivity(intent);
            }
        });

        relativeLayout_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,SettingActivity.class);
                startActivity(intent);
            }
        });

        relativeLayout_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,SettingActivity.class);
                startActivity(intent);
            }
        });

    }
}
