package com.tiffany.tiffanyweb;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.webview);

        webview.loadUrl("http://miniyd.net");
        webview.setWebViewClient(new WebViewClientBase());
    }

}


