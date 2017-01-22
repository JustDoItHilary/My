package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LinearLayout linearLayout=new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams.gravity= Gravity.CENTER_VERTICAL;
        linearLayout.setLayoutParams(layoutParams);

        LinearLayout.LayoutParams layoutParams1=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams1.gravity=Gravity.CENTER_HORIZONTAL;
        TextView textView=new TextView(this);
        textView.setLayoutParams(layoutParams1);
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Integer[] integersList=list1.toArray(new Integer[0]);
        String string="";
        for (Integer i:integersList){
            string=string+String.valueOf(i);
        }
        Log.e("list-integer",string);
        List<String> list2=new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        String[] stringList= list2.toArray(new String[0]);
        String string2="";
        for (int i=0;i<stringList.length;i++){
            string2=string2+stringList[i];
        }
        Log.e("list-string",string2);

        Integer[] integers={1,2,3};
        List<Integer> list3= Arrays.asList(integers);
        Log.e("javaintegerList",list3.toString());
        String[] strings={"a","s","d"};
        List<String> list4=Arrays.asList(strings);
        Log.e("javaintegerList",list4.toString());

        String str="asd";
        char[] chars=str.toCharArray();
        String string3="";
        for (int i=0;i<chars.length;i++){
            string3=string3+chars[i];
        }
        Log.e("javaintegerList",string3);

        char[] chars1={'a','s','d'};
        String string4= String.valueOf(chars1);

        String string5="time:20:08";
        int index=string5.lastIndexOf(":");
        Log.e("javaintegerList",String.valueOf(index));

        String string6="aSdFgHjK";
        Log.e("javaintegerList",string6.toLowerCase());
        Log.e("javaintegerList",string6.toUpperCase());
        Log.e("javaintegerList",String.valueOf(string6.endsWith("K")));


        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy:MM:dd HH:mm");
        String date=simpleDateFormat.format("2008年10月08号11时50分");
        Log.e("javaintegerList",date);

        textView.setText("HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA");
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(dip2px(this,20));
        linearLayout.addView(textView);
        setContentView(linearLayout);

    }

    private static int dip2px(Context context,int dpValue){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dpValue*scale+0.5f);
    }
}
