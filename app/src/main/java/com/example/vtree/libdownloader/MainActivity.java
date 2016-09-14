package com.example.vtree.libdownloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liulishuo.filedownloader.FileDownloader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FileDownloader.init(getApplicationContext());
    }
    private void startDownload(String url){
        FileDownloader.getImpl().create(url);
    }
}
