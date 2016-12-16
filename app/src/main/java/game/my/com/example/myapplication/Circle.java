package game.my.com.example.myapplication;

import android.graphics.Canvas;


public class Circle extends Figure implements Drawable {
     Circle(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(pos.x, pos.y, (float) 20, paint);


    }
}
