package fr.stanislas.morse_project;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class experiencedActivity extends AppCompatActivity implements View.OnTouchListener {

    private Button sending;
    public MediaPlayer experiencedsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experienced);

        experiencedsound =  MediaPlayer.create(experiencedActivity.this, R.raw.experiencedmorse);

        sending = findViewById(R.id.button_sending);
        sending.setOnTouchListener(this);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN://when the button is clicked
                        if (!experiencedsound.isPlaying()){
                            experiencedsound.start();//start media player
                            experiencedsound.setLooping(true);
                    }


                break;


            case MotionEvent.ACTION_UP://release the button
                experiencedsound.pause();//stop the media player
                break;

        }
        return false;
    }
}

