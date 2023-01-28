package com.dev.android.dnews;

import com.dev.android.dnews.Models.NewsHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{

    void onFetchData(List<NewsHeadLines> list,String message);
    void onError(String message);
}


