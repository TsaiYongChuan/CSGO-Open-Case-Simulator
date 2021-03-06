package com.zerlings.gabeisfaker.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by smzh369 on 2017/2/16.
 */

public class WeaponItemDecoration extends RecyclerView.ItemDecoration {

    private int space;

    public WeaponItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        if(parent.getChildLayoutPosition(view) != 0){
            outRect.left = space;
        }
    }
}

