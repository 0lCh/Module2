package game.my.com.example.myapplication;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.sip.SipAudioCall;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import static game.my.com.example.myapplication.R.id.bkcolor;
import static game.my.com.example.myapplication.R.id.seekBar;
import static game.my.com.example.myapplication.R.id.text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        final MyView myView = (MyView) findViewById(R.id.view2);
        seekBar.setOnSeekBarChangeListener(myView);
        Button b = (Button) findViewById(R.id.bkcolor);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        View.OnClickListener onClickListener = new View.OnClickListener() {


            @Override
            public void onClick(final View v) {
                myView.color = (Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            }
        };
        b.setOnClickListener(onClickListener);
        View.OnClickListener onCl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.sq.velocity.sum(0.5f, 0f);
            }
        };
        b2.setOnClickListener(onCl);
        View.OnClickListener onCl1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.sq.velocity.min(0.5f, 0f);
            }
        };
        b3.setOnClickListener(onCl1);

    }
}
