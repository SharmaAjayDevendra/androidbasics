package in.autodice.androidlecture;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Runnable work=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        };

        Handler handler=new Handler();
        handler.postDelayed(work, 5000);
    }
}
