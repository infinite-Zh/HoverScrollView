package com.infinite.scroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/**
 * Created by 19082 on 2016/6/23.
 */
public class HoverScrollView extends ScrollView {

    public HoverScrollView(Context context) {
        super(context);
    }

    public HoverScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HoverScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        int userDetail2Top = Math.max(mTargetView.getTop(), t);
        mHoverView.layout(0, userDetail2Top, mHoverView.getWidth(), userDetail2Top + mHoverView.getHeight());
    }

    private View mTargetView, mHoverView;

    public void setTargetAndHoverView(View targetView, View hoverView) {
        mTargetView = targetView;
        mHoverView = hoverView;
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
//                scrollBy(0, getScrollY());
                onScrollChanged(0,0,0,0);
            }
        });
    }
}
