package game.my.com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;


public class Triangle extends Figure implements Drawable {
    Triangle(float posX, float posY) {
        super(posX, posY);
    }


    @Override
    public void draw(Canvas canvas) {
        Paint mPaint = new Paint();

        Path mPath = new Path();

        mPath.reset();
        mPaint.setColor(Color.RED);
        mPath.moveTo(pos.x, pos.y);
        mPath.lineTo(pos.x + 30, pos.y + 60);
        mPath.lineTo(pos.x - 30, pos.y + 60);

        mPath.close();
        mPaint.setStyle(Paint.Style.FILL);


        canvas.drawPath(mPath, mPaint);
    }
}
