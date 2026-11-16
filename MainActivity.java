package com.mymoneymanager.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.view.View;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().getDecorView().setSystemUiVisibility(0);
    WebView web = new WebView(this);
    web.setBackgroundColor(0xFFF3F6FB);
    WebSettings settings = web.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    settings.setAllowContentAccess(false);
    web.setWebViewClient(new WebViewClient());
    setContentView(web);
    web.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}
