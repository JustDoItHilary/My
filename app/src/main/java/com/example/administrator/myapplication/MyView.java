package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/9/26.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        canvas.drawColor(Color.parseColor("#ffffcc"));
//
//        Paint paint = new Paint();
//        paint.setTextAlign(Paint.Align.CENTER);
//        paint.setStrokeWidth(3);
//        paint.setTextSize(80);
//
//        Paint.FontMetricsInt fmi = paint.getFontMetricsInt();
//
//        String testString = "测试：ijkJQKA:1234";
//
//        float width=canvas.getWidth();
//        float height=canvas.getHeight();
//        float left=this.getLeft();
//        float right=this.getRight();
//        float top=this.getTop();
//        float bottom=this.getBottom();
//        float tTop=fmi.top;
//        float tBottom=fmi.bottom;
//        float ascent=fmi.ascent;
//        float descent=fmi.descent;
//        float tH=bottom-top;
//        // 随意设一个位置作为baseline
//        float x = width/2;
//        float y = (top+bottom)/2;
//        // 把testString画在baseline上
//        canvas.drawText(testString, x, y, paint);
//
//        // baseline
//        paint.setColor(Color.RED);
//        canvas.drawLine(left, y, right, y, paint);
//        // ascent
//        paint.setColor(Color.YELLOW);
//        canvas.drawLine(x, y + fmi.ascent, 1024, y + fmi.ascent, paint);
//        Log.e("fmi.ascent", String.valueOf(fmi.ascent));
//        // descent
//        paint.setColor(Color.BLUE);
//        canvas.drawLine(x, y + fmi.descent, 1024, y + fmi.descent, paint);
//        Log.e("fmi.dscent", String.valueOf(fmi.descent));
//        // top
//        paint.setColor(Color.DKGRAY);
//        canvas.drawLine(x, y + fmi.top, 1024, y + fmi.top, paint);
//        Log.e("fmi.top", String.valueOf(fmi.top));
//        // bottom
//        paint.setColor(Color.GREEN);
//        canvas.drawLine(x, y + fmi.bottom, 1024, y + fmi.bottom, paint);
//        Log.e("fmi.bottom", String.valueOf(fmi.bottom));
//    }

@Override
protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    Paint paint = new Paint();
//    paint.setTextAlign(Paint.Align.CENTER);
    paint.setStrokeWidth(3);
    paint.setTextSize(80);

    Paint.FontMetricsInt fmi = paint.getFontMetricsInt();

    String testString = "测试：ijkJQKA:1234";

    int tTop=fmi.top;
    int tBottom=fmi.bottom;
    float ascent=fmi.ascent;
    float descent=fmi.descent;
    float tH=tBottom-tTop;

    // 随意设一个位置作为baseline
    int x = 0;
    int y = 400;

    Rect rect=new Rect(0,y+tTop,1024,y+tBottom);
    paint.setColor(Color.CYAN);
    canvas.drawRect(rect,paint);

    float height=rect.bottom-rect.top;
    float baseline=height-(height-tH)/2-tBottom;

    // 把testString画在baseline上
    paint.setColor(Color.BLACK);
//    canvas.drawText(testString, x, y, paint);
    canvas.drawText(testString,x,y-descent/2,paint);

//    // baseline
//    paint.setColor(Color.RED);
//    canvas.drawLine(x, y, 1024, y, paint);
//    canvas.drawLine(x,y,x,1024,paint);
//
//    paint.setColor(Color.parseColor("#ff33cc"));
//    canvas.drawLine(x,y+tTop+tH/2,1024,y+tTop+tH/2,paint);
//
//    // ascent
//    paint.setColor(Color.YELLOW);
//    canvas.drawLine(x, y+fmi.ascent, 1024, y+fmi.ascent, paint);
//
//    // descent
//    paint.setColor(Color.BLUE);
//    canvas.drawLine(x, y+fmi.descent, 1024, y+fmi.descent, paint);
//    // top
//    paint.setColor(Color.DKGRAY);
//    canvas.drawLine(x, y+fmi.top, 1024, y+fmi.top, paint);
//    // bottom
//    paint.setColor(Color.GREEN);
//    canvas.drawLine(x, y+fmi.bottom, 1024, y+fmi.bottom, paint);

//    float baseline=(rect.top+rect.bottom-tBottom-tTop)/2;
//    canvas.drawText(testString,rect.centerX(),baseline,paint);
}
}
