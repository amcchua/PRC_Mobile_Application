package com.example.prcmobileapp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        WebView webView = (WebView) findViewById(R.id.web_view_main);
        webView.loadUrl("https://www.digitalmonitoringsystem.online/");  // Url of portal is passed
        webView.requestFocus();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewController());
    }
}
