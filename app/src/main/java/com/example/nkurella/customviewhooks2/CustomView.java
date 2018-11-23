package com.example.nkurella.customviewhooks2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    private void init(@Nullable AttributeSet attributeSet){

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Paint p=new Paint(Paint.ANTI_ALIAS_FLAG);

        p.setColor(Color.MAGENTA);
        Rect r=new Rect();
        r.left=0;
        r.right=getWidth();
        r.top=0;
        r.bottom=getHeight();

        canvas.drawRect(r,p);

    }
}
