package com.infinite.scroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private HoverScrollView mScrollView;
    private RelativeLayout mUserDetail;
    private RelativeLayout mHoverDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar= (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("历史上的今天");
        setSupportActionBar(mToolbar);
        initViews();
    }

    private void initViews(){
        mScrollView= (HoverScrollView) findViewById(R.id.scrollview);
        mUserDetail= (RelativeLayout) findViewById(R.id.content_layout);
        mHoverDetail= (RelativeLayout) findViewById(R.id.hover_layout);
        mScrollView.setTargetAndHoverView(mUserDetail,mHoverDetail);
    }


}
