package com.dev.android.dnews;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.android.dnews.Models.NewsHeadLines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadLines headLines;
    TextView text_title,text_author,text_time,text_detail,text_content;
    ImageView  img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        text_title=findViewById(R.id.text_detail_title);
        text_author=findViewById(R.id.text_detail_author);
        text_time=findViewById(R.id.text_detail_time);
        text_detail=findViewById(R.id.text_detail_detail);
        text_content=findViewById(R.id.text_detail_content);
        img_news=findViewById(R.id.img_detail_news);



        headLines= (NewsHeadLines) getIntent().getSerializableExtra("data");

        text_title.setText(headLines.getTitle());
        text_author.setText(headLines.getAuthor());
        text_time.setText(headLines.getPublishedAt());
        text_detail.setText(headLines.getDescription());
        text_content.setText(headLines.getContent());
        Picasso.get().load(headLines.getUrlToImage()).into(img_news);

    }
}