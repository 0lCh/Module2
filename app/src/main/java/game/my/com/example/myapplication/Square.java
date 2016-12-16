package game.my.com.example.myapplication;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class Square extends Figure implements Drawable {
    float size;

    Square(float posX, float posY) {
        super(posX, posY);
        size = 50;
        paint = new Paint();

    }


    protected Square(float x, float y, float size) {
        super(x, y, size);
    }

    @Override
    public void draw(Canvas canvas) {
        paint.setColor(Color.WHITE);

        canvas.drawRect(pos.x, pos.y, pos.x + size, pos.y + size, paint);
    }

}
