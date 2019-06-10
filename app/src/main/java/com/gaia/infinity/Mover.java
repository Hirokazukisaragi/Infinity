package com.gaia.infinity;

import android.content.Context;
import android.view.View;

import java.util.TimerTask;

class Mover extends TimerTask {
    public int myx,myy;
    public Maid maid;
    boolean rflag,lflag;
    public Mover(Maid m) {
        myx = 300;
        myy = 300;
        maid = m;
        rflag = false;
        lflag = true;
    }
    @Override
    public void run() {
        if (lflag == true) {
            myx+=4;
            maid.postInvalidate();
            if(myx >= 1000){
                lflag=false;
                rflag = true;
            }
        }else
        if (rflag == true) {
            myx-=4;
            maid.postInvalidate();
            if (myx <= 0) {
                lflag = true;
                rflag = false;
            }
        }
    }
}
