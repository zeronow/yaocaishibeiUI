package com.example.waibaoui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EncyclopediaActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encyclopediapage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//返回

        actionBar.setTitle("中药百科");

        webView = (WebView)findViewById(R.id.webview);

        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        //webView.loadUrl("https://www.baidu.com/");
        //webView.loadUrl("http://www.zhongyoo.com/name/");
        webView.loadUrl("https://baike.baidu.com/item/%E4%B8%AD%E8%8D%AF/295975?fr=aladdin");
    }
}
