package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/9/26.
 */

public class MySecView extends View {

    public MySecView(Context context) {
        super(context);
    }

    public MySecView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MySecView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#ffffcc"));

        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(3);
        paint.setTextSize(80);

        Paint.FontMetricsInt fmi = paint.getFontMetricsInt();

        String testString = "测试：ijkJQKA:1234";

        float width=canvas.getWidth();
        float height=canvas.getHeight();
        float left=this.getLeft();
        float right=this.getRight();
        float top=this.getTop();
        float bottom=this.getBottom();
        float tTop=fmi.top;
        float tBottom=fmi.bottom;
        float ascent=fmi.ascent;
        float descent=fmi.descent;
        float tH=bottom-top;
        // 随意设一个位置作为baseline
        int x = 200;
        int y = 1000;
        // 把testString画在baseline上
        canvas.drawText(testString, x, y, paint);

        // baseline
        paint.setColor(Color.RED);
        canvas.drawLine(x, y, 1024, y, paint);
        // ascent
        paint.setColor(Color.YELLOW);
        canvas.drawLine(x, y+fmi.ascent, 1024, y+fmi.ascent, paint);
        // descent
        paint.setColor(Color.BLUE);
        canvas.drawLine(x, y+fmi.descent, 1024, y+fmi.descent, paint);
        // top
        paint.setColor(Color.DKGRAY);
        canvas.drawLine(x, y+fmi.top, 1024, y+fmi.top, paint);
        // bottom
        paint.setColor(Color.GREEN);
        canvas.drawLine(x, y+fmi.bottom, 1024, y+fmi.bottom, paint);
    }
}
