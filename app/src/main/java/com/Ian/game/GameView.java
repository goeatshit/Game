package com.Ian.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
  private  int posX , posY = 300;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        if (posX > 0 && posX < getWidth()-200) {
            this.posX = posX;
        }
    }
    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if (posY > 0 && posY < getHeight()-200) {
            this.posY = posY;
        }
    }

    @Override
    protected void onDraw(Canvas can) {
        super.onDraw(can);
        Paint p = new Paint();
        can.drawLine(500,0,0,500,p);
        Bitmap bit = BitmapFactory.decodeResource(getResources(),R.drawable.spiral);
        can.drawBitmap(bit,posX,posY,p);
        p.setARGB(0,255,255,0);
    }

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
