package com.sunnyweather.android.util.dkplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;

public class YJstandardController extends StandardVideoController {
    private Boolean doubleTap = false;

    public YJstandardController(@NonNull Context context, LifecycleOwner lifecycleOwner) {
        super(context);
        this.lifecycleOwner = lifecycleOwner;
    }

    public YJstandardController(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public YJstandardController(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLockStateChanged(boolean isLocked) {
        doubleTap = isLocked;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        if (!doubleTap) {
            toggleFullScreen();
        }
        return true;
    }

    public void changeFullScreen() {
        toggleFullScreen();
    }
}
