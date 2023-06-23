package edu.monash.fit2081.countryinfo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class WebWiki extends AppCompatActivity {

    public static final String EXTRA_COUNTRY_NAME = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_wiki);
        getSupportActionBar().setTitle("Wikipedia Details");

        String countryName = getIntent().getStringExtra(EXTRA_COUNTRY_NAME); //pass the country name

        // Load the Wikipedia page for the selected country in the WebView
        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://en.wikipedia.org/wiki/" + countryName); // append with the wikipedia url
    }
}
