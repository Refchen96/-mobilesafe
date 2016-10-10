package com.itheima.mobilesafe74.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class FocusTextView extends TextView {

	public FocusTextView(Context context) {
		super(context);
		
	}
	public FocusTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
	}
     //系统调用 带属性 带主题的方法
	public FocusTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
	}
	//获取焦点的方法
    @Override
    public boolean isFocused() {
    	
    	return true;
    }
}
