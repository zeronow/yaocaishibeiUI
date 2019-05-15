package com.example.waibaoui;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView image_1;
    private ImageView image_2;
    private ImageView image_3;

    private TextView text_1;//该图片最大的预测结果是：XXX
    private TextView text_2;//另外两种可能性是：XXX和XXX

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //修改text_1和text_2的内容
        /*
        *
        *
        * */

//        顶部返回按钮
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        image_1 = (ImageView)findViewById(R.id.image_first);
        image_2 = (ImageView)findViewById(R.id.image_second);
        image_3 = (ImageView)findViewById(R.id.image_third);


        image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FirstResult.class);
                startActivity(intent);

            }
        });

        image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FirstResult.class);
                startActivity(intent);

            }
        });

        image_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FirstResult.class);
                startActivity(intent);

            }
        });



    }
}
