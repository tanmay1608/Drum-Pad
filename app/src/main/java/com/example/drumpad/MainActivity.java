package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1,sound2,sound3,snare,clap,sound00,soundnew,sound2new,bongo;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private int sound4,flute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);




        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(2)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        }
        sound1=soundPool.load(getApplicationContext(),R.raw.sound1,1);
        sound2=soundPool.load(getApplicationContext(),R.raw.sound2,1);
        sound3=soundPool.load(getApplicationContext(),R.raw.high,1);
        sound4=soundPool.load(getApplicationContext(),R.raw.cymbal,1);
        snare=soundPool.load(getApplicationContext(),R.raw.snare,1);
       // flute=soundPool.load(getApplicationContext(),R.raw.flute,1);
        //  clap=soundPool.load(getApplicationContext(),R.raw.clap,1);
        sound00=soundPool.load(getApplicationContext(),R.raw.sound00,1);
        soundnew=soundPool.load(getApplicationContext(),R.raw.sound1new,1);
        sound2new=soundPool.load(getApplicationContext(),R.raw.sound2new,1);
        bongo=soundPool.load(getApplicationContext(),R.raw.sound_bongo,1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  linearLayout.setBackgroundColor(Color.parseColor("#1DDDF2"));


                soundPool.play(sound00,1.0f,1.0f,0,0,7f);



                //  sound1.start();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // linearLayout.setBackgroundColor(Color.parseColor("#F29F05"));
                soundPool.play(soundnew,1.0f,1.0f,0,0,7f);
                // sound2.start();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   linearLayout.setBackgroundColor(Color.parseColor("#E0C4F2"));
                soundPool.play(sound2new,1.0f,1.0f,0,0,7f);

                // sound3.start();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // linearLayout.setBackgroundColor(Color.parseColor("#8FD9CB"));
                soundPool.play(sound2,1.0f,1.0f,0,0,1f);
                // sound4.start();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // linearLayout.setBackgroundColor(Color.parseColor("#D4D943"));

                soundPool.play(sound1,1.0f,1.0f,0,0,1f);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // linearLayout.setBackgroundColor(Color.parseColor("#1DDDF2"));


                soundPool.play(sound3,1.0f,1.0f,0,0,1f);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   linearLayout.setBackgroundColor(Color.parseColor("#F29F05"));

                soundPool.play(snare,1.0f,1.0f,0,0,1f);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // linearLayout.setBackgroundColor(Color.parseColor("#E0C4F2"));
                soundPool.play(bongo,1.0f,1.0f,0,0,1f);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   view.setBackgroundResource(R.color.colorAccent);

                soundPool.play(sound4,1.0f,1.0f,0,0,1f);
                //  linearLayout.setBackgroundColor(Color.parseColor("#8FD9CB"));
            }
        });




    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool=null;

    }


}
