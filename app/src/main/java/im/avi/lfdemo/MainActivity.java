package im.avi.lfdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import im.avi.littlefinger.LittleFinger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LittleFinger.start(this, "https://your-heroku-app.herokuapp.com/status");
    }
}
