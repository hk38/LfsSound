package lit.amida.lfssound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumPlayer = MediaPlayer.create(applicationContext, R.raw.drum_sound)
        val pianoPlayer = MediaPlayer.create(applicationContext, R.raw.piano_sound)
        val guitarPlayer = MediaPlayer.create(applicationContext, R.raw.guitar_sound)

        imageDrum.setOnTouchListener { _, motionEvent ->
            when(motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    imageDrum.setImageResource(R.drawable.drum_playing_image)
                    drumPlayer.seekTo(0)
                    drumPlayer.start()
                    true
                }
                else ->{
                    imageDrum.setImageResource(R.drawable.drum_image)
                    true
                }
            }
        }

        imageGuitar.setOnTouchListener{_, motionEvent ->
            when(motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    imageGuitar.setImageResource(R.drawable.guitar_playing_image)
                    guitarPlayer.seekTo(0)
                    guitarPlayer.start()
                    true
                }
                else ->{
                    imageGuitar.setImageResource(R.drawable.guitar_image)
                    true
                }
            }
        }


        imagePiano.setOnTouchListener { _, motionEvent ->
            when(motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    imagePiano.setImageResource(R.drawable.piano_playing_image)
                    pianoPlayer.seekTo(0)
                    pianoPlayer.start()
                    true
                }
                else -> {
                    imagePiano.setImageResource(R.drawable.piano_image)
                    true
                }
            }
        }


    }
}