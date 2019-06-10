package com.gaia.infinity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

class Maid extends View{
    Paint p;
    Mover move;

    public Maid(Context context){
       super(context);
       move = new Mover(this);
       p = new Paint();
        Timer t = new Timer();
        t.schedule(move,10,33);

    }



    public void onDraw(Canvas canvas){
        p.setColor(Color.RED);
        canvas.drawRect(move.myx,100,move.myx+300,300,p);
    }


}