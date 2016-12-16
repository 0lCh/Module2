package game.my.com.example.myapplication;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import static game.my.com.example.myapplication.Drawable.k;


public abstract class Figure {
    Vector pos;
    Vector velocity;
    Paint paint;
    float size;


    Figure(float posX, float posY) {
        pos = new Vector(posX, posY);
        paint = new Paint();
        velocity = new Vector((float) Math.random() * 0.5f - 0.25f, (float) Math.random() * 0.5f - 0.25f);
    }

    Figure(float posX, float posY, float size) {
        pos = new Vector(posX, posY);
        paint = new Paint();
        this.size = size;
        RectF rect = new RectF(pos.x, pos.y,
                pos.x + size, pos.y + size * k);
        velocity = new Vector((float) Math.random() * 0.5f - 0.25f, (float) Math.random() * 0.5f - 0.25f);
    }


    abstract void draw(Canvas canvas);

    void move() {
        pos.sum(velocity);
    }

}
