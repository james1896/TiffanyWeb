package com.tiffany.tiffanyweb;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by moses on 07/07/2017.
 */

public class WebViewClientBase extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub
        return super.shouldOverrideUrlLoading(view, url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        // TODO Auto-generated method stub
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO Auto-generated method stub
        super.onPageFinished(view, url);
    }

    @Override
    public void onReceivedError(WebView view, int errorCode,
                                String description, String failingUrl) {
        // TODO Auto-generated method stub
        super.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override
    public void doUpdateVisitedHistory(WebView view, String url,
                                       boolean isReload) {
        // TODO Auto-generated method stub
        super.doUpdateVisitedHistory(view, url, isReload);
    }
}

