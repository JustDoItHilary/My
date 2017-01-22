package com.example.testrecyclerviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.View.VISIBLE;

/**
 * Created by Administrator on 2016/10/13.
 *
 */

public class MySurfaceViewActivity extends Activity {

    private SurfaceView mSurface;
    private LinearLayout mLayout;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_surfaceview);


        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int line=textView.getLineCount();
        Layout layout=textView.getLayout();
        if (layout.getEllipsisCount(line-1)>0){
//            mShowImage.setVisibility(VISIBLE);
        }

    }
}
