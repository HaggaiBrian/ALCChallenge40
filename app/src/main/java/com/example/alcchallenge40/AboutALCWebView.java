package com.example.alcchallenge40;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCWebView extends Activity {

    private WebView ALCWebView;
    String url = "https://andela.com/alc/";

    @SuppressLint("SetJavaScriptEnabled")
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alcweb_view);

        WebView ALCWebView=(WebView) findViewById(R.id.ALCWebView);
        ALCWebView.getSettings().setJavaScriptEnabled(true);
        ALCWebView.getSettings().setBuiltInZoomControls(true);
        ALCWebView.getSettings().setDomStorageEnabled(true);
        ALCWebView.setWebViewClient(new SSLTolerentWebViewClient());
        ALCWebView.loadUrl(url);
    }
    private class SSLTolerentWebViewClient extends WebViewClient {
    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // Ignore SSL certificate errors
        }
    }
    @Override
    public void onBackPressed(){
        if (ALCWebView != null && ALCWebView.canGoBack()){
            ALCWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
