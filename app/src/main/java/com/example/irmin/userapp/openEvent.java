package com.example.irmin.userapp;

import android.content.Intent;
import android.media.tv.TvContentRating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class openEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_open_event2);

        Intent intent = getIntent();

        TextView title = (TextView) findViewById(R.id.title2);
        TextView content = (TextView) findViewById(R.id.content2);
        TextView amount = (TextView)  findViewById(R.id.amount2);
        TextView cate = (TextView) findViewById(R.id.category2);
        TextView tel = (TextView) findViewById(R.id.tel2);
        TextView add = (TextView) findViewById(R.id.add2);


        title.setText(intent.getStringExtra("title2"));
        content.setText(intent.getStringExtra("content2"));
        amount.setText(intent.getStringExtra("amount2"));
        cate.setText(intent.getStringExtra("cate2"));
        tel.setText(intent.getStringExtra("tel2"));
        add.setText(intent.getStringExtra("add2"));
        }

    public void click(View view) {

        ImageView img = (ImageView) findViewById(R.id.imgView);

        if(img.getVisibility() == view.GONE){
            img.setVisibility(view.VISIBLE);
        }

    }
}
