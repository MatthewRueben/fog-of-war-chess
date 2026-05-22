package edu.up.fowc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class FOWC_View extends SurfaceView {
    public FOWC_View(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);

        setBackgroundColor(Color.WHITE);  //better than black default
    }
}
