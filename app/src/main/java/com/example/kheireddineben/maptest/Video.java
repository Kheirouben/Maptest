package com.example.kheireddineben.maptest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.example.kheireddineben.maptest.R;
import com.google.android.gms.maps.MapFragment;


public class Video extends Fragment {

    public WebView mWebView;
    EditText urlinput;
    Button okbutton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_video, container, false);

        mWebView = (WebView) v.findViewById(R.id.webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setUseWideViewPort(true);
        // mWebView.setWebViewClient(new WebViewClient());
        urlinput = (EditText)v.findViewById(R.id.editText);
        okbutton = (Button) v.findViewById(R.id.button);

        if (okbutton != null)
            okbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mWebView.setWebViewClient(new WebViewClient());
                    mWebView.loadUrl("http://"+urlinput.getText().toString());
                }
            });



        //return inflater.inflate(R.layout.fragment_video, container, false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Fragment fragment = (Fragment) getChildFragmentManager().findFragmentById(R.id.webView);
        //fragment.getMapAsync(this);
    }
    public Video() {
        // Required empty public constructor
    }
}
