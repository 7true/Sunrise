package tk.alltrue.sunrise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sunImageView = (ImageView) findViewById(R.id.sun);

        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sunrise);

        sunImageView.startAnimation(sunRiseAnimation);

        ImageView clockImageView = (ImageView) findViewById(R.id.clock);
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);

        ImageView hourImageView = (ImageView) findViewById(R.id.hour_arrow);
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        hourImageView.startAnimation(hourTurnAnimation);
    }
}
