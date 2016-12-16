package game.my.com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.provider.ContactsContract;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class MyView extends View implements SeekBar.OnSeekBarChangeListener {
    private Paint paint = new Paint();
    private Figure[] f = new Figure[100];
    protected Square sq = new Square(300, 300);
    protected int color = Color.GREEN;


    protected MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        int h = 0;
        for (int i = 0; i < 20; i++) {
            if (h == 3) h = 0;
            h++;
            if (h == 1)
                f[i] = new Square((float) Math.random() * 500, (float) Math.random() * 500);
            if (h == 2)
                f[i] = new Circle((float) Math.random() * 500, (float) Math.random() * 500);
            if (h == 3)
                f[i] = new Triangle((float) Math.random() * 500, (float) Math.random() * 500);
        }


    }

    protected MyView(Context context) {
        super(context);
    }

    protected MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


    protected void onDraw(Canvas canvas) {

        canvas.drawColor(color);

        for (Figure fig : f) {
            if (fig != null) {
                if (fig instanceof Drawable) ((Drawable) fig).draw(canvas);
                if (fig instanceof Figure) ((Figure) fig).move();
            }

        }
        sq.move();

        invalidate();

        ((Drawable) sq).draw(canvas);


    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        sq.size = progress;
        for (int i = 0; i < 20; i++) {
            {
                if (f[i] instanceof Square) ((Square) f[i]).size = progress;
            }
        }

    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void setData(ContactsContract.Contacts.Data data) {

    }

}

